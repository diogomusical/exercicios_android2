package com.example.a02_primeiraapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a02_primeiraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            var nome: String = binding.editNome.text.toString()
            binding.textResultado.text = "Olá " + nome
        }
    }
}