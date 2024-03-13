package com.example.myAssignment2

import java.lang.Exception

fun main() {

    // 적는 로직을 textRPG 실습 코드를 참고
    // 객체 지워보고 싱글턴을 통해 클래스에 바로 접근해보자
    // run 개념을 적용해보자


//    val food = Food()
//    val topokki = Topokki()
//    val fishcake = Fishcake()
//    val intestine = Intestine()
//    val fried = Fried()


    // 업캐스팅 개념을 추가
    // 예외는 나중에 고려하기

    println("당신은 배고픔에 이끌려 어느 분식집으로 들어왔습니다!")
    displayInfo()
    print("원하시는 메뉴판 번호를 입력하세요 : ")
    val option = readLine()!!.toInt()
    when (option) {
        1 -> {
            // 떡볶이 선택
            foodSelect(Topokki()) // 일단 코드의 최소화를 위해 객체를 넣지 않고 클래스 자체를 넣음(객체 넣는게 더 맞는 것 같긴 한데..모르겠음)
        }

        2 -> {
            // 어묵 선택
            foodSelect(Fishcake())
        }

        3 -> {
            // 순대 선택
            foodSelect(Intestine())
        }

        4 -> {
            // 튀김 선택
            foodSelect(Fried())
        }

        0 -> {
            // 가게 나가기
            println("가게를 나갑니다..")
        }
    }
}
//    foodSelect(myFood: Food)

//    while (true) {
//        try {
//            when (opt1) {
//                1 -> { // 떡볶이
//                    topokki.display()
//                    while (true) {
//                        print("본 메뉴판으로 가실거면 0을 입력하세요 : ")
//                        try {
//                            val opt2 = readLine()!!.toInt()
//                            if(opt2==0) break
//                            else println("잘못된 숫자를 입력했습니다!")
//                        } catch (e: Exception) {
//                            println("null 값 또는 문자는 입력할 수 없습니다!")
//                        }
//                    }
//                }
//
//                2 -> { // 어묵
//                    fishcake.display()
//                    while (true) {
//                        print("본 메뉴판으로 가실거면 0을 입력하세요 : ")
//                        try {
//                            val opt2 = readLine()!!.toInt()
//                            if (opt2 ==0) break
//                            else println("잘못 입력하셨습니다!")
//                        } catch (e: Exception) {
//                            println("null 값 또는 문자는 입력할 수 없습니다!")
//                        }
//                    }
//                }
//
//                3 -> { // 순대
//                    intestine.display()
//                    while (true) {
//                        print("본 메뉴판으로 가실거면 0을 입력하세요 : ")
//                        try {
//                            val opt2 = readLine()!!.toInt()
//                            if (opt2 ==0) break
//                            else println("잘못 입력하셨습니다!")
//                        } catch (e: Exception) {
//                            println("null 값 또는 문자는 입력할 수 없습니다!")
//                        }
//                    }
//                }
//
//                4 -> { // 튀김
//                    fried.display()
//                    while (true) {
//                        print("본 메뉴판으로 가실거면 0을 입력하세요 : ")
//                        try {
//                            val opt2 = readLine()!!.toInt()
//                            if (opt2 ==0) break
//                            else println("잘못 입력하셨습니다!")
//                        } catch (e: Exception) {
//                            println("null 값 또는 문자는 입력할 수 없습니다!")
//                        }
//                    }
//                }
//
//                0 -> {
//                    println("결국 분식집을 나갑니다 ...")
//                    break
//                }
//
//                else -> {
//                    println("0,1,2,3,4 에 해당하는 숫자를 입력하세요!")
//                }
//            }
//        } catch (e: Exception) {
//            println("null 값 또는 문자는 입력할 수 없습니다!")
//        }
//    }


fun displayInfo() {
    println("========== 안오면 쫓아간다 분식집 메뉴판 ==========")
    println("=          1. 죽여주게 매운 떡볶이              =")
    println("=          2. 끝내주게 맛있는 어묵              =")
    println("=          3. 맛깔나게 잘익은 순대              =")
    println("=          4. 오질나게 잘튀긴 튀김              =")
    println("=      0. 메뉴가 맘에 안들면 분식집 나가~!        =")
    println("==============================================")
}

// 처음에 if~else 로 썼다가 when 이 더 가독성이 좋은 것 같아 수정
fun foodSelect(myFood: Food) {
    when (myFood) {
        is Topokki -> {
            //각 객체의 클래스, 변수 등을 불러온다
            // run 함수 적용해보기
            myFood.run {
                display()
                print("먹고 싶은 번호의 숫자를 고르시고, 본 메뉴판으로 돌아가려면 0을 입력하세요: ")
                var option = readLine()!!.toInt()
                topokkiFood(option)
            }


        }

        is Fishcake -> {
            myFood.run {
                display()
                print("먹고 싶은 번호의 숫자를 고르시고, 본 메뉴판으로 돌아가려면 0을 입력하세요: ")
                var option = readLine()!!.toInt()
                fishcakeFood(option)
            }
        }

        is Intestine -> {
            myFood.run {
                display()
                print("먹고 싶은 번호의 숫자를 고르시고, 본 메뉴판으로 돌아가려면 0을 입력하세요: ")
                var option = readLine()!!.toInt()
                intestineFood(option)
            }
        }

        is Fried -> {
            myFood.run {
                display()
                print("먹고 싶은 번호의 숫자를 고르시고, 본 메뉴판으로 돌아가려면 0을 입력하세요: ")
                var option = readLine()!!.toInt()
                friedFood(option)
            }
        }
    }
}

