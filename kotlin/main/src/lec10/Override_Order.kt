package lec10

fun main() {
    Derived(300)
}

open class Base(
    open val number: Int = 100
) {

    /**
     * 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티 에는
     * open을 피해야 한다.
     * 초기화 순서에 따라서 값이 이상하게 들어간다.
     */

    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {

    init {
        println("Derived Class")
    }
}