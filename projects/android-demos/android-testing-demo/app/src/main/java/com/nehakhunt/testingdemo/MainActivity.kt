package com.nehakhunt.testingdemo

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        val input = EditText(this).apply { hint = "Password" }
        val result = TextView(this)
        val button = Button(this).apply { text = "Validate"; setOnClickListener { result.text = if (PasswordValidator().isValid(input.text.toString())) "Valid" else "Invalid" } }
        setContentView(LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(40,40,40,40); addView(input); addView(button); addView(result) })
    }
}
