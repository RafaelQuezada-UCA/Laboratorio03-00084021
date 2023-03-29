package com.example.laboratio03_00084021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var fiveCentsImageView: ImageView
    private lateinit var tenCentsImageView: ImageView
    private lateinit var quarterImageView: ImageView
    private lateinit var oneDollarImageView: ImageView
    private lateinit var cashTextView: TextView
    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fiveCentsImageView = findViewById(R.id.five_cents_image_view)
        cashTextView = findViewById(R.id.cash_text_view)

        fiveCentsImageView.setOnClickListener {
            cash += 0.05
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }

        tenCentsImageView = findViewById(R.id.ten_cents_image_view)
        cashTextView = findViewById(R.id.cash_text_view)

        tenCentsImageView.setOnClickListener {
            cash += 0.10
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }

        quarterImageView = findViewById(R.id.quarter_image_view)
        cashTextView = findViewById(R.id.cash_text_view)

        quarterImageView.setOnClickListener {
            cash += 0.25
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }

        oneDollarImageView = findViewById(R.id.one_dollar_image_view)
        cashTextView = findViewById(R.id.cash_text_view)

        oneDollarImageView.setOnClickListener {
            cash += 1.00
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }
    }
}