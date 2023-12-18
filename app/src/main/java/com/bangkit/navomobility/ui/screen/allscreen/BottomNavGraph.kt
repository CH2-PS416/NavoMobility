package com.bangkit.navomobility.ui.screen.allscreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.bangkit.navomobility.ui.screen.allscreen.JalanScreen.JalanScreen
import com.bangkit.navomobility.ui.screen.allscreen.historyscreen.HistoryScreen
import com.bangkit.navomobility.ui.screen.allscreen.homescreen.HomeScreen
import com.bangkit.navomobility.ui.screen.allscreen.profile.ProfileScreen
import com.bangkit.navomobility.ui.screen.register.RegisterViewModel

@Composable
fun BottomNavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }

        composable(route = BottomBarScreen.Jalan.route){
            JalanScreen()
        }

        composable(route = BottomBarScreen.History.route){
            HistoryScreen()
        }

        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen(
                registerViewModel = RegisterViewModel()
            )
        }

    }
}