package com.anju.assignmentthree.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.anju.assignmentthree.R

class RegisterActivity : AppCompatActivity() {

    lateinit var etName: EditText
    lateinit var etEmail: EditText
    lateinit var etMobileNumberRegister: EditText
    lateinit var etDeliveryAddress: EditText
    lateinit var etPasswordRegister: EditText
    lateinit var etPasswordConfirm: EditText
    lateinit var btnRegister: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etName=findViewById(R.id.etName)
        etEmail =findViewById(R.id.etEmail)
        etMobileNumberRegister =findViewById(R.id.etMobileNumberRegister)
        etDeliveryAddress = findViewById(R.id.etDeliveryAddress)
        etPasswordRegister = findViewById(R.id.etPasswordRegister)
        etPasswordConfirm = findViewById(R.id.etPasswordConfirm)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {

            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val mobileNumberRegister = etMobileNumberRegister.text.toString()
            val deliveryAddress = etDeliveryAddress.text.toString()
            val passwordRegister = etPasswordRegister.text.toString()
            val passwordConfirm = etPasswordConfirm.text.toString()

            if (passwordRegister == passwordConfirm) {
                val intent = Intent(this@RegisterActivity, RegisterWelcome::class.java)
                intent.putExtra("Name", name)
                intent.putExtra("Email", email)
                intent.putExtra("MobileNumberRegister", mobileNumberRegister)
                intent.putExtra("DeliveryAddress", deliveryAddress)
                intent.putExtra("PasswordRegister", passwordRegister)
                intent.putExtra("PasswordConfirm", passwordConfirm)

                startActivity(intent)
            }
            else{
                Toast.makeText(this@RegisterActivity, "password not matching", Toast.LENGTH_LONG).show()
            }
        }


    }
}