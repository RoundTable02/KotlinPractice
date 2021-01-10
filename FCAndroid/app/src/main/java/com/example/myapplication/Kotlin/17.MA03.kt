package com.example.myapplication.Kotlin

fun third(number: Int): Int {
    val a: Int = number / 10
    val b: Int = number % 10
    return a+b
}

fun main(args: Array<String>) {
    println(third(32))
}