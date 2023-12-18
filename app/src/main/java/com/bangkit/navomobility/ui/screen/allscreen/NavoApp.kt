package com.bangkit.navomobility.ui.screen.allscreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.bangkit.navomobility.ui.screen.allscreen.homescreen.HomeTabs
import com.bangkit.navomobility.ui.screen.allscreen.homescreen.TravelAppBottomBar
import com.bangkit.navomobility.ui.theme.NavoMobilityTheme


@Composable
fun NavoApp() {
    NavoMobilityTheme {
        val tabs = remember { HomeTabs.values() }
        val navController = rememberNavController()
        Scaffold(
            bottomBar = { TravelAppBottomBar(tabs = tabs, navController = navController) }
        ) { innerPadding ->
            NavGraph(
                navController = navController,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}
