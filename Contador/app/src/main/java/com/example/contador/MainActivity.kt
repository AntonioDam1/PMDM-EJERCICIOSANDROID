package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var btnSumar: Button
    private lateinit var btnRestar: Button
    private lateinit var edtContador: EditText
    private lateinit var imageReverse: ImageView

    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSumar = findViewById(R.id.buttonSumar)
        btnRestar = findViewById(R.id.buttonRestar)
        edtContador = findViewById(R.id.editTextResultado)
        imageReverse = findViewById(R.id.imageViewReverse)

        actualizarContador()

        btnSumar.setOnClickListener {
            incrementarContador()
        }

        btnRestar.setOnClickListener {
            decrementarContador()
        }

        imageReverse.setOnClickListener {
            reiniciarContador()
        }
    }

    private fun incrementarContador() {
        contador++
        actualizarContador()
    }

    private fun decrementarContador() {
        if (contador > 0) {
            contador--
            actualizarContador()
        }
    }

    private fun reiniciarContador() {
        contador = 0
        actualizarContador()
    }

    private fun actualizarContador() {
        edtContador.setText(contador.toString())
    }


}