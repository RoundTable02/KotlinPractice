package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resource02.*

class resource02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource02)

        val ment = resources.getString(R.string.hello)

        val ment2 = getString(R.string.hello)

        val color = getColor(R.color.colorText)
        
        button.setBackgroundColor(getColor(R.color.colorText))
    }
}