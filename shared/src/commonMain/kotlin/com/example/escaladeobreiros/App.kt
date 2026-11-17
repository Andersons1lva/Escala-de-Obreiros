package com.example.escaladeobreiros

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.escaladeobreiros.navigation.AppNavigation
import com.example.escaladeobreiros.theme.GesobTheme

@Composable
@Preview
fun App() {
    GesobTheme {
        GesobTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                AppNavigation()
            }
        }
    }
}