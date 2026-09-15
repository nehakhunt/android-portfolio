package com.nehakhunt.securefolder

import android.content.Context

class SecureRepository(context: Context) {
    private val prefs = context.getSharedPreferences("secure_folder", Context.MODE_PRIVATE)
    private val vault = SecureVault()
    fun saveNote(note: String) { prefs.edit().putString("note", vault.encrypt(note)).apply() }
    fun readNote(): String? = prefs.getString("note", null)?.let(vault::decrypt)
}
