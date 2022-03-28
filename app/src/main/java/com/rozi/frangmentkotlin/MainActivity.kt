package com.rozi.frangmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firtsFragment = firtsFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, firtsFragment)
            commit()
        }

        val btnfirstfragmen = findViewById<Button>(R.id.btnfirstfragment)

        btnfirstfragmen.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, firtsFragment)
                commit()
            }
        }

        val btnSecondFragmen = findViewById<Button>(R.id.btnsecondfragment)

        btnSecondFragmen.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, secondFragment)
                commit()


            }
        }
    }
}