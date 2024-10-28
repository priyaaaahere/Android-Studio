package com.example.calculator

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent)
        val button1=findViewById<Button>(R.id.button1)
        val button2=findViewById<Button>(R.id.button2)
        val button3=findViewById<Button>(R.id.button3)
        val button4=findViewById<Button>(R.id.button4)
        val button5=findViewById<Button>(R.id.button5)
        val button6=findViewById<Button>(R.id.button6)

        button1.setOnClickListener {
            val i1=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(i1)
        }
        button2.setOnClickListener {
            val intent=Intent(this,FlowerShop::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val i3=Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people"))
            startActivity(i3)
        }
        button4.setOnClickListener {
            val i4=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i4)
        }
        button5.setOnClickListener {
            val i5=Intent(Intent.ACTION_DIAL,Uri.parse("tel:8383041730"))
            startActivity(i5)
        }
        button6.setOnClickListener {
            val i6=Intent(Intent.ACTION_PICK)
            i6.type="image/*"
            startActivity(i6)
        }
    }
}