package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.coroutines.CompletableJob

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val radioGroupSize = findViewById<RadioGroup>(R.id.radioGroupSize)
        val radioButtonSmall = findViewById<RadioButton>(R.id.radioButton1)
        val radioButtonMedium = findViewById<RadioButton>(R.id.radioButton2)
        val radioButtonLarge = findViewById<RadioButton>(R.id.radioButton3)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val checkBoxTomato = findViewById<CheckBox>(R.id.radioButton4)
        val checkBoxOnion = findViewById<CheckBox>(R.id.radioButton5)
        val checkBoxPaneer = findViewById<CheckBox>(R.id.radioButton6)
        val checkBoxCapsicum = findViewById<CheckBox>(R.id.radioButton7)
        val checkBoxCheese = findViewById<CheckBox>(R.id.radioButton8)
        val checkBoxChilliFlakes = findViewById<CheckBox>(R.id.radioButton9)
        val checkBoxOregano = findViewById<CheckBox>(R.id.radioButton10)
        val checkBoxSauce = findViewById<CheckBox>(R.id.radioButton11)

        var buttn = findViewById<Button>(R.id.button)
        val textViewResult = findViewById<TextView>(R.id.textView5)
        buttn.setOnClickListener {
            val checkedRadioButtonId = radioGroupSize.checkedRadioButtonId
            val pizzaSize = when (checkedRadioButtonId) {
                R.id.radioButton1 -> "Small"
                R.id.radioButton2 -> "Medium"
                R.id.radioButton3 -> "Large"
                else -> ""
            }

            val pizzaType = mutableListOf<String>()
            if (checkBoxTomato.isChecked) pizzaType.add("Tomato")
            if (checkBoxOnion.isChecked) pizzaType.add("Onion")
            if (checkBoxPaneer.isChecked) pizzaType.add("Paneer")
            if (checkBoxCapsicum.isChecked) pizzaType.add("Capsicum")

            val extras = mutableListOf<String>()
            if (checkBoxCheese.isChecked) extras.add("Cheese")
            if (checkBoxChilliFlakes.isChecked) extras.add("Chilli Flakes")
            if (checkBoxOregano.isChecked) extras.add("Oregano")
            if (checkBoxSauce.isChecked) extras.add("Sauce")

            val orderSummary = StringBuilder()
            orderSummary.append("Pizza Size: $pizzaSize\n")
            orderSummary.append("Pizza Type: ${pizzaType.joinToString(", ")}\n")
            orderSummary.append("Extras: ${extras.joinToString(", ")}")

            textViewResult.text = orderSummary.toString()
        }
    }

}