package com.example.form

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val fruitArray = arrayOf(
        "Apple",
        "Orange",
        "Banana",
        "Grape",
        "Strawberry",
        "Watermelon",
        "Pineapple",
        "Mango",
        "Cherry",
        "Peach",
        "Pear",
        "Blueberry",
        "Raspberry",
        "Kiwi",
        "Plum",
        "Lemon",
        "Lime",
        "Apricot",
        "Coconut",
        "Fig"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}