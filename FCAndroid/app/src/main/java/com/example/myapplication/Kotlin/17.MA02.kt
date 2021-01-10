package com.example.myapplication.Kotlin

fun second(score: Int): String {
    if (score >= 90) return "A"
    else if(score >= 80) return "B"
    else if(score >= 70) return "C"
    else return "F" //when 사용 가능
}

fun main(array: Array<String>) {
    println(second(80))
}