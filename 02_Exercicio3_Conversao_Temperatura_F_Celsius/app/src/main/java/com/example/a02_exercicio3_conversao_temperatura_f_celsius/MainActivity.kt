package com.example.a02_exercicio3_conversao_temperatura_f_celsius

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a02_exercicio3_conversao_temperatura_f_celsius.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            var celsius: Double = binding.editCelsius.text.toString().toDouble()
            var fahreneit: Double = (((celsius * 1.8) + 32.0)*100).roundToInt().toDouble()/100

            binding.textFahr.text = fahreneit.toString() + " F"
        }
    }
}