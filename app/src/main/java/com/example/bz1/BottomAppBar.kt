package com.example.bz1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class BottomAppBar : AppCompatActivity() {
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_app_bar)
        listView = findViewById(R.id.listView)
        val catNames: Array<String> = arrayOf("Рыжик", "Барсик", "Мурзик", "Мурка", "Васька",
            "Томасина", "Кристина", "Пушок", "Дымка", "Кузя",
            "Китти", "Масяня", "Симба")

        val adapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, catNames)
//        listView.adapter = adapter


        init()

//        val listView: ListView = findViewById(R.id.listView)
//        val catNames: Array<String> = arrayOf("Рыжик", "Барсик", "Мурзик", "Мурка", "Васька",
//            "Томасина", "Кристина", "Пушок", "Дымка", "Кузя",
//            "Китти", "Масяня", "Симба")
//
//        val adapter: ArrayAdapter<String> = ArrayAdapter(this, R.layout.activity_main, catNames)
        listView.adapter = adapter

    }

    private fun init(){
        setUpToolbar()

        val fab: View = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                .setAction("Action", { view ->
                    Toast.makeText(getApplicationContext(), "Next clicked!", Toast.LENGTH_LONG)
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