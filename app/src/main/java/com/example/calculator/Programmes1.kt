package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import android.widget.ImageButton

class Programmes1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_programmes1)
        val im1 = findViewById<ImageButton>(R.id.im1)
        val im2 = findViewById<ImageButton>(R.id.im2)
        val im3 = findViewById<ImageButton>(R.id.im3)
        val im4 = findViewById<ImageButton>(R.id.im4)
        val im5 = findViewById<ImageButton>(R.id.im5)
        val im6 = findViewById<ImageButton>(R.id.im6)
        val im7 = findViewById<ImageButton>(R.id.im7)
        val im8 = findViewById<ImageButton>(R.id.im8)
        val im9 = findViewById<ImageButton>(R.id.im9)

        // Set onClickListener for each ImageButton
        im1.setOnClickListener { showSnackbarWithAction(it, "Welcome to Computer Science Engineering block","Go To Details", "Computer Science") }
        im2.setOnClickListener { showSnackbarWithAction(it, "Welcome to Chemical Engineering block","Go To Details", "Chemical") }
        im3.setOnClickListener { showSnackbarWithAction(it, "Welcome to Mechanical Engineering block", "Go To Details", "Mechanical") }
        im4.setOnClickListener { showSnackbarWithAction(it, "Welcome to Hotel Management block", "Go To Details", "Hotel") }
        im5.setOnClickListener { showSnackbarWithAction(it, "Welcome to Design block", "Go To Details", "Design") }
        im6.setOnClickListener { showSnackbarWithAction(it, "Welcome to Agriculture block", "Go To Details", "Agriculture") }
        im7.setOnClickListener { showSnackbarWithAction(it, "Welcome to Pharmacy block", "Go To Details", "Pharmacy") }
        im8.setOnClickListener { showSnackbarWithAction(it, "Welcome to Law block", "Go To Details", "Law") }
        im9.setOnClickListener { showSnackbarWithAction(it, "Welcome to Polytechnic block", "Go To Details", "Polytechnic") }
    }

    private fun showSnackbarWithAction(view: View, message: String, actionText: String, block: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).setAction(actionText) {
            // Create an Intent to navigate to Programmes2
            val intent = Intent(this, Programmes2::class.java)
            // Pass data to Programmes2 (block name)
            intent.putExtra("BLOCK_NAME", block)
            startActivity(intent)
        }.show()
    }
}