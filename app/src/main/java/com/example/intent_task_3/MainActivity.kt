package com.example.intent_task_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

    }

    private fun initView(){
        val b_main = findViewById<Button>(R.id.b_main)
        b_main.setOnClickListener(View.OnClickListener {
            val user = User(32,"Asilbek")
            openDetail(user)
        })
    }
    private fun openDetail(user: User){
        val intent = Intent(this,DetailActivity::class.java)
        intent.putExtra("Object", user)
        startActivity(intent)
    }
}