package br.com.hellodev.permissionscompose.navigation

sealed class NavigationScreen(var route: String) {
    object HomeScreen :NavigationScreen("home_screen")
    object SinglePermissionScreen :NavigationScreen("single_permission_screen")
    object MultiplePermissionScreen :NavigationScreen("multiple_permission_screen")
}
