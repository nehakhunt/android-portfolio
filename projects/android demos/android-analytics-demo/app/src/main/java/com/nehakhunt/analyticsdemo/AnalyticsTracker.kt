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

    fun trackSessionStarted(source: String) {
        analytics.logEvent(AnalyticsEvent.SESSION_STARTED, Bundle().apply {
            putString(AnalyticsEvent.PARAM_SOURCE, source)
        })
    }

    fun trackFeatureOpened(featureName: String, source: String) {
        analytics.logEvent(AnalyticsEvent.FEATURE_OPENED, Bundle().apply {
            putString(AnalyticsEvent.PARAM_FEATURE, featureName)
            putString(AnalyticsEvent.PARAM_SOURCE, source)
        })
    }

    fun trackItemSelected(itemName: String, source: String) {
        analytics.logEvent(AnalyticsEvent.ITEM_SELECTED, Bundle().apply {
            putString(AnalyticsEvent.PARAM_ITEM, itemName)
            putString(AnalyticsEvent.PARAM_SOURCE, source)
        })
    }

    fun trackAction(actionName: String, source: String) {
        analytics.logEvent(AnalyticsEvent.ACTION_COMPLETED, Bundle().apply {
            putString(AnalyticsEvent.PARAM_ACTION_NAME, actionName)
            putString(AnalyticsEvent.PARAM_SOURCE, source)
        })
    }

    fun trackError(errorType: String, screenName: String) {
        analytics.logEvent(AnalyticsEvent.ERROR_ENCOUNTERED, Bundle().apply {
            putString(AnalyticsEvent.PARAM_ERROR, errorType)
            putString(AnalyticsEvent.PARAM_SCREEN, screenName)
        })
    }
}
