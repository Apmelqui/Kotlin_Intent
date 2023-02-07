package com.hfad.adrianomelquiades_comp304_002_lab01_ex01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName : EditText
    private lateinit var editTextPassword : EditText
    private lateinit var buttonLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        //Creating event handler for the button
        buttonLogin.setOnClickListener {
            startActivity(
                Intent(this, EmployeeDetails::class.java)
                    .putExtra("name", editTextName.text.toString())
                    .putExtra("password", editTextPassword.text.toString()))
        }


    }
}