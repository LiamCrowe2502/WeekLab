package com.example.weeklab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickMe(v : View) {
        Toast.makeText(this,
            R.string.message,
            Toast.LENGTH_LONG).show()
    }
}