package com.eunhye.com.multilanguage

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ChangeLanguageActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_language)

        val btnChangeEng = findViewById<TextView>(R.id.tv_change_english)
        val btnChangeKo = findViewById<TextView>(R.id.tv_change_korean)
        val btnChangeIn = findViewById<TextView>(R.id.tv_change_indonesian)

        btnChangeEng.setOnClickListener{
            LocaleManager.setNewLocale(this, LocaleManager.mEnglishFlag)
            Toast.makeText(this, "changed!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,SplashActivity::class.java))
        }
        btnChangeKo.setOnClickListener{
            LocaleManager.setNewLocale(this, LocaleManager.mKoreanFlag)
            Toast.makeText(this, "changed!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,SplashActivity::class.java))
        }
        btnChangeIn.setOnClickListener{
            LocaleManager.setNewLocale(this, LocaleManager.mIndonesianFlag)
            Toast.makeText(this, "changed!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,SplashActivity::class.java))
        }
    }
}
