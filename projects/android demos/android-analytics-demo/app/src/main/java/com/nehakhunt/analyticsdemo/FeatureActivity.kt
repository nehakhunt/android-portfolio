package com.nehakhunt.analyticsdemo

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.analytics.FirebaseAnalytics

class FeatureActivity : AppCompatActivity() {

    private lateinit var viewModel: AnalyticsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val analytics = FirebaseAnalytics.getInstance(this)
        val tracker = AnalyticsTracker(analytics)
        val repository = AnalyticsRepository(tracker)
        viewModel = ViewModelProvider(this, AnalyticsViewModelFactory(repository))[AnalyticsViewModel::class.java]

        viewModel.openFeature("product_demo")
        tracker.trackScreen("feature_demo", "FeatureActivity")

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 48, 48, 48)
        }

        layout.addView(TextView(this).apply {
            text = "Feature Demo"
            textSize = 24f
        })

        layout.addView(Button(this).apply {
            text = "Select Product"
            setOnClickListener {
                viewModel.selectItem("demo_product")
            }
        })

        layout.addView(Button(this).apply {
            text = "Complete Action"
            setOnClickListener {
                viewModel.completeAction("demo_conversion")
            }
        })

        layout.addView(Button(this).apply {
            text = "Simulate Error"
            setOnClickListener {
                viewModel.reportError("simulated_validation_error", "feature_demo")
            }
        })

        setContentView(layout)
    }
}
