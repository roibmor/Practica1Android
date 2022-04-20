package com.example.rocioibanez

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.content.Intent


const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    /** Función que es llamada cuando el usuario pulsa el botón 'ENVIAR' */
    fun sendMessage(view: View) {
        // función que enlaza un recurso de la interfaz de usuario de la app con una variable en nuestro código
        val editText = findViewById<EditText>(R.id.editTextTextPersonName3)
        val message = editText.text.toString()
        // intent es un objeto que proporciona vinculación en tiempo de ejecución entre componentes separados
        // en este caso, inicia una actividad
        // displayMessageActivity crea el archivo de diseño activity_display_message.xml
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

}