package com.example.proyectomobile

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        lateinit var welcomeText: TextView
        lateinit var forgetpass: TextView
        lateinit var textChange: TextView
        lateinit var username : EditText
        lateinit var password : EditText
        lateinit var btnLogin: Button
        lateinit var btnRegister : Button

        username = findViewById(R.id.inputEmail)
        password = findViewById(R.id.inputPassword)
        btnLogin = findViewById(R.id.btnLoggin)
        btnRegister = findViewById(R.id.btnRegister)
        textChange = findViewById(R.id.textError)

        btnLogin.setOnClickListener {
            if(VerifyLogin(username.text.toString(), password.text.toString())) {
                textChange.text = "Credenciales Correctas!"
                Thread.sleep(3000);
                val nextActivity = Intent(this, GamesInfo::class.java)
                startActivity(nextActivity)
            }else{
                textChange.text = "Nombre de usuario o contraseña incorrecto!"
            }
        }

    }

    private fun VerifyLogin(username: String, password: String): Boolean {
        var res : Boolean
        var userVerified : String
        var passVerified : String

        userVerified = "apostador"
        passVerified = "apuesta"
        res = false

        Log.d("Username", username)
        Log.d("Password", password)
        Log.d("UserCorrect", userVerified)
        Log.d("PassCorrect", passVerified)
        if(username == userVerified){
            if(password == passVerified){
                res = true
            }
        }
        return res
    }
}