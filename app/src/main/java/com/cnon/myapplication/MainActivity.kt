package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var sec = secondary("6543346645","Sinan","Alagöz")
        var sec1 = secondary("6543346645","Sinan")
        var sec2 = secondary("6543346645")

    }
}