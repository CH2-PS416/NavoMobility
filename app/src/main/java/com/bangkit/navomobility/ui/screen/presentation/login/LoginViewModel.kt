package com.bangkit.navomobility.ui.screen.presentation.login

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.bangkit.navomobility.ui.screen.presentation.signup.UIEvent

class LoginViewModel() : ViewModel(){

    private var TAG = LoginViewModel::class.simpleName
    private var loginUIState = mutableStateOf(LoginUIState())

    fun onEvent(event: UIEvent) {
        when (event) {
            is UIEvent.EmailChanged -> {
                loginUIState.value = loginUIState.value.copy(
                    email = event.email
                )
                printState()
            }
            is UIEvent.PasswordChanged -> {
                loginUIState.value = loginUIState.value.copy(
                    password = event.password
                )
                printState()
            }
            is UIEvent.LoginButtonClicked -> {
                register()
            }

            else -> {}
        }
    }

    private fun register() {
        Log.d(TAG, "inside_login")
        printState()
    }

    private fun printState() {
        Log.d(TAG, "inside_printState")
        Log.d(TAG, loginUIState.value.toString())
    }
}