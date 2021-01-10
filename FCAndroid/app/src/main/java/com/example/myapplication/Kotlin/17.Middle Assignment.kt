package com.example.myapplication.Kotlin

fun main(args: Array<String>) {
    val a = MutableList(9, {0})
    for (i in 0..8) {
        a[i]=i+1
    }

    val b = MutableList(9, { true })
    a.forEachIndexed { index, value ->
        if (value % 2 == 0) {
            b[index] = true
        } else {
            b[index] = false
        }
    }
    println(a)
    println(b)
}