package com.example.myapplication.Kotlin

var a = 1 + 2 + 3 + 4 + 5
var b = "1"
var c = b.toInt() // 1
var d = b.toFloat() // 1.0

var e = "John"
var f = "My name is $e Nice to meet you"

//Null
//-존재하지 않는다

//var abc : Int = null(x)
var abc1 : Int? = null //"null"(x)
var abc2 : Double? = null
//?를 붙여줘야 null 대입 가능

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
}