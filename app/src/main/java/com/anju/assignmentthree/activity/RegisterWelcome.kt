package com.anju.assignmentthree.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.anju.assignmentthree.R

class RegisterWelcome : AppCompatActivity() {

    lateinit var txtRegPass_w: TextView
    lateinit var txtRegName_W: TextView
    lateinit var txtRegEmail_W: TextView
    lateinit var txtRegMob_W: TextView
    lateinit var txtRegDel_w: TextView
    lateinit var txtRegConf_w: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_welcome)

        txtRegName_W=findViewById(R.id.txtRegName_W)
        txtRegEmail_W=findViewById(R.id.txtRegEmail_W)
        txtRegMob_W=findViewById(R.id.txtRegMob_W)
        txtRegDel_w=findViewById(R.id.txtRegDel_w)
        txtRegPass_w=findViewById(R.id.txtRegPass_w)
        txtRegConf_w=findViewById(R.id.txtRegConf_w)
        if (intent != null) {
            var name = intent.getStringExtra("Name")
            var email = intent.getStringExtra("Email")
            var mobile = intent.getStringExtra("MobileNumberRegister")
            var delivery = intent.getStringExtra("DeliveryAddress")
            var passRegister = intent.getStringExtra("PasswordRegister")
            var passConfirm = intent.getStringExtra("PasswordConfirm")


            txtRegName_W.text = name
            txtRegEmail_W.text = email
            txtRegMob_W.text = mobile
            txtRegDel_w.text =delivery
            txtRegPass_w.text =passRegister
            txtRegConf_w.text=passConfirm
        }
    }
}