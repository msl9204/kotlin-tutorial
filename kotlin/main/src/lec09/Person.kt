package lec09

import java.lang.IllegalArgumentException

fun main() {
    val person = Person("LEE", 30)
    println(person.name)
    person.age = 10
    println(person.age)

    val person1 = Person("Lee2")

}

class Person (
    name: String,
    var age: Int
) {

    var name = name
        // backing field라고 부른다.
        get() = field.uppercase()
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    // Default Parameter를 권장
    constructor(name: String): this(name, 1)

    constructor(): this("Default Name")

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean
        get() = this.age >= 20

    val getUppercaseName: String
        get() = this.name.uppercase()

}