package com.example.digitalclock.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.digitalclock.data.defaultTimeZones
import com.example.digitalclock.model.TimeZoneItem
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.time.ZonedDateTime

class ClockViewModel : ViewModel() {

    private val _currentTime = MutableStateFlow(ZonedDateTime.now())
    val currentTime: StateFlow<ZonedDateTime> = _currentTime.asStateFlow()

    private val _timeZones = MutableStateFlow(defaultTimeZones)
    val timeZones: StateFlow<List<TimeZoneItem>> = _timeZones.asStateFlow()

    init {
        viewModelScope.launch {
            while (true) {
                _currentTime.value = ZonedDateTime.now()
                delay(1000)
            }
        }
    }

    fun addTimeZone(item: TimeZoneItem) {
        val current = _timeZones.value
        if (current.none { it.id == item.id }) {
            _timeZones.value = current + item
        }
    }

    fun removeTimeZone(id: String) {
        _timeZones.value = _timeZones.value.filter { it.id != id }
    }
}
