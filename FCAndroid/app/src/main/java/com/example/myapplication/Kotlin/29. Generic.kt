package com.example.myapplication.Kotlin

// Generic
// 목적 : 다양한 타입의 객체들을 다루는 메서드나 컬렉션
// >> 타입을 체크하는 기능
// 제너릭을 만들 일이 거의 없어 사용하는 방법만 숙지
//
//fun main(args: Array<String>){
//    // Generic 사용하지 않음
//    val list1 = listOf(1,2,3,"가")
//    val b: String = list1[2].toString() //형 변환
//
//    // Generic 사용
//    val list2 = listOf<String>("a","b","c")
//    val c:String = list2[2] //String이라는 것을 보장받는다.
//
//    // 강한 타입을 체크할 수 있다.
//    val list3= listOf(1,2,3,4,"가","나",3.0)
//    val list4 = listOf<Int>(1,2,3,"가")//강한 타입 체크
//
//    // Generic사용하지 않은 경우
//    val list5 = listOf<Any>(1,2,3,"가")
//    // 부모 : Any
//    // 자식 : String, Int, Float
//
//}