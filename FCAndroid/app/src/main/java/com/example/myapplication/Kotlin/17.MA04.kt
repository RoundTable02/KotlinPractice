package com.example.myapplication.Kotlin

fun gugudan() {
    for (i in 1..9) {
        for (k in 1..9)
            println("$i X $k = "+ i*k)
    }
}

fun main(args: Array<String>) {
    gugudan()
}