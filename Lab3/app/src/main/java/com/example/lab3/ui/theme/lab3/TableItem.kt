package com.example.lab3.ui.theme.lab3

import androidx.compose.runtime.Composable
import com.example.lab3.R
//?
// Unit эквивалентен void в java. Если функция не возвращает никакого значения - ее возвращаемый тип Unit
// Ниже задается псевдоним ComposableFun для лямбда выражения @Composable () -> Unit.
// То есть ComposableFun - тип функций @Composable без входных параметров, возвращающий тип Unit
typealias ComposableFun = @Composable () -> Unit

// класс, который позволяет ограничить иерархию классов конкретным множеством подтипов,
// каждый из которых может определять собственные свойства и функции
// Структура похожа на Enum набор значений ограничен, но может быть несколько экземпляров
sealed class TabItem(var icon: Int, var title: String, var screen: ComposableFun) {
    object Login : TabItem(R.drawable.ic_person, "Login", { LoginScreen() })
    object Register : TabItem(R.drawable.ic_person, "Register", { RegistrationScreen() })
}