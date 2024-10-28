package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dropdown : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dropdown)
        val destinationSpinner: Spinner = findViewById(R.id.spinner1)
        val packageListView: ListView=findViewById(R.id.l1)
        val destinations= arrayOf("Tokyo","NewYork","Paris")
        val packagesOfParis= arrayOf("Eiffel Tower","Louvre Museum","Arc De Triomphe","Montmartre")
        val packagesOfNewYork= arrayOf("Statue of Liberty","Empire State Building","Central Park","Times Square")
        val packagesOfTokyo= arrayOf("Tokyo Tower","Shibuya Crossing","Mount Fuji","Senso-ji Temple")

        val spinnerAdapter=ArrayAdapter(this,android.R.layout.simple_spinner_item,destinations)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        destinationSpinner.adapter=spinnerAdapter

        val initialAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,packagesOfTokyo)
        packageListView.adapter=initialAdapter

        destinationSpinner.onItemSelectedListener= object :AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedPackages=when(position) {
                    0->packagesOfTokyo
                    1->packagesOfNewYork
                    else->packagesOfParis
                }
                val adapter=ArrayAdapter(this@Dropdown,android.R.layout.simple_list_item_1,selectedPackages)
                packageListView.adapter=adapter

            }
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}