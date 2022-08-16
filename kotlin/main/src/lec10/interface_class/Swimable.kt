package lec10.interface_class

interface Swimable {

    val swimAbility: Int
        get() = 3 // 이 값이 default로 들어가게 된다.

    fun act() {
        println("어푸 어푸")
    }
}