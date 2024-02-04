package com.example.arrdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary1.ArrUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        sun(3.4)
    }

    private fun sun(d: Double) {

    }
}