package com.example.intentandbundles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_second)

        val bundle = intent.extras
        var nameExtras: String? = null
        nameExtras = bundle?.getString("name", "AGS Transact")
        tv_name.text = "Hello $nameExtras"

    }
}