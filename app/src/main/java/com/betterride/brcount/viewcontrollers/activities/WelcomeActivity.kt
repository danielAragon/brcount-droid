package com.betterride.brcount.viewcontrollers.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.betterride.brcount.R

import kotlinx.android.synthetic.main.content_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        //setSupportActionBar(toolbar)
        //imageLogo.setImageUrl("https://raphaelbravo190813.github.io/LandingPage/img/LogoBetter.png")
        startButton.setOnClickListener {
            //val intent: Intent =
            startActivity(Intent(this, SessionsActivity::class.java))
        }
    }

}
