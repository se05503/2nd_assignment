package com.example.myAssignment2

class Payment {
    val singletonBasket = Basket.getInstance()
    var myMoney: Int = 0 // 다른 클래스에서는 자료형 명시하라고 들은 것 같음..

    // 다음 레벨에서 Payment 가 Basket 상속받도록 만들어보기
    fun inputMoneyInfo() {
        print("지금 가지고 있는 돈을 입력하세요 : ")
        myMoney = readLine()!!.toInt() //!! 표시는 안좋다고 했으니까 lv4 부터 예외처리, !!을 ?. ?: 으로 바꾸기!
    }

    fun displayInfo() {
        singletonBasket.run {
            println("지금까지 지불해야 할 금액 : ${requireMoney}")
            if (myMoney >= requireMoney) {
                println("결제 후 잔액: ${myMoney} - ${requireMoney} = ${myMoney-requireMoney}")
                myMoney -= requireMoney
                requireMoney = 0 // 초기화
                basket = mutableListOf() // 초기화
                println("결제를 완료하였습니다!")
            } else {
                println("돈이 모자랍니다!")
//            deleteMenu()
            }
        }
    }
}

//    fun deleteMenu() {
//        singletonBasket.displayBasket()
//        print("빼고 싶은 메뉴를 입력해주세요")
//
//    }
