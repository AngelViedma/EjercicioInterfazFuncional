package com.tdam.tema1ejemplos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton=findViewById<Button>(R.id.button_main)
        val texto=findViewById<TextView>(R.id.texto1)
        val texto_introducido=findViewById<TextView>(R.id.texto_introducido)
        val datos_nombre=findViewById<EditText>(R.id.datos_nombre)
        val datos_apellido=findViewById<EditText>(R.id.datos_apellido)



        texto.text="Introduce tu nombre y apellido:"



        boton.setOnClickListener{
            val nombre=datos_nombre.text.toString()
            val apellido= datos_apellido.text.toString()

            texto_introducido.text="Tu nombre es $nombre \n" +
                                   "Tu apellido es $apellido"
            boton.isClickable=false
            boton.isVisible=false

        }

    }

}