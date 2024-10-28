package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator.R

class FlowerShop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flower_shop)
        val radioGroupSize = findViewById<RadioGroup>(R.id.radioGroupSize)

        val textView = findViewById<TextView>(R.id.tv1)
        val rose = findViewById<CheckBox>(R.id.checkBox)
        val lillies = findViewById<CheckBox>(R.id.checkBox1)
        val sunflower = findViewById<CheckBox>(R.id.checkBox2)
        val orchid = findViewById<CheckBox>(R.id.checkBox3)
        val textView2 = findViewById<TextView>(R.id.tv2)
        val takeaway = findViewById<RadioButton>(R.id.r1)
        val homedel = findViewById<RadioButton>(R.id.r2)

        var buttn = findViewById<Button>(R.id.button0)
        buttn.setOnClickListener {
            val checkedRadioButtonId = radioGroupSize.checkedRadioButtonId
            val deliveryMethod = when (checkedRadioButtonId) {
                R.id.r1 -> "Takeaway"
                R.id.r2 -> "Home Delivery"
                else -> ""
            }

            val flowerType = mutableListOf<String>()
            if (rose.isChecked) flowerType.add("Roses")
            if (lillies.isChecked) flowerType.add("Lillies")
            if (sunflower.isChecked) flowerType.add("Sunflower")
            if (orchid.isChecked) flowerType.add("Orchids")

            val orderSummary = StringBuilder()
            orderSummary.append("Delivery Method: $deliveryMethod\n")
            orderSummary.append("Bouquet Full Of: ${flowerType.joinToString(", ")}\n")

            var result = orderSummary.toString()
            var result2 = deliveryMethod.toString()
            var i = Intent(this, FlowerShop2::class.java)
            i.putExtra("result", result)
            i.putExtra("result2", result2)
            startActivity(i)

        }
    }
}