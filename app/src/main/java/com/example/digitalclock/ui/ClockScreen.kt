package com.example.digitalclock.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.digitalclock.ui.theme.ClockBackground
import com.example.digitalclock.ui.theme.ClockPrimary
import com.example.digitalclock.viewmodel.ClockViewModel
import java.time.ZonedDateTime

@Composable
fun ClockScreen(
    viewModel: ClockViewModel = viewModel()
) {
    val currentTime by viewModel.currentTime.collectAsStateWithLifecycle()
    val timeZones by viewModel.timeZones.collectAsStateWithLifecycle()
    var showAddDialog by remember { mutableStateOf(false) }

    Scaffold(
        containerColor = ClockBackground,
        floatingActionButton = {
            FloatingActionButton(
                onClick = { showAddDialog = true },
                containerColor = ClockPrimary,
                contentColor = ClockBackground
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add Time Zone"
                )
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            MainClockDisplay(currentTime = currentTime)

            Spacer(modifier = Modifier.height(24.dp))

            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 16.dp),
                color = ClockPrimary.copy(alpha = 0.3f)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "World Clocks",
                style = MaterialTheme.typography.labelLarge,
                color = ClockPrimary,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            timeZones.forEach { tzItem ->
                val zonedTime: ZonedDateTime = currentTime.withZoneSameInstant(tzItem.zoneId)
                TimeZoneCard(
                    item = tzItem,
                    zonedTime = zonedTime,
                    onRemove = { viewModel.removeTimeZone(tzItem.id) },
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
                )
            }

            Spacer(modifier = Modifier.height(80.dp))
        }
    }

    if (showAddDialog) {
        AddTimeZoneDialog(
            activeZoneIds = timeZones.map { it.id }.toSet(),
            onAdd = { item ->
                viewModel.addTimeZone(item)
                showAddDialog = false
            },
            onDismiss = { showAddDialog = false }
        )
    }
}
