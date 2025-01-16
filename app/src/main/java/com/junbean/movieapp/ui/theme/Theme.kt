package com.junbean.movieapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.junbean.movieapp.ui.theme.color.ColorSet

private val LocalColors = staticCompositionLocalOf { ColorSet.Red.LightColors }

@Composable
fun MovieAppTheme(
    myColors: ColorSet,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        darkTheme -> myColors.LightColors
        else -> myColors.DarkColors
    }

    // 테마 사용시 좀더 확장을 위해서
    CompositionLocalProvider(LocalColors provides colorScheme ) {

    }

    MaterialTheme(
        colorScheme = colorScheme.material,
        typography = Typography,
        content = content
    )
}