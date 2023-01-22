package com.example.fruity

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fruity.ui.theme.AppOrange
import com.example.fruity.ui.theme.FruityTheme
import com.example.fruity.ui.theme.openSans
import kotlin.text.Typography

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(all = 15.dp)
    ) {
        Image(
            contentScale = ContentScale.Fit,
            painter = painterResource(id = R.drawable.women_shopping),
            contentDescription = null
        )

        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp, vertical = 15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            Text(
                stringResource(id = R.string.welcome_text),
                fontWeight = FontWeight.Bold,
                fontFamily = openSans,
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                modifier = modifier
            )
            Text(
                stringResource(id = R.string.welcome_text_small),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
            Button(
                onClick = { /*TODO*/ },
                modifier = modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(30.dp)),
                elevation = ButtonDefaults.elevation(0.dp,0.dp),
                contentPadding = PaddingValues(horizontal = 30.dp, vertical = 20.dp)
            ) {
                Text(
                    stringResource(id = R.string.welcome_button),
                    fontSize = 20.sp
                )
            }
        }
    }
}

@Preview (showBackground = true, backgroundColor = 0XFFFFFFFF)
@Composable
fun WelcomeScreenPreview(){
    FruityTheme {
        WelcomeScreen()
    }
}