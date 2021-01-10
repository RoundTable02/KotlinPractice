package com.example.myapplication.Kotlin

fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //반복 1
    for (item in a) {
        if (item == 5) {
            println("Item is Five")
        } else {
            println("Item is not Five")
        }
    }

    //반복 2
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value :" + item)
    }
    println()

    //반복 3
    a.forEach {
        println(it) //it에 a가 담김
    }

    //반복 4
    a.forEach { item ->
        println(item) //item에 a가 담김
    }

    //반복 5
    a.forEachIndexed { index, item ->
        println("index : " + index + " value :" + item)
    }

    //반복 6
    for (i in 0 until a.size) {
        //0부터 a.size보다 하나 작은 수 까지 (마지막을 포함하지 않음)
        println(a[i])
    }

    //반복 7
    for (i in 0 until a.size step (2)) { //2씩 증가
        println(a[i])
    }

    //반복 8
    for (i in a.size - 1 downTo (0)) {
        //8부터 0까지 반복
        println(a.get(i))
    }

    //반복 9
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }

    //반복 10
    for (i in 0..10) { //until과 달리 마지막 포함
        println(i)
    }
    println()

    //반복 11
    var b: Int = 0
    var c: Int = 4

    while (b < c) { //조건을 만족시키지 않으면 무조건 실행되지 않음
        b++
        println("b")
    }

    var d: Int = 0
    var e: Int = 4
    //반복 12
    do { //무조건 한 번은 실행됨
        println("hello")
    } while (d < e) // 조건
}