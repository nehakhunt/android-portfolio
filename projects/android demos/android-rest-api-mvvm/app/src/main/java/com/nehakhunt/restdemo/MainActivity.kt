package com.nehakhunt.restdemo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        val text = TextView(this).apply { text = "REST API + MVVM\nReady"; textSize = 20f }
        val button = Button(this).apply { text = "Load Posts" }
        val layout = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(40,40,40,40); addView(text); addView(button) }
        setContentView(layout)
        val vm = PostViewModel()
        button.setOnClickListener { vm.loadPosts() }
        lifecycleScope.launch { vm.state.collect { s -> text.text = when { s.loading -> "Loading..."; s.error != null -> "Error: ${s.error}"; s.data != null -> "Loaded ${s.data.size} posts\nFirst: ${s.data.firstOrNull()?.title ?: "None"}"; else -> "Ready" } } }
    }
}
