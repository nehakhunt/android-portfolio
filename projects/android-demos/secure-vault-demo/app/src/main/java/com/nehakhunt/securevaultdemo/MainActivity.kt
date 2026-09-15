package com.nehakhunt.securevaultdemo

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repo = SecureRepository(this)
        val input = EditText(this).apply { hint = "Private note" }
        val output = TextView(this)
        val save = Button(this).apply {
            text = "Encrypt & Save"
            setOnClickListener {
                repo.saveNote(input.text.toString())
                output.text = "Encrypted content saved securely"
            }
        }
        val read = Button(this).apply {
            text = "Decrypt & Read"
            setOnClickListener { output.text = repo.readNote() ?: "No secure note" }
        }
        setContentView(LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 40, 40, 40)
            addView(input)
            addView(save)
            addView(read)
            addView(output)
        })
    }
}
