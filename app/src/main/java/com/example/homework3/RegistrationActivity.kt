package com.example.homework3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val btnRegistration = findViewById<Button>(R.id.btnRegistration)
        val firstName = findViewById<EditText>(R.id.firstName)
        val lastName = findViewById<EditText>(R.id.lastName)

        btnRegistration.setOnClickListener {
            val intent = Intent(applicationContext, LoginActivity::class.java)

            val firstName = firstName.text.toString()
            val lastName = lastName.text.toString()

            intent.putExtra("firstName", firstName)
            intent.putExtra("lastName", lastName)
            startActivity(intent)
        }
    }
}