package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class nullSafety : AppCompatActivity() {
    lateinit var lateCar: Car
    class Car(var number:Int){
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        lateCar = Car(10)
        val number : Int = 10
        val number1 : Int? = null

        val number3 = number1?.plus(number)


        //삼항연산자 >> 엘비스 연산자
        val number4 = number1 ?:10
    }
    fun plus (a:Int, b:Int?): Int{
        if (b !=null) return a+b
        else return a
    }
}