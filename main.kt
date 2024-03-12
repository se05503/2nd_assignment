package com.example.myAssignment2

import java.lang.Exception

fun main() {
    displayInfo()
    while (true) {
        print("먹고 싶은 메뉴를 선택해주세요(가게를 나가고 싶으면 -1을 입력하세요) : ")
        try {
            val option = readLine()!!.toInt()
            val topokki = Topokki()
            val fishcake = Fishcake()
            val intestine = Intestine()
            val fried = Fried()
            when (option) {
                1 -> {
                    topokki.display()
                }

                2 -> {
                    fishcake.display()
                }

                3 -> {
                    intestine.display()
                }

                4 -> {
                    fried.display()
                }

                -1 -> {
                    println("가게를 떠납니다...")
                    break
                }

                else -> {
                    println("잘못된 번호를 입력하셨습니다!")
                }
            }
        } catch (e: Exception) {
            println("숫자를 입력해주세요!")
        }
    }
//    when(Food) {
//        is Topokki -> {}
//        is Fishcake -> {}
//        is Intestine -> {}
//        is Fried -> {}
//    }
}


fun displayInfo() {
    println("========== 안오면 쫓아간다 분식집 메뉴판 ==========")
    println("=          1. 죽여주게 매운 떡볶이              =")
    println("=          2. 끝내주게 맛있는 어묵              =")
    println("=          3. 맛깔나게 잘익은 순대              =")
    println("=          4. 오질나게 잘튀긴 튀김              =")
    println("==============================================")
}