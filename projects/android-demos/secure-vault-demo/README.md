# Secure Vault Demo

A portfolio-safe Android demonstration of secure local storage using the Android Keystore and AES-GCM encryption.

> **Portfolio note:** This is an independently created hands-on demo. It is inspired by security concepts relevant to my previous professional Android application, **My Folder: Safe Secure Hidden App**, but it does not reproduce or expose employer-owned source code.

## What this project demonstrates

- Android Keystore-backed AES key management
- AES-GCM encryption and decryption
- Secure local persistence of encrypted content
- Separation of UI, repository, and encryption responsibilities
- Practical secure-storage patterns for Android applications

## Technology

- Kotlin
- Android SDK
- AndroidX AppCompat
- Android Keystore
- AES-GCM (`AES/GCM/NoPadding`)
- SharedPreferences for encrypted demo data

## Demo Flow

1. Enter a private note.
2. Select **Encrypt & Save**.
3. The note is encrypted using an Android Keystore-backed AES key before persistence.
4. Select **Decrypt & Read** to retrieve and decrypt the stored note.

## Project Structure

```text
secure-vault-demo/
├── app/
│   ├── src/main/
│   │   ├── AndroidManifest.xml
│   │   └── java/com/nehakhunt/securevaultdemo/
│   │       ├── MainActivity.kt
│   │       ├── SecureRepository.kt
│   │       └── SecureVault.kt
│   └── build.gradle.kts
├── build.gradle.kts
└── settings.gradle.kts
```

## Security Notes

The demo stores only encrypted note content in `SharedPreferences`; the encryption key is managed by the Android Keystore. The repository does not contain credentials, API keys, signing files, or proprietary application code.

For a production-grade secure file-management application, additional controls would be appropriate depending on requirements, such as biometric authentication, Storage Access Framework integration, MediaStore handling, secure file encryption, key lifecycle management, and protected metadata.

## Related Professional Experience

My previous professional work included **My Folder: Safe Secure Hidden App**, a secure file-management application. That professional project is documented separately under `projects/professional-projects/my-folder-secure-app/` because its original source code was employer-owned.
