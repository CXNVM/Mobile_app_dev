package com.example.lab3.ui.theme.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.annotation.SuppressLint
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import com.example.lab3.R
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @ExperimentalPagerApi
    //@ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@ExperimentalPagerApi
@Composable
//Содержимое Pager'а
/*PagerState хранит pageCount - количество страниц, currentPage - номер текущей страницы,
    currentPageOffset - смещение текущей страницы (0.0 to 1.0)
    Чаще всего в rememberPagerState задается количество страниц
    */
fun TabsContent(tabs: List<TabItem>, pagerState: PagerState) {
    // Pager для горизоантального скролла
    HorizontalPager(state = pagerState) { page ->
        //получаем номер страницы и выполняем метод screen для объекта класса TabItem
        //выполняется и отображается(если есть @Preview) соответствующая composable функция
        tabs[page].screen()
    }
}

@ExperimentalPagerApi
//@ExperimentalMaterialApi
@Composable
fun Tabs(tabs: List<TabItem>, pagerState: PagerState) {
    //Корутины в Kotlin - это способ организации и структурирования кода, который позволяет избежать
    // повторения одних и тех же действий в разных частях программы. У корутин есть свои особенности,
    // например, они позволяют использовать асинхронный код и уменьшают нагрузку на процессор.
    val scope = rememberCoroutineScope()
    // OR ScrollableTabRow()
    TabRow(
        // индекс текущей вкладки
        selectedTabIndex = pagerState.currentPage,
        // цвет фона
        backgroundColor = colorResource(id = R.color.purple_200),
        // цвет содержимого
        contentColor = Color.White,
        // отображает какая выбрана вкладка
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                 /*Данная функция синхронизирует TabRow и HorizontalPager
                 Если по умолчанию индикатор сдвигается только при полном отбражении страницы,
                то при использовании данной функции индикатор синхронизируется с атрибутом
                        pagerStare.currentPageOffset, задающим расстояние от 0.0 до 1.0*/
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions)
            )
        }) {
        tabs.forEachIndexed { index, tab ->
            // OR Tab()
            LeadingIconTab(
                icon = { Icon(painter = painterResource(id = tab.icon), contentDescription = "") },
                text = { Text(tab.title) },
                // подсветка активной вкладки
                selected = pagerState.currentPage == index,
                onClick = {
                    /*без этого параметра очевидно при нажатии на вкладку ничего не проиходит.
                    Здесь же при нажатии на вкладку происходит анимация скрола индикатора
                    Можно задать смещение pageOffset и скорость initialVelocity
                    */
                        scope.launch {
                        pagerState.animateScrollToPage(index, initialVelocity = 0.7f)
                    }
                },
            )
        }
    }
}

@Composable
fun TopBar() {
    // Верхняя панель
    TopAppBar(
        // Что отображается на панели. Надпись, размер шрифта
        title = { Text(text = stringResource(R.string.app_name), fontSize = 18.sp) },
        // Цвет фона
        backgroundColor = colorResource(id = R.color.purple_200),
        // Цвет содержимого
        contentColor = Color.White
    )
}

@Composable
fun LoginScreen() {
    //by - обеспечивается, делегирование setter и
    //MutableStateOf используется для изменения состояние, а также обновление пользовательского интерфейсф,
    //При изменении объекта MutableState будет
    // инициироваться перекомпозицию(пересоздание) для обновления пользовательского интерфейса.
    var user_name by remember { mutableStateOf("") }
    var user_password by remember { mutableStateOf("") }

    // Обычный контейнер
    Box(
        modifier = Modifier
            //растяжение контейнера во весь экран
            .fillMaxSize()
            //цвет фона
            .background(colorResource(id = R.color.purple_200)),
        // задает расположение, вложенных в него объектов по Центру
        contentAlignment = Alignment.Center,

        ) {
        // Настройка, вложенных компонентов вертикально упорядоченно
        Column(
            // Отступы со всех сторон
            modifier = Modifier.padding(30.dp),
            // Горизовнтальное вырвнивание дочерних элементов
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Icon(
                // какой рисунок
                imageVector = Icons.Filled.AccountBox,
                // описание рисунка
                contentDescription = "Login icon",
                // заливка тонирование оттенок, применяемый к imageVector
                tint = Color.White,
                // размер рисунка
                modifier = Modifier.size(60.dp)
            )
            // Текст
            Text(
                // Сам текст
                text = "Авторизация",
                // Цвет символов
                color = Color.White,
                // Стиль текста h6/Roboto
                style = MaterialTheme.typography.h6
            )
            // пространство между объектами
            Spacer(modifier = Modifier.height(20.dp))
            // заполняемое текстовое поле
            TextField(
                // текст отображаемый внутри
                value = user_name,
                // стиль внутреннего текста
                textStyle = TextStyle(color = Color.White),
                // обновление вводимого текста, обновленный текст поступает в качестве параметра
                onValueChange = { user_name = it },
                // надпись над полем и ее цвет
                label = { Text("Имя пользователя", color = Color.White) },
                // заполнение на всю ширину родителя, указанную внутри ф-ции
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(14.dp))
            TextField(
                value = user_password,
                textStyle = TextStyle(color = Color.White),
                onValueChange = { user_password = it },
                label = { Text("Пароль",  color = Color.White) },
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.height(20.dp))
            // кнопкка
            Button(
                // заполнение пространства
                modifier = Modifier.fillMaxWidth(),
                // значения по умолчанию для кнопки - цвет фона и цвет содержимого. В данном случае RGB
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(255,127,80), contentColor = Color.White),
                // обработчик нажатия кнопки
                onClick = {},
            ) {
                Text(text = "Войти")
            }
        }
    }
}

