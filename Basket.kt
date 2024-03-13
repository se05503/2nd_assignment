package com.example.myAssignment2

// 해당 객체에 대한 생성 없이 바로 접근하기 위해 싱글턴인 object 선언 (class 대신)
// 해당 클래스는 싱글턴으로 만들어야 할 듯
class Basket private constructor() {
    var basket = mutableListOf<String>()
    var requireMoney:Int=0

    companion object {
        private var instance : Basket? = null

        fun getInstance():Basket {
            if(instance==null) {
                synchronized(this) {
                    instance = Basket()
                }
            }
            return instance!!
        }
    }

    fun displayBasket() {
        println("장바구니에 들어있는 음식 : ${basket}")
    }

    fun printMoney() {
        println("지금까지 지불해야 하는 금액 : ${requireMoney}")
    }
}