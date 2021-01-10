package com.example.myapplication.Kotlin

// 변수의 접근 범위
// 1. 전역 변수
// 2. 지역 변수
// 지역변수를 활용하자. 가능한 작게

var number100: Int = 10

fun main(args: Array<String>) {
    println(number100)
    val test = Test("홍길동")
    test.testFun()
    println(number100)
}

class Test(var name:String){
    fun testFun(){
        var birth:String ="2000/03/01"
        name="홍길동"
        number100 = 100
    }
    fun testFun2(){
        name
        //birth는 에러
    }
}