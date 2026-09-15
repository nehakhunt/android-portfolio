# Android Analytics Demo

A runnable Android portfolio demonstration of analytics instrumentation and behavioral event tracking using Kotlin and Firebase Analytics.

> **Portfolio note:** This is a learning/portfolio demonstration. It is newly created and does not contain proprietary production code from a previous employer.

## What this project demonstrates

- Designing meaningful analytics events instead of collecting unnecessary data
- Screen/view tracking
- Custom events with parameters
- A reusable `AnalyticsTracker` helper
- User-action and error-event patterns
- Analytics debugging and validation
- Concepts that can be applied with Google Tag Manager (GTM)
- Behavioral analysis thinking relevant to Android application support and analytics roles

## Technology

- Kotlin
- Android SDK
- AndroidX
- Firebase Analytics
- Gradle Kotlin DSL

## Event Design

| Event | Parameters | Purpose |
|---|---|---|
| `screen_view` | `screen_name`, `screen_class` | Understand screen usage |
| `action_completed` | `action_name`, `source` | Measure successful user actions |
| `error_encountered` | `error_type`, `screen_name` | Support troubleshooting and analysis |

### Why event design matters

Events should answer a specific product or support question. Consistent names and useful parameters make analytics easier to understand, validate, and maintain.

## Project Structure

```text
android-analytics-demo/
├── app/
│   ├── src/main/
│   │   ├── AndroidManifest.xml
│   │   └── java/com/nehakhunt/analyticsdemo/
│   │       ├── MainActivity.kt
│   │       └── AnalyticsTracker.kt
│   └── build.gradle.kts
├── build.gradle.kts
└── settings.gradle.kts
```

## Firebase Setup

This repository intentionally does **not** include `google-services.json`, Firebase credentials, API keys, signing files, or other secrets.

To run the project locally:

1. Create or select a Firebase project.
2. Register an Android app using the demo application ID: `com.nehakhunt.analyticsdemo`.
3. Download the generated `google-services.json` into the local `app/` directory.
4. Configure the Google Services Gradle plugin if you want to use Firebase's generated configuration.
5. Build and run the app on an Android device or emulator.
6. Use Firebase Analytics DebugView to validate events.

Never commit private credentials or production configuration to a public repository.

## Analytics Debugging Checklist

1. Confirm the event is triggered by the expected user action.
2. Verify the event name and parameter values.
3. Check Firebase Analytics DebugView/log output.
4. Confirm an event is not firing more than once unexpectedly.
5. Test the complete user journey rather than only one button.
6. Check behavior after configuration or instrumentation changes.
7. Document important analytics changes.

## GTM Concepts

Google Tag Manager can be used as part of an analytics implementation to help manage tracking and data-layer concepts. This demo documents the event structure that could feed a data layer, while the current implementation directly demonstrates Firebase Analytics event logging.

Example conceptual data layer:

```text
screen_name: analytics_demo
action_name: demo_button
source: main_screen
```

## Application Support Perspective

Analytics is useful beyond product reporting. Event data can help investigate where users encounter problems, reproduce important journeys, identify unexpected behavior, and validate whether a fix changes user behavior.

## Adobe Analytics Learning

Adobe Analytics is included in this portfolio as a current learning area. This project does **not** claim previous Adobe Analytics production experience. Future work may document equivalent event concepts and implementation patterns for Adobe Analytics.

## Future Enhancements

- Add a dedicated analytics repository layer
- Add more screens and realistic user journeys
- Add Firebase Analytics DebugView screenshots
- Add automated tests around analytics event construction
- Add a small GTM/data-layer demonstration
- Add comparison notes for Firebase Analytics, GTM, and Adobe Analytics

## Related Skills

Kotlin · Android SDK · Firebase Analytics · Google Tag Manager concepts · Behavioral Tracking · Debugging · Application Support · MVVM concepts · Documentation
