package com.nehakhunt.securevaultdemo

import android.content.Context

class SecureRepository(context: Context) {
    private val prefs = context.getSharedPreferences("secure_vault", Context.MODE_PRIVATE)
    private val vault = SecureVault()

    fun saveNote(note: String) {
        prefs.edit().putString("note", vault.encrypt(note)).apply()
    }

    fun readNote(): String? = prefs.getString("note", null)?.let(vault::decrypt)
}
