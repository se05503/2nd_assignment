package com.example.myAssignment2

open class Food {

    val foodMap = mapOf<String,Int>("밀떡" to 2500, "가래떡" to 3500, "쌀떡" to 3000,"떡볶이토핑" to 500,
        "매운 어묵" to 700, "순한 어묵" to 500, "카레 어묵" to 1000, "치즈 어묵" to 1000,
        "매운 순대" to 4000, "곱창 순대" to 6000, "고기 순대" to 5000, "아바이 순대" to 7000,
        "오징어 튀김" to 500, "가지 튀김" to 700, "신발 튀김" to 5000, "새우 튀김" to 1000
    )
    open fun display() {}
}