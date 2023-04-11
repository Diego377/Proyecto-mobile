package com.example.proyectomobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        lateinit var btnLogin: Button
        lateinit var welcomeText: TextView

        var username: EditText = findViewById(R.id.inputEmail)
        var password: EditText = findViewById(R.id.inputPassword)


        btnLogin.setOnClickListener {
            if((username.text.toString() !== "Apostador") || (password.text.toString() !== "apuesta")
            ){
                welcomeText.text = "Nombre de usuario o contrasenia incorrecto!"
            }else{
                welcomeText.text = "Intentando conectar..."
            }
        }
    }
}