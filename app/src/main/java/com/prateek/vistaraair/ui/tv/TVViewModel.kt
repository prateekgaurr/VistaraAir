package com.prateek.vistaraair.ui.tv

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TVViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is TV Fragment"
    }
    val text: LiveData<String> = _text
}