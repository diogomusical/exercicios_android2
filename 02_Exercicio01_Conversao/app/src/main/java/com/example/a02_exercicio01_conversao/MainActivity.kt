package com.example.a02_exercicio01_conversao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a02_exercicio01_conversao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            var euros: Double = binding.editEuros.text.toString().toDouble()
            var dolares: Double = euros*1.09
            binding.textDolares.text = dolares.toString() + "$"
        }
    }
}