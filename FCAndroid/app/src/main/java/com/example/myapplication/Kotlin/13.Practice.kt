package com.example.myapplication.Kotlin

fun main(array: Array<String>){
    val array = arrayOf<Int>(1,2,3)

    val number = array.get(0)
    println(number)

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    // Array의 크기
    // 처음만들 때 결정된다

    // Array를 만드는 방법3
    val a1 = intArrayOf(1,2,3)
    val a2 = charArrayOf('b','c') //char는 '', String은 ""
    val a3 = doubleArrayOf(1.2,100.348)
    val a4 = booleanArrayOf(true, false, true)

    // Array를 만드는 방법4 -> lambda 활용
    var a5 = Array(10,{0}) //사이즈, 0으로 모두 채움
    var a6 = Array(5, {1;2;3;4;5})
}