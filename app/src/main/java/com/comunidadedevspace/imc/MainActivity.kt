package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btcalcular = findViewById<Button>(R.id.btcalcular)

        btcalcular.setOnClickListener {
            val peso: Float = edtPeso.text.toString().toFloat()
            val altura: Float = edtAltura.text.toString().toFloat()

            val alturax2 = altura * altura
            val resul = peso / alturax2

            println("O seu IMC é : " + resul)

        }
    }
}