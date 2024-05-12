package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btcalcular = findViewById<Button>(R.id.btcalcular)

        btcalcular.setOnClickListener {

            val pesoStr: String = edtpeso.text.toString()
            val alturaStr: String = edtaltura.text.toString()


            if (pesoStr == "" || alturaStr == "") {

                Snackbar.make(
                    edtpeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ).show()

            } else {

                val peso = pesoStr.toFloat() //
                val altura = alturaStr.toFloat()

                val alturax2 = altura * altura
                val result = peso / alturax2

                println("O seu IMC é : " + result)

            }


        }
    }
}