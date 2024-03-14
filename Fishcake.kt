package com.example.myAssignment2

class Fishcake: Food() {

    val menu1: Int = 700
    val menu2: Int = 500
    val menu3: Int = 1000
    val menu4: Int = 1000
    var singletonBasket = Basket.getInstance()

    override fun display() {
        println("========== 끝내주게 맛있는 어묵 메뉴판 ==========")
        println("=            1. 매운 어묵 - 700냥             =")
        println("=            2. 순한 어묵 - 500냥             =")
        println("=            3. 카레 어묵 - 1000냥            =")
        println("=            4. 치즈 어묵 - 1000냥            =")
        println("=         0. 다시 본 메뉴판으로 돌아가기         =")
        println("==============================================")
    }

    fun fishcakeFood(num: Int?) {
        when (num) {
            1 -> {
                singletonBasket.run {
                    basket.add("매운 어묵")
                    requireMoney += menu1
                    displayBasket()
                    Payment.printMoney()
                }
            }

            2 -> {
                singletonBasket.run {
                    basket.add("순한 어묵")
                    requireMoney += menu2
                    displayBasket()
                    Payment.printMoney()
                }
            }

            3 -> {
                singletonBasket.run {
                    basket.add("카레 어묵")
                    requireMoney += menu3
                    displayBasket()
                    Payment.printMoney()
                }
            }

            4 -> {
                singletonBasket.run {
                    basket.add("치즈 어묵")
                    requireMoney += menu4
                    displayBasket()
                    Payment.printMoney()
                }
            }

            0 -> {
                println("본래 메뉴판으로 돌아갑니다!")
            }
        }
    }
}