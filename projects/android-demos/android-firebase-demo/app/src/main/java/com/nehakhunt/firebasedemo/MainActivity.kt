package com.nehakhunt.firebasedemo

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.logEvent
import com.google.firebase.crashlytics.FirebaseCrashlytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        val analytics = FirebaseAnalytics.getInstance(this)
        FirebaseCrashlytics.getInstance().setCustomKey("screen", "firebase_demo")
        analytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW) { param(FirebaseAnalytics.Param.SCREEN_NAME, "firebase_demo") }
        val status = TextView(this).apply { text = "Firebase Analytics + Crashlytics + FCM"; textSize = 18f }
        val event = Button(this).apply { text = "Log Analytics Event"; setOnClickListener { analytics.logEvent("demo_action") { param("source", "firebase_demo") }; status.text = "Analytics event logged" } }
        val crash = Button(this).apply { text = "Record Test Error"; setOnClickListener { FirebaseCrashlytics.getInstance().recordException(IllegalStateException("Portfolio test error")); status.text = "Test error recorded" } }
        setContentView(LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(40,40,40,40); addView(status); addView(event); addView(crash) })
    }
}
