package br.senac.exemplointents.extras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExExtrasDetalheBinding

class ExExtrasDetalhe : AppCompatActivity() {
    lateinit var binding: ActivityExExtrasDetalheBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExExtrasDetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nome = intent.getStringExtra("nome")


        binding.textNome.text= "Nome:  $nome"

        binding.buttonVoltar.setOnClickListener {
            finish()
        }
    }
}