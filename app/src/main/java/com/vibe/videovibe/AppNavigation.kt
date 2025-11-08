package com.vibe.videovibe

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.vibe.videovibe.components.BaseScreen


sealed class Screen(val route: String) {
    object Home : Screen("Home")
    object Setting : Screen("Setting")
}

enum class AppRoute(
    val label: String,
    val icon: ImageVector,
) {
    HOME("Home", Icons.Default.Home),
    FAVORITES("Favorites", Icons.Default.Favorite),
    PROFILE("Profile", Icons.Default.AccountBox),
}

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    BaseScreen {

    }
}