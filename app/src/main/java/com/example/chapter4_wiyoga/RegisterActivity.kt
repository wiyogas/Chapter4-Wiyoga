package com.example.chapter4_wiyoga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        btnBackRegisterListener ()
        txtLoginActivityListener ()
    }

    private fun btnBackRegisterListener () {
        R_ic1.setOnClickListener{
            startActivity (Intent (this, MainActivity ::class.java))
        }
    }
    private fun txtLoginActivityListener () {
        R_txtlogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}