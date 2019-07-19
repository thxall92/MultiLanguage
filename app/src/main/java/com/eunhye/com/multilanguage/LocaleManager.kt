package com.eunhye.com.multilanguage

import android.content.Context
import android.content.SharedPreferences
import android.content.res.Configuration
import android.preference.PreferenceManager
import java.util.*

object LocaleManager{
    val SELECTED_LANGUAGE = "USER_LANGUAGE"
    var mSharedPreference: SharedPreferences? = null

    var mEnglishFlag = "en"
    var mKoreanFlag = "ko"
    var mIndonesianFlag = "in"

    fun setLocale(context: Context?): Context {
        return updateResources(context!!, getCurrentLanguage(context)!!)
    }

    fun setNewLocale(context: Context, language: String) {
        persistLanguagePreference(context, language)
        updateResources(context, language)
    }

    fun getCurrentLanguage(context: Context?): String? {
        if (mSharedPreference == null) {
            mSharedPreference = PreferenceManager.getDefaultSharedPreferences(context)
        }

        return mSharedPreference!!.getString(SELECTED_LANGUAGE, "")
    }

    private fun persistLanguagePreference(context: Context, language: String) {
        if (mSharedPreference == null) {
            mSharedPreference = PreferenceManager.getDefaultSharedPreferences(context)
        }

        mSharedPreference!!.edit().putString(SELECTED_LANGUAGE, language).apply()
    }

    private fun updateResources(context: Context, language: String): Context {
        var contextFun = context

        val locale = Locale(language)
        Locale.setDefault(locale)

        val resources = context.resources
        val configuration = Configuration(resources.configuration)
        configuration.setLocale(locale)
        contextFun = context.createConfigurationContext(configuration)

        return contextFun
    }


}