package com.vad.fibonacci

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField

class MainViewModel : ViewModel() {

    private var f1:Long  = 1
    private var f = f1
    val text = ObservableField<String>()

    fun next() {
        val tempF = f1
        f1 = f
        f = f1 + tempF
        var data = "$f = $f1 + $tempF"
        text.set(data)
    }
}

