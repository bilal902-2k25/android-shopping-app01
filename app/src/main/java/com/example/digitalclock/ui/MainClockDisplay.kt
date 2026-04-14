package com.example.digitalclock.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.digitalclock.ui.theme.ClockOnSurface
import com.example.digitalclock.ui.theme.ClockPrimary
import com.example.digitalclock.ui.theme.ClockSubtext
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

private val timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")
private val dateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy")
private val zoneFormatter = DateTimeFormatter.ofPattern("zzz")

@Composable
fun MainClockDisplay(
    currentTime: ZonedDateTime,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "LOCAL TIME",
            style = MaterialTheme.typography.labelLarge,
            color = ClockSubtext,
            letterSpacing = 3.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = currentTime.format(timeFormatter),
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            fontSize = 72.sp,
            color = ClockPrimary,
            letterSpacing = 4.sp
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = currentTime.format(dateFormatter),
            style = MaterialTheme.typography.bodyLarge,
            color = ClockOnSurface
        )

        Text(
            text = currentTime.format(zoneFormatter),
            style = MaterialTheme.typography.bodyMedium,
            color = ClockSubtext
        )
    }
}
