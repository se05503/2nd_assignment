package com.example.myAssignment2

abstract class Topokki : Food {

    abstract override val name:String
    abstract override val price:Int
    var singletonBasket = Basket


    override fun displayInfo() {
        println("========== 죽여주게 매운 떡볶이 메뉴판 ==========")
        println("=            1. 밀떡 - 2500냥                =")
        println("=            2. 쌀떡 - 3000냥                 =")
        println("=         0. 다시 본 메뉴판으로 돌아가기          =")
        println("==============================================")
    }

    fun topokkiFood(num: Int?) {
        when (num) {
            1 -> {
                singletonBasket.run {
                    basket.add("밀떡")
                    requireMoney += menu1
                    displayBasket()
                    Payment.printMoney()
                }
            }

            2 -> {
                singletonBasket.run {
                    basket.add("가래떡")
                    requireMoney += menu2
                    displayBasket()
                    Payment.printMoney()
                }
            }

            3 -> {
                singletonBasket.run {
                    basket.add("쌀떡")
                    requireMoney += menu3
                    displayBasket()
                    Payment.printMoney()
                }
            }

            4 -> {
                singletonBasket.run {
                    basket.add("떡볶이 토핑")
                    requireMoney += menu4
                    displayBasket()
                    Payment.printMoney()
                }
            }
        }
    }
}