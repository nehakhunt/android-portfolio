# My Secure Folder — Portfolio Demo

A newly created, portfolio-safe secure-vault demonstration inspired by the technical themes of my previous Android secure file-management application. It does **not** reproduce proprietary source code.

**Technologies:** Kotlin, Android Keystore, AES-GCM encryption, SharedPreferences, Android SDK, secure local storage patterns.

The demo encrypts a private note before persistence and decrypts it only through the Android Keystore-backed key. Production versions can extend this foundation with Storage Access Framework, MediaStore, biometric authentication, recycle-bin metadata, duplicate-file detection and large-file analysis.
