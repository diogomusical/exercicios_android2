package com.example.a06_intent_extras_dizer_ola

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_intent_extras_dizer_ola.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDizerOla.setOnClickListener {
            val nome: String = binding.editNome.text.toString()
            val i: Intent = Intent(this, MainActivity2::class.java)
            i.putExtra("nome",nome)
            startActivity(i)
        }
    }
}