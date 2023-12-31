package com.bangkit.navomobility.ui.screen.allscreen.homescreen

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Bookmark
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun HomeScreen() {
}

enum class HomeTabs(
    val title: String,
    val icon: ImageVector,
    val route: String
) {
    FEED("Feed", Icons.Rounded.Home, "home/feed"),
    SEARCH("Search", Icons.Rounded.Search, "home/search"),
    BOOKMARK("Bookmark", Icons.Rounded.Bookmark, "home/bookmark"),
    PROFILE("Profile", Icons.Rounded.Person, "home/profile")
}

fun NavGraphBuilder.addHomeGraph(
    navController: NavController,
    navToPlaceDetail: () -> Unit,
    modifier: Modifier = Modifier
) {
    composable(HomeTabs.FEED.route) {
        Feed(
            navToPlaceDetail = navToPlaceDetail,
            navToSearch = { navController.navigate(HomeTabs.SEARCH.route) },
            navToProfile = { navController.navigate(HomeTabs.PROFILE.route) },
            modifier = modifier
        )
    }
    composable(HomeTabs.SEARCH.route) {

        Search(
            pressBack = { navController.navigateUp() },
            navToPlaceDetail = navToPlaceDetail,
            modifier = modifier
        )
    }
    composable(HomeTabs.BOOKMARK.route) {
        Bookmark(navBack = { navController.navigateUp() }, modifier)
    }
    composable(HomeTabs.PROFILE.route) {
        Profile(navBack = { navController.navigateUp() }, modifier)
    }
}

@Composable
fun TravelAppBottomBar(
    navController: NavHostController,
    tabs: Array<HomeTabs>
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
        ?: HomeTabs.FEED.route

    val routes = remember { HomeTabs.values().map { it.route } }

    if (currentRoute in routes) {
        BottomNavigation(backgroundColor = MaterialTheme.colors.surface) {
            tabs.forEach { tab ->
                BottomNavigationItem(
                    icon = { Icon(imageVector = tab.icon, contentDescription = tab.title) },
                    label = { androidx.compose.material.Text(text = tab.title) },
                    selected = currentRoute == tab.route,
                    onClick = {
                        if (currentRoute != tab.route) {
                            navController.navigate(tab.route)
                        }
                    },
                    alwaysShowLabel = false
                )
            }
        }
    }
}
