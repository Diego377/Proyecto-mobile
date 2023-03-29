package com.example.proyectomobile

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    lateinit var btnLogin: Button
    lateinit var btnFacebook: Button
    lateinit var btnGoogle: Button
    lateinit var welcomeText: TextView
    lateinit var imageBackground: Image
    lateinit var username: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
             welcomeText = username + " " + password
        }
    }
}