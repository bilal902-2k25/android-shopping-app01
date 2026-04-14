package com.example.digitalclock.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.digitalclock.model.TimeZoneItem
import com.example.digitalclock.ui.theme.ClockCardBorder
import com.example.digitalclock.ui.theme.ClockPrimary
import com.example.digitalclock.ui.theme.ClockSubtext
import com.example.digitalclock.ui.theme.ClockSurface
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

private val cardTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")
private val cardDateFormatter = DateTimeFormatter.ofPattern("EEE, MMM d")
private val cardZoneFormatter = DateTimeFormatter.ofPattern("zzz")

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TimeZoneCard(
    item: TimeZoneItem,
    zonedTime: ZonedDateTime,
    onRemove: () -> Unit,
    modifier: Modifier = Modifier
) {
    var showRemoveDialog by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .combinedClickable(
                onClick = {},
                onLongClick = { showRemoveDialog = true }
            ),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = ClockSurface),
        border = BorderStroke(1.dp, ClockCardBorder)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = item.flagEmoji,
                fontSize = 28.sp,
                modifier = Modifier.padding(end = 12.dp)
            )

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = item.cityName,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = zonedTime.format(cardZoneFormatter) + " • " + zonedTime.format(cardDateFormatter),
                    style = MaterialTheme.typography.bodyMedium,
                    color = ClockSubtext
                )
            }

            Text(
                text = zonedTime.format(cardTimeFormatter),
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = ClockPrimary
            )
        }
    }

    if (showRemoveDialog) {
        AlertDialog(
            onDismissRequest = { showRemoveDialog = false },
            title = { Text("Remove ${item.cityName}?") },
            text = { Text("Do you want to remove ${item.cityName} from your world clocks?") },
            confirmButton = {
                TextButton(onClick = {
                    showRemoveDialog = false
                    onRemove()
                }) {
                    Text("Remove", color = MaterialTheme.colorScheme.error)
                }
            },
            dismissButton = {
                TextButton(onClick = { showRemoveDialog = false }) {
                    Text("Cancel")
                }
            },
            containerColor = ClockSurface
        )
    }
}
