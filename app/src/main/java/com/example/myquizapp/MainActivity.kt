package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnStart : Button = findViewById(R.id.btn_start)
        val etName : EditText = findViewById(R.id.et_name)

        btnStart.setOnClickListener {
            if(etName.text.isEmpty()) {
                AlertDialog.Builder(this)
                    .setTitle("Warning!")
                    .setMessage("Please enter your name.")
                    .setPositiveButton(android.R.string.ok) { dialog, which -> }
                    .create()
                    .show()
            } else {
                startActivity(Intent(
                    this,
                    QuizQuestionActivity::class.java
                ))
                finish()
            }
        }
    }
}