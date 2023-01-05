package com.shoppi.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightEditText: EditText = findViewById(R.id.et_height)
        val weightEditText: EditText = findViewById(R.id.et_weight)

        val confirmButton = findViewById<Button>(R.id.bt_confirm)

        confirmButton.setOnClickListener {
            val height: Int = heightEditText.text.toString().toInt()
            val weight: Int = weightEditText.text.toString().toInt()
        }
    }
}1