package com.example.myapplication.Kotlin

// if, else if, else

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10

//    if (a > b) {
//        println("a가 b보다 크다")
//    } else {
//        println("a가 b보다 작다")
//    }
    // 사용법2
//    if (a > b) {
//////        println("a가 b보다 크다")
//////    } else if (a < b) {
//////        println("a가 b보다 작다")
//////    } else
//////        println("a와 b가 같다")
    //값을 리턴하는 if
    val max = if (a > b) {
        a
    } else {
        b
    }
    println(max)
//값을 리턴한는 if 축약형
    // 내용물 별로 없으면 중괄호 생략 가능
    val max1 = if (a > b) a else b
}