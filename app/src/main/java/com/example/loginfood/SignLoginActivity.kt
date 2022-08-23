package com.example.loginfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginfood.databinding.ActivitySignLoginBinding

class SignLoginActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.textViewSignUp.setOnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }


    }
}