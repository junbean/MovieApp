package com.junbean.movieapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.junbean.movieapp.R


private val spoqaBold = FontFamily(
    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
)
private val spoqaRegular = FontFamily(
    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal)
)
private val spoqaThin = FontFamily(
    Font(R.font.spoqa_han_sans_neo_thin, FontWeight.Thin)
)

val Typography = Typography(
    // Display 계열 (가장 큰 텍스트 스타일)
    displayLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 60.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 32.sp,
    ),
    displaySmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 24.sp,
    ),

    // Headline 계열 (중간 크기의 텍스트 스타일)
    headlineLarge = TextStyle(
        fontFamily = spoqaThin,
        fontSize = 32.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 24.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp,
    ),

    // Title 계열 (작은 헤드라인 또는 타이틀 텍스트)
    titleLarge = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 18.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp,
    ),

    // Body 계열 (일반 텍스트)
    bodyLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 15.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp,
    ),

    // Label 계열 (작은 설명 또는 버튼 텍스트)
    labelLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp,
    )
)

val Typography.h5Title: TextStyle
    @Composable get() = titleLarge.copy(
        fontSize = 24.sp
    )

val Typography.dialogButton: TextStyle
    @Composable get() = labelLarge.copy(
        fontSize = 18.sp
    )

val Typography.underlinedDialogButton: TextStyle
    @Composable get() = labelLarge.copy(
        textDecoration = TextDecoration.Underline
    )

val Typography.underlinedButton: TextStyle
    @Composable get() = labelLarge.copy(
        textDecoration = TextDecoration.Underline
    )


