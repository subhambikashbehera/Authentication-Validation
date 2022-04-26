package com.subhambikash.loginin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signIn:Button=findViewById(R.id.signIn)
        val password:EditText=findViewById(R.id.password)
        val email:EditText=findViewById(R.id.email)

        signIn.setOnClickListener {
            val emailText=email.text.toString().trim()
            val passwordText=password.text.toString().trim()

            if (TextUtils.isEmpty(emailText)){
                email.error="Enter email"
                return@setOnClickListener
            }else if (TextUtils.isEmpty(passwordText)){
                password.error="Enter Password"
                return@setOnClickListener
            }else{
                if (emailText=="giet@gmail.com" && passwordText=="gietu@123"){
                    val intent=Intent(this,ProfileActivity::class.java)
                    startActivity(intent)
                    finish()
                }else{
                    email.error="enter valid email"
                    password.error="enter valid password"
                    return@setOnClickListener
                }
            }

        }














    }





}