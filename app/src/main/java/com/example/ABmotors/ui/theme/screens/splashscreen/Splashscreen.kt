package com.example.ABmotors.ui.theme.screens.splashscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ABmotors.R

@Composable
fun Splashscreen(navController: NavHostController){
Column(modifier = Modifier
    .fillMaxSize()
    .fillMaxSize()
    .fillMaxWidth()
    .paint(
        painterResource(id = R.drawable.splash),
        contentScale = ContentScale.FillBounds

    )) {
 Text(text = "Welcome to AB motors.We hope that you will find whatever you are looking for and we guarantee the best.")
}

}

@Preview (showBackground = true)
@Composable
fun SplashScreenPreview(){
    Splashscreen(navController = rememberNavController())

}