# Android Analytics Demo

A portfolio demonstration of Android analytics and behavioral event tracking using Kotlin. This project is intended to demonstrate how I think about event design, user journeys, analytics instrumentation, and debugging.

> **Portfolio note:** This is a learning/portfolio demonstration and is not proprietary production code from a previous employer.

## Goals

- Demonstrate clean analytics event naming and parameter design
- Track meaningful user interactions and screen/user journeys
- Show how analytics can support product and application analysis
- Practice Firebase Analytics integration and analytics debugging
- Document concepts relevant to Google Tag Manager (GTM) and Adobe Analytics

## Planned Demo Features

- Screen/view tracking
- Button and feature interaction events
- Custom event parameters
- User journey examples
- Analytics debug checklist
- Example data-layer concepts for GTM
- Documentation of how analytics events could support behavioral analysis

## Technology

- Kotlin
- Android SDK
- Android Jetpack
- Firebase Analytics
- Google Tag Manager concepts
- MVVM-oriented structure

## Example Event Design

| Event | Example Parameters | Purpose |
|---|---|---|
| `screen_view` | `screen_name` | Understand screen usage |
| `feature_opened` | `feature_name` | Measure feature discovery |
| `action_completed` | `action_name`, `source` | Measure successful actions |
| `error_encountered` | `error_type`, `screen_name` | Support troubleshooting and analysis |

## Analytics Approach

I focus on tracking business-relevant behavior rather than collecting events without a clear purpose. Events should have consistent names, useful parameters, and documented ownership so that the resulting data can be interpreted reliably.

## Debugging Checklist

1. Confirm the event is triggered at the expected user action.
2. Verify event names and parameter values.
3. Check analytics debug output.
4. Confirm events are not duplicated.
5. Validate important user journeys end-to-end.
6. Document changes when instrumentation is updated.

## Future Enhancements

- Add a complete runnable sample app
- Add Firebase Analytics DebugView screenshots
- Add automated analytics event tests where practical
- Add a GTM data-layer example
- Expand the Adobe Analytics learning notes

## Related Skills

Kotlin, Android SDK, Firebase, Firebase Analytics, Google Tag Manager, behavioral tracking, application troubleshooting, debugging, MVVM, documentation.
