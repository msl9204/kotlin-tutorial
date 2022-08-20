package lec14

fun main() {
    val person1 = DataClass("ABC", 10)
    val person2 = DataClass("ABC", 10)

    println(person1 == person2)

    println(person1)

}

data class DataClass(
    val name: String,
    val age: Int
)