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
            val peso = edtPeso.text
            println("O peso é " + peso)

            val altura = edtAltura.text
            println(" sua altura é" + altura)

        }
    }
}