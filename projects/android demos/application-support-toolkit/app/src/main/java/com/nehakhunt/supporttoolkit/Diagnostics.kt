package com.nehakhunt.supporttoolkit

object HttpDiagnostics { fun classify(code: Int): String = when(code) { in 200..299 -> "Success"; in 300..399 -> "Redirect"; in 400..499 -> "Client error"; in 500..599 -> "Server error"; else -> "Unknown" } }

data class Incident(val symptom: String, val component: String, val rootCause: String, val fix: String)
