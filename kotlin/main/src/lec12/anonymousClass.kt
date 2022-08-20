package lec12

import lec12.java.Movable

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("무브무브")
        }

        override fun fly() {
            println("날다날다")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}