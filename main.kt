package com.example.myAssignment2

import java.lang.Exception

fun main() {

    val topokki = Topokki()
    val fishcake = Fishcake()
    val intestine = Intestine()
    val fried = Fried()

    println("당신은 배고픔에 이끌려 어느 분식집으로 들어왔습니다!")
    while (true) {
        displayInfo()
        print("원하시는 메뉴판 번호를 입력하세요 : ")
        try {
            val opt1 = readLine()!!.toInt()
            when (opt1) {
                1 -> {
                    topokki.display()
                    while (true) {
                        print("본 메뉴판으로 가실거면 0을 입력하세요 : ")
                        try {
                            val opt2 = readLine()!!.toInt()
                            if(opt2==0) break
                            else println("잘못된 숫자를 입력했습니다!")
                        } catch (e: Exception) {
                            println("null 값 또는 문자는 입력할 수 없습니다!")
                        }
                    }
                }

                2 -> {
                    fishcake.display()
                    while (true) {
                        print("본 메뉴판으로 가실거면 0을 입력하세요 : ")
                        try {
                            val opt2 = readLine()!!.toInt()
                            if (opt2 ==0) break
                            else println("잘못 입력하셨습니다!")
                        } catch (e: Exception) {
                            println("null 값 또는 문자는 입력할 수 없습니다!")
                        }
                    }
                }

                3 -> {
                    intestine.display()
                    while (true) {
                        print("본 메뉴판으로 가실거면 0을 입력하세요 : ")
                        try {
                            val opt2 = readLine()!!.toInt()
                            if (opt2 ==0) break
                            else println("잘못 입력하셨습니다!")
                        } catch (e: Exception) {
                            println("null 값 또는 문자는 입력할 수 없습니다!")
                        }
                    }
                }

                4 -> {
                    fried.display()
                    while (true) {
                        print("본 메뉴판으로 가실거면 0을 입력하세요 : ")
                        try {
                            val opt2 = readLine()!!.toInt()
                            if (opt2 ==0) break
                            else println("잘못 입력하셨습니다!")
                        } catch (e: Exception) {
                            println("null 값 또는 문자는 입력할 수 없습니다!")
                        }
                    }
                }

                0 -> {
                    println("결국 분식집을 나갑니다 ...")
                    break
                }

                else -> {
                    println("0,1,2,3,4 에 해당하는 숫자를 입력하세요!")
                }
            }
        } catch (e: Exception) {
            println("null 값 또는 문자는 입력할 수 없습니다!")
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
    println("==============================================")
}