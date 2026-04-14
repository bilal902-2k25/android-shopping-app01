package com.example.digitalclock

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.digitalclock.ui.ClockScreen
import com.example.digitalclock.ui.theme.DigitalClockTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DigitalClockTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ClockScreen()
                }
            }
        }
    }
}
