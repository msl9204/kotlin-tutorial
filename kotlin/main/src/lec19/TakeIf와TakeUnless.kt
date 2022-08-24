package lec19

// 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null이 반환된다.
fun getNumberOrNull(number: Int): Int? {
    return number.takeIf { it > 0 }
}

// 주어진 조건을 만족하지 않으면 그 값이, 그렇지 않으면 null이 반환된다.
fun getNumberOrNull2(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}