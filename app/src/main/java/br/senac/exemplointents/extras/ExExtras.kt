package br.senac.exemplointents.extras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExExtrasBinding
import br.senac.exemplointents.databinding.ActivityExImplicitoBinding
import br.senac.exemplointents.databinding.ActivityExemploExtrasBinding

class ExExtras : AppCompatActivity() {
    lateinit var binding: ActivityExExtrasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex_extras)

        binding = ActivityExExtrasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIr.setOnClickListener{
            val intent  = Intent(this, ExExtrasDetalhe::class.java)
            startActivity(intent)

            intent.putExtra("nome", binding.editNomeEx.text.toString())

            startActivity(intent)
        }
    }
}