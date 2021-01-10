package com.example.myapplication.Kotlin

fun main(args: Array<String>){
    val bank: Bank = Bank("홍길동","020111")

    bank.accountMake()
    bank.check()
    bank.ibg(100000)
    bank.chul(30000)
    bank.check()
}

class Bank{
    var name:String = ""
    var birth:String = ""
    var money:Int = 0

    constructor(name:String, birth:String){
        this.name = name
        this.birth= birth
    }

    fun accountMake() {
        println("$name 님의 계좌가 생성되었습니다")
    }
    fun check() {
        println("잔고는 $money 원 입니다")
    }
    fun ibg(more:Int){
        money = money + more
        println("잔고는 $money 원 입니다")
    }
    fun chul(more:Int){
        money = money - more
        println("잔고는 $money 원 입니다")
    }
}