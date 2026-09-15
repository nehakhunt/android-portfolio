package com.nehakhunt.analyticsdemo

import androidx.lifecycle.ViewModel

class AnalyticsViewModel(private val repository: AnalyticsRepository) : ViewModel() {

    fun startSession() = repository.startSession()

    fun openFeature(featureName: String) = repository.openFeature(featureName)

    fun selectItem(itemName: String) = repository.selectItem(itemName)

    fun completeAction(actionName: String) = repository.completeAction(actionName)

    fun reportError(errorType: String, screenName: String) =
        repository.reportError(errorType, screenName)
}
