package com.sample.flutter_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        val button = findViewById<Button>(R.id.btClose)
        button.setOnClickListener(CloseListener())
    }

    private inner class CloseListener : View.OnClickListener {
        override fun onClick(v: View?) {
            finish()
        }
    }

}