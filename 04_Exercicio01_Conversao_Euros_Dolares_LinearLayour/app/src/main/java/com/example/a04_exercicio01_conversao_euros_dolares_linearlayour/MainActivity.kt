package com.example.a04_exercicio01_conversao_euros_dolares_linearlayour

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a04_exercicio01_conversao_euros_dolares_linearlayour.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euros: Double = binding.editValorEuros.text.toString().toDouble()
            val dolares: Double = ((euros * 0.80) * 100).roundToInt().toDouble()/100

            binding.textValorDolares.text = dolares.toString() + " $"
        }
    }
}