package br.com.hellodev.permissionscompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.hellodev.permissionscompose.presenter.home.HomeScreen
import br.com.hellodev.permissionscompose.presenter.multiple.MultiplePermissionsScreen
import br.com.hellodev.permissionscompose.presenter.single.SinglePermissionScreen

@Composable
fun NavigationHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavigationScreen.HomeScreen.route) {
        composable(
            route = NavigationScreen.HomeScreen.route,
            content = {
                HomeScreen(
                    navigateSinglePermission = {
                        navController.navigate(NavigationScreen.SinglePermissionScreen.route)
                    },
                    navigateMultiplePermission = {
                        navController.navigate(NavigationScreen.MultiplePermissionScreen.route)
                    }
                )
            }
        )

        composable(
            route = NavigationScreen.SinglePermissionScreen.route,
            content = {
                SinglePermissionScreen(
                    onBackPressed = {
                        navController.popBackStack()
                    }
                )
            }
        )

        composable(
            route = NavigationScreen.MultiplePermissionScreen.route,
            content = {
                MultiplePermissionsScreen(
                    onBackPressed = {
                        navController.popBackStack()
                    }
                )
            }
        )
    }
}