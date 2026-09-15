package com.nehakhunt.analyticsdemo

import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

class AnalyticsTracker(private val analytics: FirebaseAnalytics) {

    fun trackScreen(screenName: String, screenClass: String) {
        analytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, Bundle().apply {
            putString(FirebaseAnalytics.Param.SCREEN_NAME, screenName)
            putString(FirebaseAnalytics.Param.SCREEN_CLASS, screenClass)
        })
    }

    fun trackAction(actionName: String, source: String) {
        analytics.logEvent("action_completed", Bundle().apply {
            putString("action_name", actionName)
            putString("source", source)
        })
    }

    fun trackError(errorType: String, screenName: String) {
        analytics.logEvent("error_encountered", Bundle().apply {
            putString("error_type", errorType)
            putString("screen_name", screenName)
        })
    }
}
