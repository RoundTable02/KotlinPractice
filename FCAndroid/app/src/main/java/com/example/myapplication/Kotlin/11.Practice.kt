package com.example.myapplication.Kotlin

fun main(args: Array<String>) {
    val value: Int? = null

    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null
    when (value2) {
        true -> {
            println("")
        }
        false -> {
            println("")
        }
        null -> {
            println("")
        }
    }
    //값을 리턴하는 When 구문의 경우 반드시 값을 리턴해야 한다.
    val value3 = when(value2){
        true->1
        false->3
        null->4
    }
    println(value3)

    val value4: Int = 10
    when (value4){
        is Int -> {
            println("value4 is Int")
        }
        else -> {
            println("value4 is not Int")
        }
    }

    val value5: Int =87
    when (value5){
        in 60..70->{
            println("value is in 60-70")
        }
        in 70..80->{
            println("value is in 70-80")
        }
        in 80..90->{
            println("value is in 80-90")
        }
    }
}