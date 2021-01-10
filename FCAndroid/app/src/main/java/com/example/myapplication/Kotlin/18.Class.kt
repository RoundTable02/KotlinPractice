package com.example.myapplication.Kotlin

// OOP : Object Oriented Programing (객체 지향 프로그래밍)
// 객체
// - 이름이 있는 모든 것

// 절차 지향 프로그래밍
// - 코드를 위에서부터 아래로 실행하면 문제가 해결된다

// 객체 지향 프로그래밍의 문제 해결 방법
// - 객체를 만들어서 객체에게 일을 시켜서 문제를 해결한다.
// - 선수, 심판, 경기장, 관중 -> 축구게임

// 객체를 만드는 방법 -- 설명서가 있어야 합니다.
fun main(array: Array<String>) {
    //클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스 (차)
    Car("V8", "big")
    val bigCar: Car = Car("V8", "big")
    //변수에 담을 수 있다. 우리가 만든 설명서가 자료형이 될 수 있다.
    val number: Int = 10

    val superCar: SuperCar = SuperCar("good engine", "big", "white")

    val runableCar: RunableCar = RunableCar("simple engine","short body")
    runableCar.ride()
    runableCar.drive()
    runableCar.navi("부산")

    val runableCar2 : RunableCar2 = RunableCar2("nice engine","Long body")
    println(runableCar2.body)
    println(runableCar2.engine) //인스턴스의 멤버를 접근
}

// 클래스(설명서)를 만드는 방법 1 (2의 축약형)
class Car constructor(var engine: String, var body: String) { //constructor 생략 가능
}

// 클래스(설명서)를 만드는 방법 2
class SuperCar {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    //생성자
    constructor(engine: String, body: String, door: String) {
        this.engine = engine //this == SuperCar
        this.body = body
        this.door = door
        // 실제 실행할 때 constructor로 받고, this를 통해 class에 넘겨줌
    }
}

// 클래스 만드는 방법 3 (1의 확장)
class Car1(engine: String, body: String) { //가장 필요한 부품만 써준다
    var door: String = ""//부가적으로 필요한 부품은 따로 적는다

    constructor(engine: String, body: String, door: String) : this(engine, body) {
        //엔진과 바디가 들어오면 클래스로 넘겨줌
        this.door = door // 없어도 되는 것
    }
}

// 클래스 4 (2의 확장)
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    //필요한 부품 먼저
    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    //부가적인 부품 포함한 컨스트럭터
    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar(engine: String, body: String) {
    fun ride(){
        println("탑승하였습니다")
    }
    fun drive(){
        println("달립니다!")
    }
    fun navi(destination: String){
        println("$destination 으로 목표가 설정되었습니다.")
    }
}

class RunableCar2{
    var engine: String
    var body:String

    constructor(engine: String, body: String){
        this.engine = engine
        this.body=body
    }
    init{
        // 초기 셋팅을 할 때 유용
        println("RunnableCar2가 만들어졌습니다.")
    }
    fun ride(){
        println("탑승하였습니다")
    }
    fun drive(){
        println("달립니다!")
    }
    fun navi(destination: String){
        println("$destination 으로 목표가 설정되었습니다.")
    }
}

// 오버로딩
// 한 클래스 내 동일한 변수명이나 함수는 사용할 수 없다.
// 함수는 입력인자가 다르면 같은 함수명은 사용할 수 있다.
// 오버로딩 -> 이름이 같지만 다른 파라미터를 갖는 함수

class TestClass() {
    fun test(a:Int, b:Int){
        println("up")
    }
    fun test(a:Int){
        println("down")
    }
}