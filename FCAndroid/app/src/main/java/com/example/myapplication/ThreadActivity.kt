package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_thread.*

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)



        val runnable : Runnable = object : Runnable{
            override fun run(){

                Log.d("thread1","thread is made")
            }
        }
        val thread: Thread = Thread(runnable)

        button01.setOnClickListener {
            thread.start()
        }

        Thread(Runnable {
            Thread.sleep(2000)
            Log.d("thread1","thread is made")
        }).start()

    }
}