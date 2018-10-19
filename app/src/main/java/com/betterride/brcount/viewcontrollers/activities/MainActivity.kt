package com.betterride.brcount.viewcontrollers.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var hasData = false
        val intent = if (hasData) {
            Intent(this, WelcomeActivity::class.java)
        } else {
            Intent(this, WelcomeActivity::class.java)
        }
        startActivity(intent)

    }
}
