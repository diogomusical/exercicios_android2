package com.example.a04_exercicio02_login_3activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a04_exercicio02_login_3activities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            val username: String = binding.editUsername.text.toString()
            val password: String = binding.editPassword.text.toString()

            if((username == "user") && (password == "pass")){
                val intent = Intent(this, LoginOK::class.java)
                startActivity(intent)
            }
            else{
                val intent = Intent(this, LoginErrado::class.java)
                startActivity(intent)
            }
        }
    }
}