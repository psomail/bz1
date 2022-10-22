package com.example.bz1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        setUpToolbar()
    }

    private fun setUpToolbar(){
        supportActionBar?.let{ tb ->
            tb.title = "With Fab"
            tb.setHomeButtonEnabled(true)
            tb.setDisplayHomeAsUpEnabled(true)
        }
    }
}