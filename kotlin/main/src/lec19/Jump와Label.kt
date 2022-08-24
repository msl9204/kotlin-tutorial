package lec19

/**
 * return / break / continue
 *
 * return : 기본적으로 가장 가까운 enclosing function 또는 익명함수로 값이 반환된다.
 * break : 가장 가까운 루프가 제거된다
 * continue : 가장 가까운 루프를 다음 step으로 보낸다.
 */

fun main() {

    val numbers = listOf(1, 2, 3)
    numbers.map { number -> number + 1}
        .forEach { number -> println(number) } // 여기서 break를 쓸 수 없다

    // 아래처럼은 가능하다.
    // @를 label이라고 부른다.
    run {
        numbers.forEach() { number ->
            if (number == 2) {
                return@run
            }
        }
    }

    run {
        numbers.forEach() { number ->
            if (number == 2) {
                return@forEach // continue를 쓴것과 같다
            }
        }
    }

    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) break@abc
            println("$i $j")
        }
    }




}