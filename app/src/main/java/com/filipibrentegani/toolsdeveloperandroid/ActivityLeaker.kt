package com.filipibrentegani.toolsdeveloperandroid

import android.app.Activity
import android.view.View

object ActivityLeaker {
    var referenceToLeak: Activity? = null
    val leakedViews = mutableListOf<View>()
}