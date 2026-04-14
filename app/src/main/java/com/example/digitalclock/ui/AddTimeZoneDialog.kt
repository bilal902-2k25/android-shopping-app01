package com.example.digitalclock.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.digitalclock.data.allAvailableTimeZones
import com.example.digitalclock.model.TimeZoneItem
import com.example.digitalclock.ui.theme.ClockPrimary
import com.example.digitalclock.ui.theme.ClockSubtext
import com.example.digitalclock.ui.theme.ClockSurface

@Composable
fun AddTimeZoneDialog(
    activeZoneIds: Set<String>,
    onAdd: (TimeZoneItem) -> Unit,
    onDismiss: () -> Unit
) {
    val available = allAvailableTimeZones.filter { it.id !in activeZoneIds }

    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = ClockSurface,
        title = {
            Text(
                text = "Add Time Zone",
                color = ClockPrimary
            )
        },
        text = {
            if (available.isEmpty()) {
                Text(
                    text = "All available time zones are already added.",
                    color = ClockSubtext
                )
            } else {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 400.dp)
                ) {
                    items(available) { item ->
                        TextButton(
                            onClick = { onAdd(item) },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "${item.flagEmoji}  ${item.cityName}",
                                color = MaterialTheme.colorScheme.onSurface,
                                modifier = Modifier.weight(1f)
                            )
                        }
                        HorizontalDivider(color = ClockPrimary.copy(alpha = 0.1f))
                    }
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Cancel", color = ClockSubtext)
            }
        }
    )
}
