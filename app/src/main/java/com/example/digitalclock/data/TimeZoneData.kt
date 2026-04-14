package com.example.digitalclock.data

import com.example.digitalclock.model.TimeZoneItem
import java.time.ZoneId

val defaultTimeZones: List<TimeZoneItem> = listOf(
    TimeZoneItem("UTC", "UTC", "🌍", ZoneId.of("UTC")),
    TimeZoneItem("America/New_York", "New York", "🗽", ZoneId.of("America/New_York")),
    TimeZoneItem("Europe/London", "London", "🇬🇧", ZoneId.of("Europe/London")),
    TimeZoneItem("Asia/Dubai", "Dubai", "🇦🇪", ZoneId.of("Asia/Dubai")),
    TimeZoneItem("Asia/Kolkata", "India", "🇮🇳", ZoneId.of("Asia/Kolkata")),
    TimeZoneItem("Asia/Tokyo", "Tokyo", "🇯🇵", ZoneId.of("Asia/Tokyo")),
    TimeZoneItem("Australia/Sydney", "Sydney", "🇦🇺", ZoneId.of("Australia/Sydney")),
    TimeZoneItem("America/Sao_Paulo", "São Paulo", "🇧🇷", ZoneId.of("America/Sao_Paulo")),
    TimeZoneItem("America/Los_Angeles", "Los Angeles", "🇺🇸", ZoneId.of("America/Los_Angeles")),
    TimeZoneItem("Asia/Shanghai", "Shanghai", "🇨🇳", ZoneId.of("Asia/Shanghai")),
)

val allAvailableTimeZones: List<TimeZoneItem> = listOf(
    TimeZoneItem("UTC", "UTC", "🌍", ZoneId.of("UTC")),
    TimeZoneItem("America/New_York", "New York", "🗽", ZoneId.of("America/New_York")),
    TimeZoneItem("Europe/London", "London", "🇬🇧", ZoneId.of("Europe/London")),
    TimeZoneItem("Asia/Dubai", "Dubai", "🇦🇪", ZoneId.of("Asia/Dubai")),
    TimeZoneItem("Asia/Kolkata", "India", "🇮🇳", ZoneId.of("Asia/Kolkata")),
    TimeZoneItem("Asia/Tokyo", "Tokyo", "🇯🇵", ZoneId.of("Asia/Tokyo")),
    TimeZoneItem("Australia/Sydney", "Sydney", "🇦🇺", ZoneId.of("Australia/Sydney")),
    TimeZoneItem("America/Sao_Paulo", "São Paulo", "🇧🇷", ZoneId.of("America/Sao_Paulo")),
    TimeZoneItem("America/Los_Angeles", "Los Angeles", "🇺🇸", ZoneId.of("America/Los_Angeles")),
    TimeZoneItem("Asia/Shanghai", "Shanghai", "🇨🇳", ZoneId.of("Asia/Shanghai")),
    TimeZoneItem("Europe/Paris", "Paris", "🇫🇷", ZoneId.of("Europe/Paris")),
    TimeZoneItem("Europe/Berlin", "Berlin", "🇩🇪", ZoneId.of("Europe/Berlin")),
    TimeZoneItem("Asia/Seoul", "Seoul", "🇰🇷", ZoneId.of("Asia/Seoul")),
    TimeZoneItem("Asia/Singapore", "Singapore", "🇸🇬", ZoneId.of("Asia/Singapore")),
    TimeZoneItem("America/Chicago", "Chicago", "🌆", ZoneId.of("America/Chicago")),
    TimeZoneItem("America/Denver", "Denver", "🏔️", ZoneId.of("America/Denver")),
    TimeZoneItem("Pacific/Auckland", "Auckland", "🇳🇿", ZoneId.of("Pacific/Auckland")),
    TimeZoneItem("Asia/Bangkok", "Bangkok", "🇹🇭", ZoneId.of("Asia/Bangkok")),
    TimeZoneItem("Africa/Cairo", "Cairo", "🇪🇬", ZoneId.of("Africa/Cairo")),
    TimeZoneItem("America/Toronto", "Toronto", "🍁", ZoneId.of("America/Toronto")),
    TimeZoneItem("Europe/Moscow", "Moscow", "🇷🇺", ZoneId.of("Europe/Moscow")),
    TimeZoneItem("Asia/Karachi", "Karachi", "🇵🇰", ZoneId.of("Asia/Karachi")),
    TimeZoneItem("Asia/Jakarta", "Jakarta", "🇮🇩", ZoneId.of("Asia/Jakarta")),
    TimeZoneItem("America/Mexico_City", "Mexico City", "🇲🇽", ZoneId.of("America/Mexico_City")),
    TimeZoneItem("Europe/Rome", "Rome", "🇮🇹", ZoneId.of("Europe/Rome")),
)
