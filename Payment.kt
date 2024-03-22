package com.example.myAssignment2

object Payment {
    var myMoney: Int = 0

    fun inputMoneyInfo() {
        while (true) {
            print("지금 가지고 있는 돈을 입력하세요 : ")
            try {
                myMoney = (readlnOrNull() ?: "0").toInt()
                require(myMoney > 0)
                break
            } catch (e: Exception) {
                println("잘못 입력했습니다!")
            }
        }
    }

    fun displayInfo() {
        Basket.run {
            println("지금까지 지불해야 할 금액 : $requireMoney")
            if (myMoney >= requireMoney) {
                println("결제 후 잔액: $myMoney - $requireMoney = ${myMoney - requireMoney}")
                myMoney -= requireMoney
                requireMoney = 0 // 초기화
                basket = mutableListOf() // 초기화
                println("결제를 완료하였습니다!")
            } else {
                println("돈이 모자랍니다!")
            }
        }
    }

    fun printMoney() {
        Basket.run {
            println("지불금액 : $requireMoney")
            println("지갑 : $myMoney")
            if (myMoney >= requireMoney) println("상태 : 구매 가능")
            else println("상태 : 구매 불가능")
        }
    }
}
