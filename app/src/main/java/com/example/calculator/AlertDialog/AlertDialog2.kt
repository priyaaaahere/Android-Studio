package com.example.calculator.AlertDialog

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator.R

class AlertDialog2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alert_dialog2)
        var btndialog=findViewById<Button>(R.id.btn)
        btndialog.setOnClickListener {
            var d=LayoutInflater.from(this).inflate(R.layout.custom_dialog,null)
            var b = AlertDialog.Builder(this).setView(d)
            b.setTitle("Subscribe")
            b.setCancelable(false)
            b.setPositiveButton("Subscribe") { dialog, _ ->
                val e=d.findViewById<EditText>(R.id.editTextEmailAddress)
                val email=e.text.toString()
                if(email.isNotBlank()){
                    Toast.makeText(this,"Thanks for subscribing $email",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Please enter valid email address",Toast.LENGTH_SHORT).show()
                }
            }
            b.setNegativeButton("No") { dialog, _ ->
                finish()
            }
            b.create().show()
        }
    }
}