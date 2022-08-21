package lec15

fun main() {
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    println("===")
    val plusedArray = array.plus(300)

    for ((idx, value) in plusedArray.withIndex()) {
        println("${idx} ${value}")
    }
}