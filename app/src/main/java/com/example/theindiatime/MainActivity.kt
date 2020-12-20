package com.example.theindiatime

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity(), NewsItemClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val items = fetchData()
        val adapter = NewsListAdapter(items, this)
        recyclerView.adapter = adapter

    }
    private fun fetchData() : ArrayList<String>{
        val list = ArrayList<String>()
        for(i in 0 until 30){
            list.add("No $i")
        }
        return list
    }

    override fun onItemClick(item: String) {
        Toast.makeText(this, "click is $item",Toast.LENGTH_SHORT).show()
    }
}