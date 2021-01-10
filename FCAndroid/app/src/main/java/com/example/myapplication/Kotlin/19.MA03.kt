package com.example.myapplication.Kotlin

fun main(args: Array<String>) {
    val tv: TV = TV()
    tv.turnOn()
    tv.change()
    tv.change()
    tv.change()
    tv.change()
    tv.turnOn()
    tv.change()
}

class TV() {
    val b = listOf<String>("MBC", "KBS", "SBS")
    var a: Boolean = true
    var i: Int = 0
    fun turnOn() {
        if (a == true) {
            println("TV를 켭니다.")
            println("현재 채널은 "+b[i]+" 입니다")
            a = false
        } else {
            println("TV를 끕니다")
            a = true
        }
    }

    fun change() {
        if (a == false) {
            if (i != 2) {
                i = i + 1
                println(b[i])
            } else {
                i = 0
                println(b[i])
            }
        } else {
            println("TV가 꺼져 있습니다.")
        }
    }
}