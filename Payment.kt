package com.example.myAssignment2

object Payment {
    val singletonBasket = Basket.getInstance()
    var myMoney: Int = 0 // 0 말고 null 로 바꿔봄

    fun inputMoneyInfo() {
        while (true) {
            print("지금 가지고 있는 돈을 입력하세요 : ")
            try {
                myMoney = readLine()?.toInt() ?: -1 // 예외를 잘 처리한건가?
                require(myMoney > 0) // 오 프로그램이 안꺼지네?
                break
            } catch (e: Exception) {
                println("잘못 입력했습니다!") // null 값을 받아오는 경우, 문자를 받아오는 경우 실행
            }
        }
    }

    fun displayInfo() {
        singletonBasket.run {
            println("지금까지 지불해야 할 금액 : ${requireMoney}")
            if (myMoney >= requireMoney) {
                println("결제 후 잔액: ${myMoney} - ${requireMoney} = ${myMoney - requireMoney}")
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
        singletonBasket.run {
            println("지불금액 : ${requireMoney}")
            println("지갑 : ${myMoney}")
            if (myMoney >= requireMoney) println("상태 : 구매 가능") // 현재 잔액과 가격을 비교해서 해당 물건을 구매할 수 있는지에 대해 클래스에서 구현 (lv5 조건)
            else println("상태 : 구매 불가능")
        }
    }
}
