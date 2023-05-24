package com.cxmv.lab4

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.cxmv.lab4.datastore.PreferencesManager
import com.cxmv.lab4.usecases.JwtService

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {
    private val preferencesManager: PreferencesManager
    private val jwtService: JwtService

    init {
        preferencesManager = PreferencesManager(application)
        jwtService = JwtService()
    }

    fun getUserId(): Int? {
        val accessToken = preferencesManager.getAccessToken()
        val refreshToken = preferencesManager.getRefreshToken()
        val userId: String? = jwtService.checkTokens(
            accessToken = accessToken,
            refreshToken = refreshToken,
            preferencesManager = preferencesManager
        )
        return userId?.toInt()
    }
}