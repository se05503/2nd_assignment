package com.example.myAssignment2

class Fried : Food() {

    val menu1: Int = 500
    val menu2: Int = 700
    val menu3: Int = 5000
    val menu4: Int = 1000
    var singletonBasket = Basket.getInstance()


    // 세부 사항에 대한 가격 추가
    override fun display() {

        println("========== 오질나게 잘튀긴 튀김 메뉴판 ==========")
        println("=           1. 오징어 튀김 - 500냥            =")
        println("=            2. 가지 튀김 - 700냥             =")
        println("=           3. 신발 튀김 - 5000냥             =")
        println("=            4. 새우 튀김 - 1000냥            =")
        println("=          0. 다시 본 메뉴판으로 돌아가기        =")
        println("==============================================")
    }

    fun friedFood(num: Int) {
        when (num) {
            1 -> {
                singletonBasket.run {
                    basket.add("오징어 튀김")
                    requireMoney += menu1
                    displayBasket()
                    printMoney()
                }
            }

            2 -> {
                singletonBasket.run {
                    basket.add("가지 튀김")
                    requireMoney += menu2
                    displayBasket()
                    printMoney()
                }
            }

            3 -> {
                singletonBasket.run {
                    basket.add("신발 튀김")
                    requireMoney += menu3
                    displayBasket()
                    printMoney()
                }
            }

            4 -> {
                singletonBasket.run {
                    basket.add("새우 튀김")
                    requireMoney += menu4
                    displayBasket()
                    printMoney()
                }
            }

            0 -> {
                println("본래 메뉴판으로 돌아갑니다!")
            }
        }
    }
}