package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AppChooser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_chooser)
        val shareButton: Button =findViewById(R.id.sharebtn)
        shareButton.setOnClickListener {
            sharetxt("This is the message to be shared")
        }
    }
    fun sharetxt(message: String){
        val sendtxt : Intent = Intent().apply {
            action=Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,message)
            type="text/plain"
        }
        val chooser1 : Intent = Intent.createChooser(sendtxt,"Share using...")
        startActivity(chooser1)
    }
}