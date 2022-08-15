fun main() {
    repeat("Hello World", useNewLine = false)
    printNameAndGender(name = "LEE", gender = "M")

    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    printAll(*array) // spread 연산자
}

/**
 * 1. 함수 선언 문법
 */

// = 을 사용하는 경우 반환 타입 생략 가능
fun max(a: Int, b: Int) = if (a > b) a else b

/**
 * 2. Default Parameter
 */

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }

}

/**
 * 3. Named Argument
 */

fun printNameAndGender(
    name: String,
    gender: String
) {
    println(name)
    println(gender)
}

/**
 * 4. 같은 타입의 여러 파라미터 받기 (가변인자)
 */

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}