@Composable
fun RegistrationScreen() {
    var phonenum by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var repeatPassword by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.purple_200)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Filled.Person,
                contentDescription = "Registration icon",
                tint = Color.White,
                modifier = Modifier.size(60.dp)
            )
            Text(
                text = "Регистрация",
                color = Color.White,
                style = MaterialTheme.typography.h6
            )
            Spacer(modifier = Modifier.height(20.dp))
            TextField(
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                value = phonenum,
                textStyle = TextStyle(color = Color.White),
                onValueChange = { phonenum = it },
                label = { Text("Номер телефона", color = Color.White,) },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(14.dp))
            TextField(
                value = username,
                textStyle = TextStyle(color = Color.White),
                onValueChange = { username = it },
                label = { Text("Имя пользователя", color = Color.White,) },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(14.dp))
            TextField(
                value = password,
                // стиль внутреннего текста
                textStyle = TextStyle(color = Color.White),
                // обновление вводимого текста, обновленный текст поступает в качестве параметра
                onValueChange = { password = it },
                label = { Text("Пароль", color = Color.White,) },
                modifier = Modifier.fillMaxWidth(),
                // преобразование вводимых символов в звездочки или точки
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.height(14.dp))
            TextField(
                value = repeatPassword,
                textStyle = TextStyle(color = Color.White),
                onValueChange = { repeatPassword = it },
                label = { Text("Повторите пароль", color = Color.White,) },
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(255,127,80), contentColor = Color.White),
                onClick = {}
            ) {
                Text("Зарегистрироваться")
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@ExperimentalPagerApi
//@ExperimentalMaterialApi
@Composable
fun MainScreen() {
    val tabs = listOf(TabItem.Login, TabItem.Register)
    val pagerState = rememberPagerState(pageCount = tabs.size)
    Scaffold(
        topBar = { TopBar() },
    ) {
        Column {
            Tabs(tabs = tabs, pagerState = pagerState)
            TabsContent(tabs = tabs, pagerState = pagerState)
        }
    }
}

/*@ExperimentalPagerApi
@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}*/

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar()
}

@ExperimentalMaterialApi
@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun TabsContentPreview() {
    val tabs = listOf(
        TabItem.Login,
        TabItem.Register,
    )
   /* В переменную передается количество страниц, также по дефолту выставляются отстальные параметры,
    один из которых initialPage = 0 - номер страницы при инициализации
            (страница с каким номером отображается при запуске pager)*/
    val pagerState = rememberPagerState(pageCount = tabs.size)
    TabsContent(tabs = tabs, pagerState = pagerState)
/*    println(pagerState.pageCount)
    println(pagerState.currentPage)
    println(pagerState.currentPageOffset)*/
}

@ExperimentalMaterialApi
@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun TabsPreview() {
    val tabs = listOf(
        TabItem.Login,
        TabItem.Register
    )
    /*PagerState хранит pageCount - количество страниц, currentPage - номер текущей страницы,
    currentPageOffset - смещение текущей страниц (0.0 to 1.0)*/
    val pagerState = rememberPagerState(pageCount = tabs.size)
    // Задаем лист и состояние пейджера
    Tabs(tabs = tabs, pagerState = pagerState)
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}

@Preview(showBackground = true)
@Composable
fun RegistrationScreenPreview() {
    RegistrationScreen()
}