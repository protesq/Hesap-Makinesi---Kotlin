package com.kodotagi.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val editText1 = findViewById<EditText>(R.id.sayi1)
        val editText2 = findViewById<EditText>(R.id.sayi2)
        val but_topla = findViewById<Button>(R.id.toplab)
        val but_cikar = findViewById<Button>(R.id.cikarb)
        val but_carp = findViewById<Button>(R.id.carpb)
        val but_bol = findViewById<Button>(R.id.bolb)
        val s_text = findViewById<TextView>(R.id.sonuctext)


        but_topla.setOnClickListener(){
            val sayi1 = editText1.text.toString().toInt()
            val sayi2 = editText2.text.toString().toInt()
            val toplam = sayi1 + sayi2
            s_text.text=toplam.toString()
        }

        but_cikar.setOnClickListener(){
            val sayi1 = editText1.text.toString().toInt()
            val sayi2 = editText2.text.toString().toInt()
            val toplam = sayi1 - sayi2
            s_text.text=toplam.toString()
        }

        but_carp.setOnClickListener(){
            val sayi1 = editText1.text.toString().toInt()
            val sayi2 = editText2.text.toString().toInt()
            val toplam = sayi1 * sayi2
            s_text.text=toplam.toString()
        }

        but_bol.setOnClickListener(){
            val sayi1 = editText1.text.toString().toFloat()
            val sayi2 = editText2.text.toString().toFloat()
            val toplam = sayi1 / sayi2
            s_text.text=toplam.toString()
        }
    }
}