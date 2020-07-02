package com.filipibrentegani.toolsdeveloperandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_leak.*

class LeakActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leak)
        ActivityLeaker.referenceToLeak = this
        val app = application as ExampleApplication
        app.leakedViews.add(leakedView)
    }
}
