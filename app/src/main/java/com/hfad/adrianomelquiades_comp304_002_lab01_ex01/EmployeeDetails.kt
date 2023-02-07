package com.hfad.adrianomelquiades_comp304_002_lab01_ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class EmployeeDetails : AppCompatActivity() {

    private lateinit var TextViewName : TextView
    private lateinit var editTextTaxRate : EditText
    private lateinit var editTextSalary : EditText
    private lateinit var buttonCalculate : Button
    private lateinit var textViewOutput : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_details)

        TextViewName = findViewById(R.id.TextViewName)
        editTextTaxRate = findViewById(R.id.editTextTaxRate)
        editTextSalary = findViewById(R.id.editTextSalary)
        buttonCalculate = findViewById(R.id.buttonCalculate)
        textViewOutput = findViewById(R.id.textViewOutput)

        var name = intent.getStringExtra("name")
        //var password = intent.getStringExtra("password")

        TextViewName.text = name

        //Creating event handler for the button
        buttonCalculate.setOnClickListener {
            var netSalary: Double
            var salary = editTextSalary.text.toString().toDouble()
            var taxRate = editTextTaxRate.text.toString().toDouble()

            netSalary = salary - (taxRate/100) * salary

            textViewOutput.text = "The net salary of $name after deduction is ${String.format("$%,.2f", netSalary).toString()}"
            Toast.makeText(applicationContext, "The net salary of $name after deduction is ${String.format("$%,.2f", netSalary).toString()}", Toast.LENGTH_LONG).show()
        }
    }
}