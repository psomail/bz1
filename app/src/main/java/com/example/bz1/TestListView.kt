package com.example.bz1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView

class TestListView : AppCompatActivity() {
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val catNames: Array<String> = arrayOf("Рыжик", "Барсик", "Мурзик", "Мурка", "Васька",
            "Томасина", "Кристина", "Пушок", "Дымка", "Кузя",
            "Китти", "Масяня", "Симба")

        listView = findViewById(R.id.testListView)
        val adpter1: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, catNames)
        listView.adapter = adpter1
    }
}