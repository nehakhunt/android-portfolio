package com.nehakhunt.analyticsdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: AnalyticsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val analytics = FirebaseAnalytics.getInstance(this)
        val tracker = AnalyticsTracker(analytics)
        val repository = AnalyticsRepository(tracker)
        viewModel = ViewModelProvider(this, AnalyticsViewModelFactory(repository))[AnalyticsViewModel::class.java]

        tracker.trackScreen("home", "MainActivity")
        viewModel.startSession()

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 48, 48, 48)
        }

        layout.addView(TextView(this).apply {
            text = "Android Analytics Demo"
            textSize = 24f
        })

        layout.addView(TextView(this).apply {
            text = "Firebase Analytics + MVVM + event tracking"
            textSize = 16f
        })

        layout.addView(Button(this).apply {
            text = "Open Feature Demo"
            setOnClickListener {
                viewModel.openFeature("product_demo")
                startActivity(Intent(this@MainActivity, FeatureActivity::class.java))
            }
        })

        layout.addView(Button(this).apply {
            text = "Complete Home Action"
            setOnClickListener {
                viewModel.completeAction("home_demo_action")
            }
        })

        layout.addView(Button(this).apply {
            text = "Track Sample Error"
            setOnClickListener {
                viewModel.reportError("sample_network_error", "home")
            }
        })

        setContentView(layout)
    }
}
