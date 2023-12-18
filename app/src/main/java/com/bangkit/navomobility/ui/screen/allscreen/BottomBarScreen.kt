package com.bangkit.navomobility.ui.screen.allscreen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddLocationAlt
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route :String,
    val title :String,
    val icon :ImageVector
)
{
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Jalan : BottomBarScreen(
        route = "jalan",
        title = "Jalan",
        icon = Icons.Default.AddLocationAlt
    )

    object History : BottomBarScreen(
        route = "history",
        title = "History",
        icon = Icons.Default.History
    )

    object Profile : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )
}
