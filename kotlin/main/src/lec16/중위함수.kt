package lec16

// 변수 함수이름 argument 모양으로 호출

fun Int.add(other: Int): Int {
    return this + other
}

// 멤버함수에서도 가능
infix fun Int.add2(other: Int): Int {
    return this + other
}

fun main() {
    3.add(4)
    3.add2(4)
    3 add2 4 // infix 함수
}