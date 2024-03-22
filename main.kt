package com.example.myAssignment2

fun main() {

    println("당신은 배고픔에 이끌려 어느 분식집으로 들어왔습니다!")
    Payment.inputMoneyInfo()

    /*
    val option: Int = (readlnOrNull() ?: "0").toInt()
    val option = readln().toInt()
    */

    while (true) {
        displayInfo()
        print("원하시는 메뉴판 번호를 입력하세요 : ")
        try {
            when (readln().toInt()) {
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
                    Payment.run {
                        displayInfo()
                    }
                }

                else -> {
                    println("잘못된 숫자를 입력했습니다!")
                }
            }
        } catch (e: Exception) {
            println("잘못 입력했습니다!")
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
    when (myFood) { // 업캐스팅개념
        is Topokki -> {
            myFood.run {
                displayInfo()
                while (true) {
                    print("먹고 싶은 번호의 숫자를 고르시고, 본 메뉴판으로 돌아가려면 0을 입력하세요: ")
                    try {
                        var option: Int? = readLine()?.toInt() // 이것도 맞아..?
//                        option ?: "공백은 입력할 수 없습니다!"  → 이거 맞아..?
                        require(option in 0..4) // 예외 처리 이거 맞나..?
                        if (option == 0) break
                        else {
                            topokkiFood(option)
                            while (true) {
                                print("장바구니에서 뺄 음식 이름 : ")
                                val foodName: String? = readLine()
                                if(foodName=="없음") break
                                val foodPrice = myFood.foodMap[foodName]
                                val basket = Basket
                                if (foodPrice != null) {
                                    basket.deleteFood(foodName, foodPrice)
                                }
                            }
                        }
                    } catch (e: Exception) {
                        println("다시 입력해주세요!")
                    }
                }
            }


        }

        is Fishcake -> {
            myFood.run {
                display()
                while (true) {
                    print("먹고 싶은 번호의 숫자를 고르시고, 본 메뉴판으로 돌아가려면 0을 입력하세요: ")
                    try {
                        var option = readLine()?.toInt()
                        option ?: "공백 입력 안됩니다!"
                        if (option in 0..4) {
                            if (option == 0) break
                            else {
                                fishcakeFood(option)
                                while (true) {
                                    print("장바구니에서 뺄 음식 이름 : ")
                                    val foodName: String? = readLine()
                                    if(foodName=="없음") break
                                    val foodPrice = myFood.foodMap[foodName]
                                    val basket = Basket
                                    if (foodPrice != null) {
                                        basket.deleteFood(foodName, foodPrice)
                                    }
                                }
                            }
                        } else throw IllegalArgumentException("0부터 4사이까지 입력하세요!")
                    } catch (e: Exception) {
                        println("문자는 입력할 수 없습니다!")
                    }
                }
            }
        }

        is Intestine -> {
            myFood.run {
                display()
                while (true) {
                    print("먹고 싶은 번호의 숫자를 고르시고, 본 메뉴판으로 돌아가려면 0을 입력하세요: ")
                    try {
                        var option = readLine()?.toInt()
                        require(option in 0..4) { "0부터 4사이의 번호를 입력하세요!" }
                        if (option == 0) break
                        else {
                            intestineFood(option)
                            while (true) {
                                print("장바구니에서 뺄 음식 이름 : ")
                                val foodName: String? = readLine()
                                if(foodName=="없음") break
                                val foodPrice = myFood.foodMap[foodName]
                                val basket = Basket
                                if (foodPrice != null) {
                                    basket.deleteFood(foodName, foodPrice)
                                }
                            }
                        }
                    } catch (e: Exception) {
                        println("잘못 입력했습니다!")
                    }
                }
            }
        }

        is Fried -> {
            myFood.run {
                display()
                while (true) {
                    print("먹고 싶은 번호의 숫자를 고르시고, 본 메뉴판으로 돌아가려면 0을 입력하세요: ")
                    try {
                        var option = readLine()?.toInt()
                        require(option in 0..4) { "0부터 4사이의 범위여야 합니다!" }
                        if (option == 0) break
                        else {
                            friedFood(option)
                            print("장바구니에서 뺄 음식 이름 : ")
                            val foodName: String? = readLine()
                            val foodPrice = myFood.foodMap[foodName]
                            val basket = Basket
                            if (foodPrice != null) {
                                basket.deleteFood(foodName, foodPrice)
                            }
                        }
                    } catch (e: Exception) {
                        println("잘못 입력했습니다!")
                    }
                }
            }
        }
    }
}

