package com.example.a03_exercicio02_dizer_ola_nome_apelido_toast

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a03_exercicio02_dizer_ola_nome_apelido_toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDizerOla.setOnClickListener {
            val nome: String = binding.editNome.text.toString()
            val apelido: String = binding.editApelido.text.toString()

            if(nome.isEmpty() && apelido.isEmpty()) Toast.makeText(applicationContext, "Têm de preencher pelo menos um campo",Toast.LENGTH_SHORT).show()
            else Toast.makeText(applicationContext, "Olá ${nome}  ${apelido}",Toast.LENGTH_SHORT).show()
        }

    }
}