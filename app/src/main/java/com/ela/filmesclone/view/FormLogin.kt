package com.ela.filmesclone.view

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ela.filmesclone.R
import com.ela.filmesclone.databinding.ActivityFormLoginBinding

class FormLogin : AppCompatActivity() {
    private lateinit var binding: ActivityFormLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = Color.parseColor("#000000")
        //binding.editEmail.requestFocus()

        binding.btEntrar.setOnClickListener(){
            val email = binding.editEmail.text.toString()
            val senha = binding.editSenha.text.toString()

            when {
                email.isEmpty() -> {
                    binding.containerEmail.helperText = "Preencha o email"
                    binding.containerEmail.boxStrokeColor = Color.parseColor("#FF8F00")
                }
                senha.isEmpty() -> {
                    binding.containerSenha.helperText = "Preencha a senha"
                    binding.containerSenha.boxStrokeColor = Color.parseColor("#FF8F00")
                }
            }
        }

        binding.txtTelaCadastro.setOnClickListener(){
            val intent = Intent(this,FormCadastro::class.java)
            startActivity(intent)
        }
    }
}