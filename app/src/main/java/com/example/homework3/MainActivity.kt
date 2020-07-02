package com.example.homework3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMain = findViewById<Button>(R.id.btn)

        btnMain.setOnClickListener {
            val intent = Intent(applicationContext, RegistrationActivity::class.java)

            startActivity(intent)
        }

        startActivity(intent)
    }
    }
