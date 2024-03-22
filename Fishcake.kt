package com.example.myAssignment2

abstract class Fishcake: Food {

    abstract override val name:String
    abstract override val price:Int

    val fishcakes = listOf<Food>(
        SpicyFishcake("매운 어묵",700),
        MildFishcake("순한 어묵",500)
    )

    override fun displayInfo() {
        println("$name: $price")
    }

    fun fishcakeFood(num: Int?) {
        when (num) {
            1 -> {
                Basket.run {
                    basket.add(fishcakes[0].name)
                    requireMoney += fishcakes[0].price
                    displayBasket()
                    Payment.printMoney()
                }
            }

            2 -> {
                Basket.run {
                    basket.add(fishcakes[1].name)
                    requireMoney += fishcakes[1].price
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