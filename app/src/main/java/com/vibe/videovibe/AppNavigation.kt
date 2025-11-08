package com.vibe.videovibe

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vibe.videovibe.components.BaseScreen
import com.vibe.videovibe.screens.home.HomeScreen


sealed class Screen(val route: String) {
    object Home : Screen("Home")
    object Setting : Screen("Setting")
}

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    BaseScreen {
        NavHost(navController = navController, startDestination = Screen.Home.route) {
            composable(Screen.Home.route) {
                HomeScreen()
            }
            composable(Screen.Setting.route) {
                HomeScreen()
            }
        }
    }
}