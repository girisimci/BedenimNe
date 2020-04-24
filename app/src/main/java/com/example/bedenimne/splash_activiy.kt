package com.example.bedenimne

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class splash_activiy : AppCompatActivity() {

    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_activiy)

        handler= Handler()
        handler.postDelayed({
            val intent = Intent(this, tanitimActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}
