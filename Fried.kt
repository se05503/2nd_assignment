package com.example.myAssignment2

abstract class Fried : Food {

    abstract override val name: String
    abstract override val price: Int

    val fries = listOf<Food>(
        SquidFried("오징어 튀김", 500),
        ShrimpFried("새우 튀김", 1000)
    )


    // 세부 사항에 대한 가격 추가
    override fun displayInfo() {
        println("1. 오징어 튀김 | 500냥")
        println("2. 새우 튀김 | 1000냥")
        println("0. 메뉴판으로 돌아가기")
    }

    fun friedFood(num: Int?) {
        when (num) {
            1 -> {
                Basket.run {
                    basket.add(fries[0].name)
                    requireMoney += fries[0].price
                    displayBasket()
                    Payment.printMoney()
                }
            }

            2 -> {
                Basket.run {
                    basket.add(fries[0].name)
                    requireMoney += fries[1].price
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