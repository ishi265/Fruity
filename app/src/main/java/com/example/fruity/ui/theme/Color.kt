package com.example.fruity.ui.theme

import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val AppOrange = Color(0XFFFF6600)
val AppStrongGrey = Color(0XFFECEFF6)
val AppLightGrey = Color(0XFFF5F7FA)

private val MainTheme = lightColors(
    primary = AppOrange,
    secondary = AppStrongGrey,
    onSecondary = AppLightGrey
)