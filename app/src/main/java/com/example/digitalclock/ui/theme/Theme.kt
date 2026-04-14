package com.example.digitalclock.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = ClockPrimary,
    secondary = ClockSecondary,
    background = ClockBackground,
    surface = ClockSurface,
    onPrimary = ClockBackground,
    onSecondary = ClockBackground,
    onBackground = ClockOnBackground,
    onSurface = ClockOnSurface,
)

@Composable
fun DigitalClockTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = ClockTypography,
        content = content
    )
}
