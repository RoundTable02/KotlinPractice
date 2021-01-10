package com.example.myapplication.Kotlin

fun main(args: Array<String>) {
    val monster = SuperMonster(100, 10)
    val night = SuperNight(130, 8)
    monster.attack(night)
}

// 상속이 만들어 낸 특징
// 자식 클래스는 부모 클래스의 타입이다.
// 부모 클래스는 자식클래스의 타입이 아니다.

open class Charactor(var hp: Int, var power: Int) {
    open fun attack(charactor: Charactor, power: Int = this.power){ //더 위에 있는 power을 기본값으로 사용
        charactor.defense(power)
    }
    open fun defense(damage: Int){
        hp -= damage
        if (hp>0) println("${javaClass.simpleName}의 남은체력 $hp")
        else println("사망했습니다")
    }
}

// 자식 클래스가 인스턴스화 되기 위해서 부모 클래스가 먼저 인스턴스화 되어야 한다.
class SuperMonster(hp: Int, power: Int) : Charactor(hp, power) {
    fun bite(charactor: Charactor){
        super.attack(charactor, power+2)
    }
}

class SuperNight(hp: Int, power: Int) : Charactor(hp, power) {
    val defensePower = 2
    override fun defense(damage: Int) {
        super.defense(damage-defensePower)
    }
}