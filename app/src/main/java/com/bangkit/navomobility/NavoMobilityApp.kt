package com.bangkit.navomobility

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.bangkit.navomobility.ui.navigation.NavoMobilityAppRouter
import com.bangkit.navomobility.ui.navigation.Screen
import com.bangkit.navomobility.ui.screen.login.LoginScreen
import com.bangkit.navomobility.ui.screen.presentation.onboarding.OnBoardingScreen
import com.bangkit.navomobility.ui.screen.signup.SignUpScreen

@Composable
fun NavoMobilityApp (){
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Crossfade(targetState = NavoMobilityAppRouter.currentScreen, label = "") { currentState ->
            when(currentState.value) {
                is Screen.OnBoardingScreen -> {
                    OnBoardingScreen(navigateToLogin = {})
                }
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }
                is Screen.LoginScreen -> {
                    LoginScreen()
                }
            }

        }
    }
}