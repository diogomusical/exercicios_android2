package com.example.a05_exemplo01_2_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a05_exemplo01_2_activity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}