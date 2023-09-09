package br.com.hellodev.permissionscompose.presenter.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(
    navigateSinglePermission: () -> Unit,
    navigateMultiplePermission: () -> Unit,
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            onClick = {
                navigateSinglePermission()
            },
            content = {
                Text(text = "Single permission")
            }
        )

        Button(
            onClick = {
                navigateMultiplePermission()
            },
            content = {
                Text(text = "Multiple permissions")
            }
        )

    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        navigateSinglePermission = {},
        navigateMultiplePermission = {}
    )
}