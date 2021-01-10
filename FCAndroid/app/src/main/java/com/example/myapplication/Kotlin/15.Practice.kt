package com.example.myapplication.Kotlin

fun main(array: Array<String>){
    val a = mutableListOf<Int>(1,2,3)
    a.add(0,100) //인덱스 설정 안하면 맨 뒤에 추가
    println(a) //바뀌는게 아니라 0자리에 100 추가
    a.set(0,200) //0자리에 있는 수를 200으로 바꿈
    println(a)
    a.removeAt(1) //1자리의 수를 지움
    println(a)

    val b = mutableSetOf<Int>(1,2,3,4)
    println()
    b.add(2)
    println(b)

    val c = mutableMapOf<String, Int>("One" to 1)
    c.put("two",2)
    c.replace("two",3) //two자리의 value를 3으로 바꿈
    println(c.keys) //key 모두 출력
    println(c.values)//value 모두 출력
    c.clear() // 모두 삭제
}