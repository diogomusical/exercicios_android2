package com.example.a02_exercicio3_conversao_temperatura_f_celsius

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a02_exercicio3_conversao_temperatura_f_celsius.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {

            binding.textFahr.text = "Diogo"
            var celsius: Double = binding.editCelsius.text.toString().toDouble()
            var fahreneit: Double = (celsius * 1.8) + 32.0
        }
    }
}