package com.example.a06_intent_extras_dizer_ola

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_intent_extras_dizer_ola.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val nome = i.extras?.getString("nome")

        binding.textDizerOlaNome.text = "Olá " + nome
    }
}