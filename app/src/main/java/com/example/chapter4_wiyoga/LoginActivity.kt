package com.example.chapter4_wiyoga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnBackSpaceLoginListener()
        txtRegisterActivityListener()
    }
    private fun btnBackSpaceLoginListener () {
        L_ic1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    private fun txtRegisterActivityListener () {
        L_txtregister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}