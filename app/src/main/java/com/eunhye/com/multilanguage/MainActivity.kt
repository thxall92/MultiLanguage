package com.eunhye.com.multilanguage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_change_language)
        button.setOnClickListener{
            val nextIntent = Intent(this, ChangeLanguageActivity::class.java)
            startActivity(nextIntent)
        }

    }
}
