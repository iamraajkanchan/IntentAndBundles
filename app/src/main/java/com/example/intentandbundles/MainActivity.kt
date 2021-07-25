package com.example.intentandbundles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        bt_submit.setOnClickListener {
            Intent(applicationContext, SecondActivity::class.java).apply {
                putExtra("name", ed_name.text.toString())
                startActivity(this)
            }
        }
    }
}