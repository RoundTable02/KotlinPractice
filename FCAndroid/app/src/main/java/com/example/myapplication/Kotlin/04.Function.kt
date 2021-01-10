package com.example.myapplication.Kotlin

// fun 함수명 ( 변수명 : 타입 ) : 반환형 {
//         함수내용
//          return 반환값
// }
fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환 값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit { //:Unit생략 가능
    val result: Int = first + second
    println(result)
}

// 간단하게 함수 선언
fun plusShort(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수
fun plusMany(vararg numbers: Int) { //var argument
    for (number in numbers) {
        println(number)
    }
}

fun main(array: Array<String>) {
//    val result = plus(5,10) // 그냥 두면 순서대로
//    val result2 = plus(second=20, first=30) // 인수를 명시적으로 전달
//    println(result)
//    println(result2)
//    val result4 = plusFive(10)
//    println(result4)
//    printPlus(10, 20)
//    val result = plusShort(50, 50)
//    print(result)
    plusMany(1,2,3)
}