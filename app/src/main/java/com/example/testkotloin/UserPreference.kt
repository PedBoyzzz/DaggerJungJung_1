package com.example.testkotloin

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject
//ถ้าใส่ @Provides ที่ Module ไปแล้ว ก็ไม่ต่องใส่ Inject constructor ก็ได้
class UserPreference /*@Inject constructor*/(var context: Context) {
    companion object {
        private const val PREFERENCE_NAME = "user_preference"
        private const val KEY_ID = "key_id"
        private const val KEY_NAME = "key_name"
    }
    fun getInt() = 10
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun saveUserId(id: Long) {
        sharedPreferences.edit().putLong(KEY_ID, id).apply()
    }

    fun saveUserName(name: String) {
        sharedPreferences.edit().putString(KEY_NAME, name).apply()
    }

    fun getUserId(): String? = sharedPreferences.getString(KEY_ID, null)

    fun getUserName(): String? = sharedPreferences.getString(KEY_NAME, null)
}