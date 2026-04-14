package com.example.digitalclock.model

import java.time.ZoneId

data class TimeZoneItem(
    val id: String,
    val cityName: String,
    val flagEmoji: String,
    val zoneId: ZoneId
)
