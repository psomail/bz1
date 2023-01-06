package com.example.bz1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()


    }

    private fun init(){
        setUpToolbar()

        val fab: View = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                .setAction("Action", { view ->
                    Toast.makeText(getApplicationContext(), "Next clicked!",Toast.LENGTH_LONG)
                        .show()
                })
                .show()
        }
    }

    private fun setUpToolbar(){
        supportActionBar?.let{ tb ->
            tb.title = "With Fab"
            tb.setHomeButtonEnabled(true)
            tb.setDisplayHomeAsUpEnabled(true)
        }
    }
}