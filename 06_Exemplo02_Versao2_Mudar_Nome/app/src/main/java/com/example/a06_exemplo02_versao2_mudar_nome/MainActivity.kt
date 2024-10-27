package com.example.a06_exemplo02_versao2_mudar_nome

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exemplo02_versao2_mudar_nome.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var result: ActivityResultLauncher<Intent>
    private var nome = "Utilizador"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMudarNome.setOnClickListener {
            val i: Intent = Intent(this, MainActivity2::class.java)
            i.putExtra("nome",nome)
            result.launch(i)
        }

        result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if(it.resultCode == 1 && it.data != null){
                nome = it.data!!.extras?.getString("nome").toString()
                binding.textNome.text = "Olá $nome"
            } else if (it.resultCode == 2 && it.data != null){
                Toast.makeText(applicationContext, "Operação cancelada", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Erro", Toast.LENGTH_SHORT).show()
            }
        }
    }
}