package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class SnackBarExample : AppCompatActivity() {;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snack_bar)
        val sid = findViewById<Button>(R.id.butn)
        sid.setOnClickListener { view ->
            Snackbar.make(view, "This is a snackbar", Snackbar.LENGTH_LONG).setAction("Want to Redo") {
                Toast.makeText(this, "Redoing...", Toast.LENGTH_SHORT).show()
            }.show()
        }
    }
}