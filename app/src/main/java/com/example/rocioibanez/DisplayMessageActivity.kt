package com.example.rocioibanez

import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val txt = findViewById<TextView>(R.id.textView)
        val switch2 = findViewById<Switch>(R.id.switch2)
        switch2?.setOnCheckedChangeListener{ compoudButton, isCheked ->
            if (isCheked) {
                txt.setTextColor(Color.RED)
            }
            else
                txt.setTextColor(Color.BLUE)
        }

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}