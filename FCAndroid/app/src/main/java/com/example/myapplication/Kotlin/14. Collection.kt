package com.example.myapplication.Kotlin

fun main(args: Array<String>) {
    //변경 불가 (Immutabel Collection)
    //List
    val numberList = listOf<Int>(1, 2, 3, 3, 3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])

    //Set
    // 중복을 허용하지 않음
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    numberSet.forEach{
        println(it)
    }
    //Map
    //Key to Value 방식
    val numberMap = mapOf<String, Int>("one" to 1,"two" to 2)
    println(numberMap.get("one")) // key를 입력한다

    //변경 가능(Mutable Collection)
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two",2)
    println(mNumberMap)
}