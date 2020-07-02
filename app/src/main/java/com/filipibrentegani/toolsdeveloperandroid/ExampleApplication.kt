package com.filipibrentegani.toolsdeveloperandroid

import android.app.Application
import android.os.StrictMode
import android.view.View
import leakcanary.LeakCanary

open class ExampleApplication : Application() {
    val leakedViews = mutableListOf<View>()

    override fun onCreate() {
        super.onCreate()
        enabledStrictMode()
        updateLeakCanaryState()
    }

    private fun enabledStrictMode() {
        StrictMode.setThreadPolicy(
            StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .penaltyDeath()
                .build()
        )
    }

    private fun updateLeakCanaryState() {
        var CanaryEnable = true
        LeakCanary.config = LeakCanary.config.copy(dumpHeap = CanaryEnable)
    }
}