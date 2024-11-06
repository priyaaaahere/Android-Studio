package com.example.calculator.AlertDialog

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.R

class BasicAlertDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_basic_alert_dialog)
        var btndialog=findViewById<Button>(R.id.btn)
        btndialog.setOnClickListener {
            var b=AlertDialog.Builder(this)
            b.setTitle("Review")
            b.setMessage("Will you recommend this app to your knowns?")
            b.setCancelable(false)//this is for the use if we want user to mandatorily click on one of the three buttons
            b.setPositiveButton("Sure"){dialog,_->
                var i=Intent(this,RatingPage::class.java)
                startActivity(i)
            }
            b.setNegativeButton("No"){dialog,_->
                finish()
            }
            b.setNeutralButton("Maybe Later"){dialog,_->
                Toast.makeText(this,"Keep Using, Hope you'll like our app",Toast.LENGTH_SHORT).show()
            }
            b.create().show()
        }
    }
}