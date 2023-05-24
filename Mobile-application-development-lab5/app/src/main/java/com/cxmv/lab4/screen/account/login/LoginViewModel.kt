package com.cxmv.lab4.screen.account.login

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.cxmv.lab4.database.AppDatabase
import com.cxmv.lab4.database.repo.UserRepository
import com.cxmv.lab4.datastore.PreferencesManager
import com.cxmv.lab4.types.InputResult
import com.cxmv.lab4.usecases.JwtService
import com.cxmv.lab4.usecases.Validator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LoginViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: UserRepository
    private val preferences: PreferencesManager
    private val jwtService: JwtService

    private val _fieldState =
        MutableStateFlow(FieldsState(InputResult.Initial, InputResult.Initial))
    val fieldState: StateFlow<FieldsState> = _fieldState

    private val _loginState = MutableStateFlow(LoginState.Initial)
    val loginState: StateFlow<LoginState> = _loginState

    init {
        val userDao = AppDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        preferences = PreferencesManager(application)
        jwtService = JwtService()
    }

    fun login(phoneNumber: String, password: String) {
        val phoneValidated = Validator.phoneValidate(phoneNumber)
        val passwordValidated = Validator.passwordValidate(password)
        _fieldState.value = FieldsState(phoneValidated, passwordValidated)

        if (passwordValidated == InputResult.Success && phoneValidated == InputResult.Success) {
            viewModelScope.launch(Dispatchers.IO) {
                val user = repository.getUserByPhone(phoneNumber)
                if (user != null && user.password == password) {
                    val tokens = jwtService.generateTokens(user.id!!)
                    val accessToken = tokens.first
                    val refreshToken = tokens.second
                    preferences.saveAccessToken(accessToken)
                    preferences.saveRefreshToken(refreshToken)
                    _loginState.value = LoginState.LoginSuccess
                } else {
                    _loginState.value = LoginState.LoginIncorrect
                }
            }
        }
    }
}

enum class LoginState {
    LoginSuccess,
    LoginIncorrect,
    Initial
}

data class FieldsState(
    val phoneState: InputResult,
    val passwordState: InputResult
)