package com.example.fruity

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fruity.ui.theme.FruityTheme

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier
){

}

@Preview (showBackground = true, backgroundColor = 0XFFFFFFFF)
@Composable
fun WelcomeScreenPreview(){
    FruityTheme {
        WelcomeScreen()
    }
}