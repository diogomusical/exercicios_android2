package com.example.a03_exercicio01_dizer_ola_nome_apelido

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a03_exercicio01_dizer_ola_nome_apelido.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDizerOla.setOnClickListener {
            var nome: String = binding.editNome.text.toString()
            var apelido: String = binding.editApelido.text.toString()

            if(nome.isEmpty() && apelido.isEmpty()) binding.textResultado.text = "Têm de preencher pelo menos um campo"
            else binding.textResultado.text = "Olá " + nome + " " + apelido
        }
    }
}