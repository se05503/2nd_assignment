package com.example.myAssignment2

abstract class Fishcake: Food {

    abstract override val name:String
    abstract override val price:Int

    var singletonBasket = Basket

    override fun displayInfo() {
        println("========== 끝내주게 맛있는 어묵 메뉴판 ==========")
        println("=            1. 매운 어묵 - 700냥             =")
        println("=            2. 순한 어묵 - 500냥             =")
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