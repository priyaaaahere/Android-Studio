package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val input1 = findViewById<EditText>(R.id.input1)
        val input2 = findViewById<EditText>(R.id.input2)
        val resultView = findViewById<TextView>(R.id.resultView)
        val addButton = findViewById<Button>(R.id.addButton)
        val subButton = findViewById<Button>(R.id.subtractButton)
        val mulButton = findViewById<Button>(R.id.multiplyButton)
        val divButton = findViewById<Button>(R.id.divideButton)

        addButton.setOnClickListener {

            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()
            if(num1!=null && num2!=null){
                val result = num1 + num2
                resultView.text = "Result: $result"
            }else{
                resultView.text = "Invalid input"
            }
        }
        subButton.setOnClickListener {

            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()
            if(num1!=null && num2!=null){
                val result = num1 - num2
                resultView.text = "Result: $result"
            }else{
                resultView.text = "Invalid input"
            }
        }
        divButton.setOnClickListener {

            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    val result = num1 / num2
                    resultView.text = "Result: $result"
                } else {
                    resultView.text = "Cannot divide by zero"
                }
            } else {
                resultView.text = "Please enter valid numbers"
            }
        }

        mulButton.setOnClickListener {

            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()
            if(num1!=null && num2!=null){
                val result = num1 * num2
                resultView.text = "Result: $result"
            }else{
                resultView.text = "Invalid input"
            }
        }


    }
}