package com.anju.assignmentthree.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.anju.assignmentthree.R

class LoginActivity : AppCompatActivity() {

    lateinit var etMobileNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var txtForgotPassword: TextView
    lateinit var txtRegister: TextView

    val validMobileNumber = "9876543210"
    val validPassword = "anju"

    lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name),Context.MODE_PRIVATE)
        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)

        if (isLoggedIn) {
            val intent = Intent(this@LoginActivity, LoginWelcome::class.java)
            startActivity(intent)
            finish()
        }
        else {

            setContentView(R.layout.activity_login)
        }
        title = "Log In"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegister)

        btnLogin.setOnClickListener{

            val mobileNumber = etMobileNumber.text.toString()
            val password = etPassword.text.toString()
            if ((mobileNumber == validMobileNumber) && (password == validPassword)){
                savePreferences()
                val intent =Intent(this@LoginActivity, LoginWelcome::class.java)
                intent.putExtra("MOB",mobileNumber)
                intent.putExtra("PASS",password)
                startActivity(intent)
            }
            else{
            Toast.makeText(this@LoginActivity, "Incorrect credentials", Toast.LENGTH_LONG).show()
            }

        }

        txtForgotPassword.setOnClickListener {
            val intent = Intent(this@LoginActivity, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        txtRegister.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onPause() {
        super.onPause()
        finish()
    }
    fun savePreferences() {
        sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()

    }
}