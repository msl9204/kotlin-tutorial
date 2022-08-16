package lec10.interface_class

import lec10.abstract_class.Animal

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    // 인터페이스에 val로 선언된 필드가 있으면 backing field를 가지게 되므로, getter에 대한 부븐을 override 해줘야한다
    // 단, 인터페이스에 default값이 있으면 생략가능
    override val swimAbility: Int
        get() = 3
}