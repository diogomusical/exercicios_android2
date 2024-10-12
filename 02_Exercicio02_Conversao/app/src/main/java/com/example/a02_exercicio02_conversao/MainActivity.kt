package com.example.a02_exercicio02_conversao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a02_exercicio02_conversao.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            var euros: Double = binding.editEuros.text.toString().toDouble()
            var dolares: Double = (euros * 0.80 * 100).roundToInt().toDouble()/100
            // var dolares: Double = String.format("%.2f", euros * 0.80).toDouble() dá erro é preciso corrigir

            binding.textDolares.text = dolares.toString() + " $"        }
    }
}