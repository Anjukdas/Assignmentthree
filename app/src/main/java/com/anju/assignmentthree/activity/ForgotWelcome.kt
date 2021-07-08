package com.anju.assignmentthree.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.anju.assignmentthree.R

class ForgotWelcome : AppCompatActivity() {

    lateinit var txtWelcomeFMobile: TextView
    lateinit var txtWelcomeFEmail: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_welcome)

        txtWelcomeFMobile= findViewById(R.id.txtWelcomeFMobile)
        txtWelcomeFEmail=findViewById(R.id.txtWelcomeFEmail)
        if (intent != null) {
            var mob = intent.getStringExtra("MOB")
            var email = intent.getStringExtra("EMAIL")

            txtWelcomeFMobile.text = mob
            txtWelcomeFEmail.text = email
        }

    }
}