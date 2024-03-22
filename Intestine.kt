package com.example.myAssignment2

abstract class Intestine : Food {

    abstract override val name:String
    abstract override val price:Int

    val intestines = listOf<Food>(
        SpicyIntestine("매운 순대",4000),
        MeatIntestine("고기 순대",6000)
    )

    override fun displayInfo() {
        println("1. 매운 순대 | 4000냥")
        println("2. 고기 순대 | 6000냥")
        println("3. 메뉴판으로 돌아가기")
    }

    fun intestineFood(num: Int?) {
        when (num) {
            1 -> {
                Basket.run {
                    basket.add(intestines[0].name)
                    requireMoney += intestines[0].price
                    displayBasket()
                    Payment.printMoney()
                }
            }

            2 -> {
                Basket.run {
                    basket.add(intestines[1].name)
                    requireMoney += intestines[1].price
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