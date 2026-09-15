package com.nehakhunt.analyticsdemo

class AnalyticsRepository(private val tracker: AnalyticsTracker) {

    fun startSession() = tracker.trackSessionStarted("app_launch")

    fun openFeature(featureName: String) = tracker.trackFeatureOpened(featureName, "home")

    fun selectItem(itemName: String) = tracker.trackItemSelected(itemName, "feature_screen")

    fun completeAction(actionName: String) = tracker.trackAction(actionName, "feature_screen")

    fun reportError(errorType: String, screenName: String) =
        tracker.trackError(errorType, screenName)
}
