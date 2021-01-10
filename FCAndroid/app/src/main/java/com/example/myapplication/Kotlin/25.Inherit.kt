package com.example.myapplication.Kotlin

// 두 번까지는 봐준다.
// 두 번 이상이 넘어가면 리팩토링 해라.

// 상속
// 부모로부터 설명서를 물려받는다.

fun main(array: Array<String>) {
    val superCar100: SuperCar100 = SuperCar100()
    superCar100.drive()

}

open class Car100() {
    // class와 fun은 private이 기본 설정
    // open으로 private를 열어주어야 한다.
    open fun drive():String {
        return "달린다"
    }

    fun stop() {

    }
}

class SuperCar100() : Car100() { //상속
    // open된 함수에 접근
    override fun drive():String {
        val run = super.drive() //super = 부모
        return "빨리 $run"
    }
}

class Bus100() : Car100() {

}