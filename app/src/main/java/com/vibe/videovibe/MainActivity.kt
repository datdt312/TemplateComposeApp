package com.vibe.videovibe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import com.vibe.videovibe.ui.theme.VideoVibeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VideoVibeTheme {
                VideoVibeApp()
            }
        }
    }
}

@PreviewScreenSizes
@Composable
fun VideoVibeApp() {
    AppNavigation()
}