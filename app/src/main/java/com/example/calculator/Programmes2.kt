package com.example.calculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Programmes2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_programmes2)
        val blockName = intent.getStringExtra("BLOCK_NAME")

        // Reference to TextView to display the message
        val textView = findViewById<TextView>(R.id.textView)

        // Set the message
        textView.text = "Welcome to $blockName block"
    }
}