package com.example.myAssignment2

// 해당 객체에 대한 생성 없이 바로 접근하기 위해 싱글턴인 object 선언 (class 대신)
// 해당 클래스는 싱글턴으로 만들어야 할 듯
class Basket private constructor()  { // 상속 관계 형성
    var basket = mutableListOf<String>() // 콜렉션 활용
    var requireMoney:Int=0

    // 근데 companion object 중괄호 안에 안들어가있는 위 변수는 공유변수(?) 에 포함안되나..??

    companion object {
        private var instance : Basket? = null

        fun getInstance():Basket {
            if(instance==null) {
                synchronized(this) {
                    instance = Basket()
                }
            }
            return instance!!
        }
    }

    fun displayBasket() {
        println("장바구니 : ${basket}")
    }



    fun deleteFood(foodName:String?,foodPrice:Int) {
        basket.remove(foodName)
        requireMoney-=foodPrice
        println("${foodName}이 장바구니에서 삭제되었습니다!")
    }
}