package com.example.djweather

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timer().schedule(3000) {
            val intent = Intent(applicationContext, WebViewActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
