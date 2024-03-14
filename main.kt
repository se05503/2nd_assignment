package com.example.myAssignment2

import java.lang.Exception

/*
1. lv2 → lv3 변화된 점 : Basket 클래스, Payment 클래스 추가
2. Singleton 개념 적용 : Basket 클래스의 객체를 공유 객체로 만듬
3. Basket 클래스에서 콜렉션 개념 사용
*/
fun main() {

    val toppoki=Topokki()
    val fishcake=Fishcake()
    val intestine=Intestine()
    val fried=Fried()
    val payment=Payment()

    var objectList = ArrayList<Food>()
    objectList.add(toppoki)
    objectList.add(fishcake)
    objectList.add(intestine)
    objectList.add(fried)

    println("당신은 배고픔에 이끌려 어느 분식집으로 들어왔습니다!")
    payment.inputMoneyInfo()

    while (true) {
        displayInfo()
        print("원하시는 메뉴판 번호를 입력하세요 : ")
        val option = readLine()!!.toInt()
        when (option) {
            1 -> {
                foodSelect(objectList[0])
            }

            2 -> {
                foodSelect(objectList[1])
            }

            3 -> {
                foodSelect(objectList[2])
            }

            4 -> {
                foodSelect(objectList[3])
            }

            0 -> {
                println("가게를 나갑니다..")
                break
            }

            -1 -> {
                payment.run {
                    displayInfo()
                }
            }
        }
    }
}

fun displayInfo() {
    println("========== 안오면 쫓아간다 분식집 메뉴판 ==========")
    println("=          1. 죽여주게 매운 떡볶이              =")
    println("=          2. 끝내주게 맛있는 어묵              =")
    println("=          3. 맛깔나게 잘익은 순대              =")
    println("=          4. 오질나게 잘튀긴 튀김              =")
    println("=      0. 메뉴가 맘에 안들면 분식집 나가~!        =")
    println("=             -1. 결제하자 ...                 =")
    println("==============================================")
}

fun foodSelect(myFood: Food) {
    when (myFood) {
        is Topokki -> {
            myFood.run {
                display()
                while (true) {
                    print("먹고 싶은 번호의 숫자를 고르시고, 본 메뉴판으로 돌아가려면 0을 입력하세요: ")
                    var option = readLine()!!.toInt()
                    if (option == 0) break
                    else {
                        topokkiFood(option)
                    }
                }
            }


        }

        is Fishcake -> {
            myFood.run {
                display()
                while (true) {
                    print("먹고 싶은 번호의 숫자를 고르시고, 본 메뉴판으로 돌아가려면 0을 입력하세요: ")
                    var option = readLine()!!.toInt()
                    if (option == 0) break
                    else {
                        fishcakeFood(option)
                    }
                }
            }
        }

        is Intestine -> {
            myFood.run {
                display()
                while (true) {
                    print("먹고 싶은 번호의 숫자를 고르시고, 본 메뉴판으로 돌아가려면 0을 입력하세요: ")
                    var option = readLine()!!.toInt()
                    if (option == 0) break
                    else {
                        intestineFood(option)
                    }
                }
            }
        }

        is Fried -> {
            myFood.run {
                display()
                while (true) {
                    print("먹고 싶은 번호의 숫자를 고르시고, 본 메뉴판으로 돌아가려면 0을 입력하세요: ")
                    var option = readLine()!!.toInt()
                    if (option == 0) break
                    else {
                        friedFood(option)
                    }
                }
            }
        }
    }
}

