package com.example.myapplication.Kotlin

//fun main(args: Array<String>) {
//    val calcul: calculator = calculator(3,1)
//
//    calcul.hap()
//    calcul.cha()
//    calcul.gop()
//    calcul.nanu()
//}
//
//class calculator {
//    var a: Int = 0
//    var b: Int = 0
//
//    constructor(a: Int, b: Int) {
//        this.a = a
//        this.b = b
//    }
//
//    fun hap() {println(a+b)}
//    fun cha() {println(a-b)}
//    fun gop() {println(a*b)}
//    fun nanu() {println(a/b)}
//}

fun main(args: Array<String>) {
    calculator1(5).plus(3).minus(2)
}

class calculator1(val a: Int) {
    fun plus( b: Int): calculator1 {
        var result: Int = 0
        result = this.a + b
        println(result)
        return calculator1(result)
    }

    fun minus( c: Int): calculator1 {
        var result: Int = 0
        result = this.a - c
        println(result)
        return calculator1(result)
    }
}