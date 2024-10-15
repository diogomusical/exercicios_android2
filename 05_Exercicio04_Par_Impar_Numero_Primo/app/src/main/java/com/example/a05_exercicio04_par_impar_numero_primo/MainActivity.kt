package com.example.a05_exercicio04_par_impar_numero_primo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a05_exercicio04_par_impar_numero_primo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonVerificar.setOnClickListener {
            val numero1: Int = binding.editNumero1.text.toString().toInt()

            if(numero1 % 2 == 0){
                binding.textParImpar.text = "O número é par."
            }
            else {
                binding.textParImpar.text = "O número é ímpar."
            }

            var count: Int = 0

           for(i in 1..numero1){
               if(numero1 % i == 0){
                   count++
               }
           }

            if(count == 2){
                binding.textPrimo.text = "O número é o número Primo."
            }

            else{
                binding.textPrimo.text = "O número não é um número Primo."
            }

        }
    }
}