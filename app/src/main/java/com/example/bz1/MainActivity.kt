package com.example.bz1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickListView(view: View) {
        val intent = Intent(this, TestListView::class.java)
        startActivity(intent)
    }

    fun onClickBottomAppBar(view: View) {
        val intent = Intent(this, BottomAppBar::class.java)
        startActivity(intent)
    }
}