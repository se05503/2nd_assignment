package com.example.myAssignment2

class Topokki : Food() {

    val menu1: Int = 2500
    val menu2: Int = 3500
    val menu3: Int = 3000
    val menu4: Int = 500
    var singletonBasket = Basket.getInstance() // 공유 객체

    override fun display() {
        println("========== 죽여주게 매운 떡볶이 메뉴판 ==========")
        println("=            1. 밀떡 - 2500냥                =")
        println("=            2. 가래떡 - 3500냥               =")
        println("=            3. 쌀떡 - 3000냥                 =")
        println("=            4. 토핑 추가 - 500냥              =")
        println("=         0. 다시 본 메뉴판으로 돌아가기          =")
        println("==============================================")
    }

    fun topokkiFood(num: Int) {
        when (num) {
            1 -> {
                singletonBasket.run {
                    basket.add("밀떡")
                    requireMoney += menu1
                    displayBasket()
                    printMoney()
                }
            }

            2 -> {
                singletonBasket.run {
                    basket.add("가래떡")
                    requireMoney += menu2
                    displayBasket()
                    printMoney()
                }
            }

            3 -> {
                singletonBasket.run {
                    basket.add("쌀떡")
                    requireMoney += menu3
                    displayBasket()
                    printMoney()
                }
            }

            4 -> {
                singletonBasket.run {
                    basket.add("떡볶이 토핑")
                    requireMoney += menu4
                    displayBasket()
                    printMoney()
                }
            }
        }
    }
}