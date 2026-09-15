plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android { namespace = "com.nehakhunt.locationdemo"; compileSdk = 35; defaultConfig { applicationId = "com.nehakhunt.locationdemo"; minSdk = 24; targetSdk = 35; versionCode = 1; versionName = "1.0" } }
dependencies { implementation("androidx.core:core-ktx:1.15.0"); implementation("androidx.appcompat:appcompat:1.7.0"); implementation("com.google.android.gms:play-services-location:21.3.0"); implementation("com.google.android.gms:play-services-maps:19.0.0") }
