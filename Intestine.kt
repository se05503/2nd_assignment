package com.example.myAssignment2

class Intestine : Food() {
    override fun display() {
        println("========== 맛깔나게 잘익은 순대 메뉴판 ==========")
        println("=                1. 매운 순대                =")
        println("=                2. 곱창 순대                =")
        println("=                3. 고기 순대                =")
        println("=                4. 아바이 순대               =")
        println("=         0. 다시 본 메뉴판으로 돌아가기          =")
        println("==============================================")
    }
}