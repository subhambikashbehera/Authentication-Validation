package com.subhambikash.loginin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.RelativeLayout
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.get

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val mainLayout: RelativeLayout = findViewById(R.id.mainLayout)

        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { _, i ->
            when (i) {
                R.id.blue -> {
                    mainLayout.background = AppCompatResources.getDrawable(this, R.color.blue)
                }
                R.id.red -> {
                    mainLayout.background = AppCompatResources.getDrawable(this, R.color.red)
                }
                R.id.green -> {
                    mainLayout.background = AppCompatResources.getDrawable(this, R.color.green)
                }
            }
        }

        //easy
//        val blue: RadioButton =findViewById(R.id.blue)
//        val green: RadioButton =findViewById(R.id.green)
//        val red: RadioButton =findViewById(R.id.red)
//
//        blue.setOnClickListener {
//            mainLayout.background=AppCompatResources.getDrawable(this,R.color.blue)
//
//        }
//        green.setOnClickListener {
//            mainLayout.background=AppCompatResources.getDrawable(this,R.color.green)
//        }
//        red.setOnClickListener {
//            mainLayout.background=AppCompatResources.getDrawable(this,R.color.red)
//        }


    }
}