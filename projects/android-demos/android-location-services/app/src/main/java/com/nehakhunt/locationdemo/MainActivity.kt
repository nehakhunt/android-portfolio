package com.nehakhunt.locationdemo

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.LocationServices

class MainActivity : AppCompatActivity() {
    private val client by lazy { LocationServices.getFusedLocationProviderClient(this) }
    private val requestCode = 10
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        val status = TextView(this).apply { text = "Location Services Demo"; textSize = 20f }
        val button = Button(this).apply { text = "Get Current Location" }
        setContentView(LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(40,40,40,40); addView(status); addView(button) })
        button.setOnClickListener { getLocation(status) }
    }
    private fun getLocation(status: TextView) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) { ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), requestCode); return }
        client.lastLocation.addOnSuccessListener { location -> status.text = if (location != null) "Latitude: ${location.latitude}\nLongitude: ${location.longitude}" else "Location unavailable. Try again." }.addOnFailureListener { status.text = "Location error: ${it.message}" }
    }
}
