package com.example.intent_task_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()

    }

    private fun initViews(){
        val tV_detail = findViewById<TextView>(R.id.tV_detail)
        val user = intent.getParcelableExtra<User>("Object")
        tV_detail.setText(user.toString())
    }
}