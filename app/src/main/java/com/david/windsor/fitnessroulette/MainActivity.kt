package com.david.windsor.fitnessroulette

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val UserExpLevel: String = "USER_EXPERIENCE_LEVEL"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState != null) {
            // TODO This will end up being where we skip to that difficulty level and seeing whats up there
        }
        setContentView(R.layout.activity_main)
        // if we hit this point they have not picked one yet, wire the buttons
        

    }
}
