package com.nehakhunt.analyticsdemo

object AnalyticsEvent {
    const val ACTION_COMPLETED = "action_completed"
    const val FEATURE_OPENED = "feature_opened"
    const val ITEM_SELECTED = "item_selected"
    const val ERROR_ENCOUNTERED = "error_encountered"
    const val SESSION_STARTED = "demo_session_started"

    const val PARAM_ACTION_NAME = "action_name"
    const val PARAM_SOURCE = "source"
    const val PARAM_FEATURE = "feature_name"
    const val PARAM_ITEM = "item_name"
    const val PARAM_ERROR = "error_type"
    const val PARAM_SCREEN = "screen_name"
}
