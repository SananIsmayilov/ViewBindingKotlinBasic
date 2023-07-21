package com.example.sananismayilov.mykotlinproject

import android.content.Context
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.sananismayilov.mykotlinproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private  lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val  view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            binding.textView.text = "Button clicked"
            binding.button.visibility = View.INVISIBLE
        }


    }
}

