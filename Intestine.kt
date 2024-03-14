package com.example.myAssignment2

class Intestine : Food() {

    val menu1: Int = 4000
    val menu2: Int = 6000
    val menu3: Int = 5000
    val menu4: Int = 7000
    var singletonBasket = Basket.getInstance()



    override fun display() {
        println("========== 맛깔나게 잘익은 순대 메뉴판 ==========")
        println("=         1. 매운 순대 - 4000냥               =")
        println("=         2. 곱창 순대 - 6000냥               =")
        println("=         3. 고기 순대 - 5000냥               =")
        println("=         4. 아바이 순대 - 7000냥              =")
        println("=         0. 다시 본 메뉴판으로 돌아가기          =")
        println("==============================================")
    }

    fun intestineFood(num: Int?) {
        when (num) {
            1 -> {
                singletonBasket.run {
                    basket.add("매운 순대")
                    requireMoney += menu1
                    displayBasket()
                    Payment.printMoney()
                }
            }

            2 -> {
                singletonBasket.run {
                    basket.add("곱창 순대")
                    requireMoney += menu2
                    displayBasket()
                    Payment.printMoney()
                }
            }

            3 -> {
                singletonBasket.run {
                    basket.add("고기 순대")
                    requireMoney += menu3
                    displayBasket()
                    Payment.printMoney()
                }
            }

            4 -> {
                singletonBasket.run {
                    basket.add("아바이 순대")
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