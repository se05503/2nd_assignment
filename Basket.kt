package com.example.myAssignment2

/*
2. Basket
-> comapnion object를 사용하여 인스턴스를 만드시는데 이는 Kotlin 방식이 아닙니다.
-> 단순히 object Basket으로 작성하시고 companion object는 필요 없습니다~!
*/

/*
4. Basket이 싱글턴이라면 basket이나 requireMoney와 같은 멤버필드를 외부에서 바꾸지 못하게 해주세요.
setter을 만들어서 해주는 연습을 해주면 좋을 것 같습니다.
물론 싱글턴이라서 그렇다기보다는 Encapsulation을 위해서 외부에서 내부 변수를 마음대로 수정하면 안되며
수정이 필요할시 항상 setter로 하는 것이 좋습니다. (private)

예) 예시를 위해 작성한 코드니 참고만 하세요!
object Basket {
     // Encapsulation을 위한 private visibility modifier 사용
    private val basket = mutableListOf<String>() // 콜렉션 활용
    private var requireMoney: Int = 0

   // 멤버 변수는 항상 Setter(함수)를 아래와 같이 만들어서 변경한다.
    fun subtractPrice(price: Int){
        this.requireMoney -= price
    }
}
 */

object Basket { // 상속 관계 형성
    private val basket = mutableListOf<String>() // 콜렉션 활용
    private var requireMoney: Int = 0

    fun displayBasket() {
        println("장바구니 : ${this.basket}")
    }

    fun deleteFood(foodName: String?, foodPrice: Int) {
        basket.remove(foodName)
        this.requireMoney -= foodPrice
        println("${foodName}이 장바구니에서 삭제되었습니다!")
    }
}