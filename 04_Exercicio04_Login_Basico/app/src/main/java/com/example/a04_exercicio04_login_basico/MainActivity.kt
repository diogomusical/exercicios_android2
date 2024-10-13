package com.example.a04_exercicio04_login_basico

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a04_exercicio04_login_basico.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            val username: String = binding.editUsername.text.toString()
            val password: String = binding.editPassword.text.toString()

            if((username == "user") && (password == "pass")) {
                Toast.makeText(applicationContext, "Login Válido", Toast.LENGTH_SHORT)
                    .show()
            }
            else Toast.makeText(applicationContext, "Login Inválido", Toast.LENGTH_SHORT).show()
        }
    }
}