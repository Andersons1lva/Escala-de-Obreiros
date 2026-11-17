package com.example.escaladeobreiros.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.escaladeobreiros.login.ui.LoginRegister
import com.example.escaladeobreiros.login.ui.LoginScreen
import kotlinx.serialization.Serializable


@Serializable object  RotaLogin
@Serializable object RotaRegister
@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = RotaLogin
    ){
        composable<RotaLogin>{
            LoginScreen(
                onIrToRegister = {navController.navigate(RotaRegister)}
            )
        }
        composable<RotaRegister>{
            LoginRegister(
                onReturnToLogin = {navController.navigate(RotaLogin)}
            )
        }
    }
}