package com.example.myapplication.Kotlin

fun main(array: Array<String>){

    val testAccess: TestAccess = TestAccess("아무개")
//    testAccess.test()
//    println(testAccess.name)
//    testAccess.name="아무개 투"
//    println(testAccess.name)

    val reward: Reward = Reward()
    reward.rewardAmount = 2000

}

class Reward(){
    var rewardAmount:Int = 1000
}
class TestAccess {
    private var name: String = "홍길동" //이 클래스 밖에서 name에 접근하는 것을 막음
    constructor(name: String){
        this.name = name
    }
    private fun test() { //클래스 밖에서 test가 사용되지 못함
        println("테스트")
    }
}

class RunningCar(){
    fun runFast(){
        run()
    }
    private fun run() {// 내부의 함수를 도와주는 데 사용

    }
}