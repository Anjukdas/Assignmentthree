package com.anju.assignmentthree.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.anju.assignmentthree.R

class MainActivity : AppCompatActivity() {

    private val splashScreentimeout: Long =2500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        },splashScreentimeout)
    }
}