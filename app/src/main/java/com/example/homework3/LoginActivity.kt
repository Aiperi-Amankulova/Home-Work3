package com.example.homework3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registration.*

class  LoginActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val firstNameInLogin = findViewById<TextView>(R.id.firstNameInLogin)
        val lastNameInLogin = findViewById<TextView>(R.id.lastNameInLogin)

        val etData = intent.getStringExtra("firstName")
        val tvData = intent.getBooleanExtra("lastName", false)

        firstNameInLogin.text = etData

        if(tvData){
            lastNameInLogin.text = "From First name"

        }
        else{
            lastNameInLogin.text = "From Last name"
        }
    }
}