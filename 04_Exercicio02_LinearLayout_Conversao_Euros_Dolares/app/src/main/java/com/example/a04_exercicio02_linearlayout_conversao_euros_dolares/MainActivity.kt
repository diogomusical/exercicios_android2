package com.example.a04_exercicio02_linearlayout_conversao_euros_dolares

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a04_exercicio02_linearlayout_conversao_euros_dolares.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euros: Double = binding.editValorEuros.text.toString().toDouble()
            val dolares: Double = ( ( euros * 0.80 ) * 100 ).roundToInt().toDouble()/100

            binding.textValorDolares.text = dolares.toString() + " $"
        }
    }
}