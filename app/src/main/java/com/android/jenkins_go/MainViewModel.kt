package com.android.jenkins_go

import android.databinding.ObservableField
import kotlin.random.Random

/**
 *   Created by Alham Wa on 2019-07-01
 */
class MainViewModel {
    val defaultText = "Hai"
    val textToShow = ObservableField(defaultText)

    fun changeDefaultText() {
        val randomText = Random(1).toString()
        textToShow.set(defaultText + randomText)
    }
}