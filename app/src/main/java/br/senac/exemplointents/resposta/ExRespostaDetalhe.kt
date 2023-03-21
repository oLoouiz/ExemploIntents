package br.senac.exemplointents.resposta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExRespostaDetalheBinding

class ExRespostaDetalhe : AppCompatActivity() {
    lateinit var binding: ActivityExRespostaDetalheBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExRespostaDetalheBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonArqueiro.setOnClickListener {
            responder("Arqueiro")
        }
        binding.buttonGuerreiro.setOnClickListener {
            responder("Guerreiro")
        }
        binding.buttonLadrao.setOnClickListener {
            responder("Ladrão")
        }
        binding.buttonMago.setOnClickListener {
            responder("Mago")
        }

    }
    fun responder(classe: String){
        val respIntent = Intent()

        respIntent.putExtra("classe", classe)
        setResult(RESULT_OK, respIntent)

        finish()
    }
}