package br.senac.exemplointents.explicito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExExplicitoBinding

class ExExplicito : AppCompatActivity() {
    lateinit var binding: ActivityExExplicitoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExExplicitoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIr.setOnClickListener {
            val intent = Intent(this, ExExplicitoDetalhe::class.java)
            startActivity(intent)
        }
    }
}