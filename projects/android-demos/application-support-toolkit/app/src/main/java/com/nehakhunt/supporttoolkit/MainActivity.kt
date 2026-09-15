package com.nehakhunt.supporttoolkit

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        val code = EditText(this).apply { hint = "HTTP status code"; inputType = 2 }
        val output = TextView(this)
        val button = Button(this).apply { text = "Analyze Incident"; setOnClickListener { val n = code.text.toString().toIntOrNull(); output.text = if (n == null) "Enter a valid status code" else "HTTP $n: ${HttpDiagnostics.classify(n)}\nNext: reproduce → collect logs → isolate component → verify fix" } }
        setContentView(LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(40,40,40,40); addView(code); addView(button); addView(output) })
    }
}
