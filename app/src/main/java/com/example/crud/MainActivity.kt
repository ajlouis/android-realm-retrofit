package com.example.crud

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.adapter.ThemeListAdapter
import com.example.models.Theme

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val themeListView = findViewById<ListView>(R.id.themeListView)

        val themeListData = arrayListOf<Theme>(Theme("first", R.drawable.ic_launcher_background), Theme("Second", R.drawable.ic_launcher_background))
        val themeAdapter = ThemeListAdapter(themeListData, this)
        themeListView.adapter = themeAdapter


    }
}
