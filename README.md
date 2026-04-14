# Digital Clock App ⏰

An Android application that displays the current time in multiple time zones with a stylish dark-themed UI built with Jetpack Compose.

## Features

- 🕐 **Hero Clock** — Large digital clock showing local time (HH:MM:SS), updated every second
- 🌍 **World Clocks** — Scrollable list of clocks for 10+ time zones including UTC, New York, London, Dubai, India, Tokyo, Sydney, São Paulo, Los Angeles, and Shanghai
- ➕ **Add Time Zones** — FAB to add new time zones from a predefined list
- ❌ **Remove Time Zones** — Long-press any card to remove it
- 🌑 **Dark Theme** — Dark background with neon cyan accent color

## Screenshots

The app features a main clock at the top and scrollable world clock cards below:
- Each card shows: flag emoji, city name, time zone abbreviation, current time, and current date
- Dark background (`#121212`) with cyan (`#00E5FF`) accent colors
- Monospace font for clock digits

## Tech Stack

| Component | Technology |
|-----------|-----------|
| Language | Kotlin |
| UI | Jetpack Compose |
| Architecture | MVVM |
| Build System | Gradle (Kotlin DSL) |
| Design | Material 3 |
| Min SDK | 24 (Android 7.0) |
| Target SDK | 34 (Android 14) |

## Project Structure

```
app/src/main/java/com/example/digitalclock/
├── MainActivity.kt
├── ClockApplication.kt
├── data/
│   └── TimeZoneData.kt          # predefined list of time zones
├── model/
│   └── TimeZoneItem.kt          # data class
├── ui/
│   ├── theme/
│   │   ├── Color.kt
│   │   ├── Theme.kt
│   │   └── Type.kt
│   ├── ClockScreen.kt           # main composable screen
│   ├── MainClockDisplay.kt      # hero clock composable
│   ├── TimeZoneCard.kt          # individual tz card composable
│   └── AddTimeZoneDialog.kt     # dialog to add tz
└── viewmodel/
    └── ClockViewModel.kt        # manages time updates + tz list
```

## How to Build and Run

### Prerequisites
- Android Studio Hedgehog (2023.1.1) or newer
- JDK 8 or higher
- Android SDK with API level 24+

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/bilal902-2k25/android-shopping-app01.git
   ```
2. Open the project in Android Studio
3. Wait for Gradle sync to complete
4. Run on an emulator or physical device (API 24+):
   - Click **Run ▶** or press `Shift+F10`

### Build from command line
```bash
./gradlew assembleDebug
```
The APK will be at `app/build/outputs/apk/debug/app-debug.apk`.

## Time Zones Included (Default)

| Flag | City | Time Zone ID |
|------|------|-------------|
| 🌍 | UTC | UTC |
| 🗽 | New York | America/New_York |
| 🇬🇧 | London | Europe/London |
| 🇦🇪 | Dubai | Asia/Dubai |
| 🇮🇳 | India | Asia/Kolkata |
| 🇯🇵 | Tokyo | Asia/Tokyo |
| 🇦🇺 | Sydney | Australia/Sydney |
| 🇧🇷 | São Paulo | America/Sao_Paulo |
| 🇺🇸 | Los Angeles | America/Los_Angeles |
| 🇨🇳 | Shanghai | Asia/Shanghai |

## License

This project is open source and available under the MIT License.

