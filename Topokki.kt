package com.example.myAssignment2

abstract class Topokki : Food {

    abstract override val name:String
    abstract override val price:Int

    val toppokies = listOf<Food>(
        WheatToppoki("밀떡",2500),
        RiceToppoki("쌀떡",3000)
    )

    override fun displayInfo() {
        println("1. 밀떡 | 2500냥")
        println("2. 쌀떡 | 3000냥")
        println("0. 메뉴판으로 돌아가기")
    }

    fun topokkiFood(num: Int?) {
        when (num) {
            1 -> {
                Basket.run {
                    basket.add(toppokies[0].name)
                    requireMoney += toppokies[0].price
                    displayBasket()
                    Payment.printMoney()
                }
            }

            2 -> {
                Basket.run {
                    basket.add(toppokies[1].name)
                    requireMoney += toppokies[1].price
                    displayBasket()
                    Payment.printMoney()
                }
            }

            0 -> {
                println("메뉴판으로 돌아갑니다!")
            }
        }
    }
}