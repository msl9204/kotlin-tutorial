package lec16

fun main() {
    3.add3(4)
}

inline fun Int.add3(other: Int): Int {
    return this + other
}

/*
    inline 함수는 실제 호출이 아니라 함수 자체의 코드를 복사한다.
    덧셈하는 로직 자체가 그 함수를 부르는쪽에 복사 붙여넣기 된다

    => 함수를 파라미터로 전달할 때 오버에드가 생기기 때문에 줄이는 용도로 사용

 */