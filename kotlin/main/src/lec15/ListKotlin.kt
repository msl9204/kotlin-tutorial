package lec15

fun main() {

    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    printNumbers(emptyList()) // 이런 경우와 같이 추론가능하면 타입을 명시해주지 않아도 된다.

    // 하나를 가져오기
    println(numbers[0])

    // For Each
    for (number in numbers) {
        println(number)
    }

    println("===")

    // 전통적인 For문 느낌
    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    val mutableList = mutableListOf(100, 200)
    mutableList.add(300)

    val mutableSet = mutableSetOf<Int>()

    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    println("===")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    println("===")

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }

    /**
     * List<Int?> - 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님
     * List<Int>? - 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
     * List<Int?>? - 리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음
     */


}


private fun printNumbers(numbers: List<Int>) {

}