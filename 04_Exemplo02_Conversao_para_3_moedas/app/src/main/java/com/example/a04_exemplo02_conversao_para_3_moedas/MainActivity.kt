package com.example.a04_exemplo02_conversao_para_3_moedas

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a04_exemplo02_conversao_para_3_moedas.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonReal.setOnClickListener {
            val euros: Double = binding.editValorEuros.text.toString().toDouble()
            val reais: Double = ((euros * 4.4) * 100).roundToInt().toDouble()/100

            Toast.makeText(applicationContext, "Reais = ${reais.toString()} ", Toast.LENGTH_SHORT).show()
        }

        binding.buttonDolar.setOnClickListener {
            val euros: Double = binding.editValorEuros.text.toString().toDouble()
            val dolares: Double = ((euros * 1.20) * 100).roundToInt().toDouble()/100

            Toast.makeText(applicationContext, "Dólares = ${dolares.toString()} ", Toast.LENGTH_SHORT).show()
        }

        binding.buttonPeso.setOnClickListener {
            val euros: Double = binding.editValorEuros.text.toString().toDouble()
            val pesos: Double = ((euros * 31.5) * 100).roundToInt().toDouble()/100

            Toast.makeText(applicationContext, "Pesos = ${pesos.toString()} ", Toast.LENGTH_SHORT).show()
        }

    }
}