package com.bangkit.navomobility.ui.screen.signup

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class RegisterViewModel() : ViewModel(){

    private var TAG = RegisterViewModel::class.simpleName
    private var registrationUIState = mutableStateOf(RegisterUIState())

    fun onEvent(event: UIEvent) {
        when (event) {
            is UIEvent.NameChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    email = event.name
                )
                printState()
            }
            is UIEvent.EmailChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    email = event.email
                )
                printState()
            }
            is UIEvent.PasswordChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    password = event.password
                )
                printState()
            }
            is UIEvent.RegisterButtonClicked -> {
                register()
            }

            else -> {}
        }
    }

    private fun register() {
        Log.d(TAG, "inside_signUp")
        printState()
    }

    private fun printState() {
        Log.d(TAG, "inside_printState")
        Log.d(TAG, registrationUIState.value.toString())
    }
}