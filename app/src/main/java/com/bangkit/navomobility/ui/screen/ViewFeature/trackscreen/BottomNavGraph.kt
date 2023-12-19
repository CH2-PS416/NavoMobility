package com.bangkit.navomobility.ui.screen.ViewFeature.trackscreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.bangkit.navomobility.ui.screen.ViewFeature.trackscreen.JalanScreen.JalanScreen
import com.bangkit.navomobility.ui.screen.ViewFeature.trackscreen.historyscreen.HistoryScreen
import com.bangkit.navomobility.ui.screen.ViewFeature.trackscreen.homescreen.HomeScreen
import com.bangkit.navomobility.ui.screen.ViewFeature.trackscreen.profile.ProfileScreen

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
            ProfileScreen()
        }

    }
}