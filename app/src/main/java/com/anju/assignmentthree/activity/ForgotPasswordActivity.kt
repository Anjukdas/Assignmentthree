package com.anju.assignmentthree.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.anju.assignmentthree.R

class ForgotPasswordActivity : AppCompatActivity() {


    lateinit var etFMobileNumber: EditText
    lateinit var etFEmail: EditText
    lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        etFMobileNumber = findViewById(R.id.etFMobileNumber)
        etFEmail = findViewById(R.id.etFEmail)
        btnNext = findViewById(R.id.btnNext)

        btnNext.setOnClickListener{
            val mobileNumber = etFMobileNumber.text.toString()
            val email = etFEmail.text.toString()

            val intent = Intent(this@ForgotPasswordActivity, ForgotWelcome::class.java)
            intent.putExtra("MOB",mobileNumber)
            intent.putExtra("EMAIL",email)
            startActivity(intent)
        }
    }
}