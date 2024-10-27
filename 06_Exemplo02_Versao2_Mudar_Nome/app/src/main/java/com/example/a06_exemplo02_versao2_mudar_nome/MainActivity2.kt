package com.example.a06_exemplo02_versao2_mudar_nome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exemplo02_versao2_mudar_nome.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val nome = i.extras?.getString("nome")

        binding.editNome.setText(nome)

        binding.buttonOk.setOnClickListener {
            val novonome = binding.editNome.text.toString()
            i.putExtra("nome", novonome)
            setResult(1,i)
            finish()
        }

        binding.buttonCancelar.setOnClickListener {
            setResult(2,i)
            finish()
        }

    }
}