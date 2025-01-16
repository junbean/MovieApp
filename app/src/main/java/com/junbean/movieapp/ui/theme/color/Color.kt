package com.junbean.movieapp.ui.theme.color

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val Red200 = Color(0xFFFFAAAA)
val Red300 = Color(0xFFCC5942)
val Red400 = Color(0xFFFF5258)
val Red700 = Color(0xFFEC0000)
val Red800 = Color(0xFFAF0000)
val Red900 = Color(0xFF531F1C)
val Purple200 = Color(0xFF908499)
val Purple400 = Color(0xFF6D59FF)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF635270)
val Purple900 = Color(0xFF200833)
val Green400 = Color(0xFF55D800)
val Blue400 = Color(0xFF395DE8)
val Grey200 = Color(0xFF908499)
val Grey900 = Color(0xFF151515)
val White = Color(0xFFFFFFFF)
val Black = Color(0xFF000000)

/*
colorSet안에 sealed class의 상속을 받아서 red와 blue테마를 정의
*/
sealed class ColorSet {
    open lateinit var LightColors: MyColors
    open lateinit var DarkColors: MyColors

    data object Red: ColorSet() {
        override var LightColors = MyColors(
            material = lightColorScheme(
                primary = Red700,
                onPrimary = White,
                secondary = Purple900,
                surface = White,
                onSurface = Black,
                background = White,
                onBackground = Black,
                error = Red400
            ),
            success = Green400,
            disabledSecondary = Grey200,
            textFiledBackground = Grey200
        )

        override var DarkColors = MyColors(
            material = darkColorScheme(
                primary = Purple900,
                secondary = Purple900,
                surface = White,
                onSurface = Black,
                background = White,
                onBackground = Black,
                error = Red400,
                onPrimary = White
            )
        )
    }
}

/*
val colorScheme = lightColorScheme(
    primary = Color(0xFF6200EE),       // 기본 색상
    onPrimary = Color(0xFFFFFFFF),    // 기본 색상의 위에 표시되는 텍스트/아이콘 색상
    secondary = Color(0xFF03DAC5),    // 보조 색상
    onSecondary = Color(0xFF000000),  // 보조 색상의 위에 표시되는 텍스트/아이콘 색상
    background = Color(0xFFFFFFFF),   // 앱의 배경 색상
    onBackground = Color(0xFF000000), // 배경 색상의 위에 표시되는 텍스트/아이콘 색상
    surface = Color(0xFFFFFFFF),      // 카드, 다이얼로그 등 표면 색상
    onSurface = Color(0xFF000000),    // 표면 색상의 위에 표시되는 텍스트/아이콘 색상
    error = Color(0xFFB00020),        // 오류 색상
    onError = Color(0xFFFFFFFF)       // 오류 색상의 위에 표시되는 텍스트/아이콘 색상
)
*/