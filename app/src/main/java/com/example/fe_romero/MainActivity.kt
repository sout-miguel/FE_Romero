package com.example.fe_romero

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fe_romero.R.id.textPassword_input
//import for the basic log uin textpassword
class MainActivity : AppCompatActivity() {
    lateinit var usernameInput : EditText
    lateinit var textPasswordInput : EditText
    lateinit var loginBtn : Button
    //late-initialized using the keyword “lateinit”.
    // This means that the property will not be initialized at the time of object creation, but rather at a later point in time.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        textPasswordInput = findViewById(textPassword_input)
        loginBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener{
            val username = usernameInput.text.toString()
            val password = textPasswordInput.text.toString()
            Log.i("Test Credentials", "Username : $username and Password : $password")
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}