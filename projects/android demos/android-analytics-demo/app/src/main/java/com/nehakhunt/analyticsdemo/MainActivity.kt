package com.nehakhunt.analyticsdemo

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.logEvent

class MainActivity : AppCompatActivity() {

    private lateinit var analytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        analytics = FirebaseAnalytics.getInstance(this)

        analytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW) {
            param(FirebaseAnalytics.Param.SCREEN_NAME, "analytics_demo")
            param(FirebaseAnalytics.Param.SCREEN_CLASS, "MainActivity")
        }

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 48, 48, 48)
        }

        val title = TextView(this).apply {
            text = "Android Analytics Demo"
            textSize = 24f
        }

        val button = Button(this).apply {
            text = "Complete Demo Action"
            setOnClickListener {
                analytics.logEvent("action_completed") {
                    param("action_name", "demo_button")
                    param("source", "main_screen")
                }
            }
        }

        layout.addView(title)
        layout.addView(button)
        setContentView(layout)
    }
}
