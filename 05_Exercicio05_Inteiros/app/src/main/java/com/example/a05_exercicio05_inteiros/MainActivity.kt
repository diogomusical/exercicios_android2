package com.example.a05_exercicio05_inteiros

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a05_exercicio05_inteiros.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val horasTotal: Int = binding.editHoras.text.toString().toInt()

            val semanas: Int = (horasTotal / (24*7))
            val dias: Int = ((horasTotal / 24) - (semanas * 7))
            val horas: Int = (horasTotal- (dias * 24) - (semanas * 24 * 7))

            binding.textResultado.text = "Semanas = " + semanas + "\n" + "Dias = " + dias  + "\n" + "Horas = " + horas

        }
    }
}