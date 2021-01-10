package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_listener.*

class listener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)
        var number = 10
        // 뷰를 activity로 가져오는 방법
        // 1. 직접 찾아서 가져온다
//        val textView : TextView = findViewById(R.id.hello)
        //2. import한다.
//        hello
        // 1. 람다 방식
        hello.setOnClickListener {
            Log.d("click","Click!!")
            hello.setText("안녕하세요")
            number += 10
            image.setImageResource(R.drawable.cat)
            Log.d("number",""+number)
        }

        // 뷰를 조작하는 함수들
        //setText
        //setImageResource

    }
}