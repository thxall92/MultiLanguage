package com.eunhye.com.multilanguage

import android.app.Application
import android.content.Context

class App : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(LocaleManager.setLocale(base))
    }
}