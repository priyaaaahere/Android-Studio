package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.text.Typography.quote

class AppChooser2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_chooser2)
        val radioGroup = findViewById<RadioGroup>(R.id.RG1)
//        val rd1=findViewById<RadioButton>(R.id.rb1)
//        val rd2=findViewById<RadioButton>(R.id.rb2)
//        val rd3=findViewById<RadioButton>(R.id.rb3)
//        val rd4=findViewById<RadioButton>(R.id.rb4)
//        val rd5=findViewById<RadioButton>(R.id.rb5)
//        val rd6=findViewById<RadioButton>(R.id.rb6)
        val shareButton: Button =findViewById(R.id.button)
        shareButton.setOnClickListener {
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId

            if (selectedRadioButtonId != -1) {
                val selectedRadioButton = findViewById<RadioButton>(selectedRadioButtonId)
                var selectedQuote = selectedRadioButton.text.toString()
                val colonIndex = selectedQuote.indexOf(":")
                if (colonIndex != -1) {
                    selectedQuote = selectedQuote.substring(colonIndex + 1).trim()
                }
                sharetxt(selectedQuote)
            }
        }
    }
    private fun sharetxt(quote : String) {
        val sendIntent : Intent = Intent().apply {
            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, quote)
            type="text/plain"
        }
        val chooser1 : Intent = Intent.createChooser(sendIntent,"Share using...")
        startActivity(chooser1)
    }
}