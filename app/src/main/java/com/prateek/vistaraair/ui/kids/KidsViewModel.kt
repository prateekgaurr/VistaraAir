package com.prateek.vistaraair.ui.kids

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KidsViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Kids Fragment"
    }
    val text: LiveData<String> = _text
}