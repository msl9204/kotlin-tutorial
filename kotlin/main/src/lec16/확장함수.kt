package lec16

import lec16.java.Person

fun main() {
    val str = "ABC"
    println(str.lastChar())

    val person = Person("A", "B", 100)
    person.nextYearAge()
}

// 여기서 String을 수신객체 타입이라고 한다.
fun String.lastChar(): Char {
    return this[this.length - 1] // 여기서 this를 수신객체라고 부른다.
}

// 멤버 함수의 이름과 동일하면 멤버 함수가 우선적으로 호출된다.
fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}
/*
    val train: Train = Train()
    train.isExpensive() // Train의 확장함수 호출

    val str1: Train = Srt()
    train.isExpensive() // Train의 확장함수 호출

    val str2: Srt = Srt()
    train.isExpensive() // Srt의 확장함수 호출

    해당 변수의 현재 타입
    즉, 정적인 타입에 의해 어떤 확장함수가 호출될지 결정된다.
 */

// 확장 프로퍼티
val String.firstChar: Char
    get() = this[0]