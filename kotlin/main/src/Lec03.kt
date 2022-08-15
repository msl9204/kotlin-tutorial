fun main() {

    // 코틀린에서는 명시적으로 형변환을 해줘야한다
    val number1 = 3
    val number2: Long = number1.toLong()

    // nullable 이라면 Safe Call 과 Elvis 연산자로 처리해줘야한다.
    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L

    val person = Person("aaa", 100)
    printAgeIfPersonNullable(person)

    // String Interpolation
    println("이름 : ${person.name}, 나이 : ${person.age}")

    val trimIndent = """
        AA
        BB
        CC
        DD
        EE
        FF
        GG
    """.trimIndent()

    println(trimIndent)

    println("getChar = ${trimIndent[0]}")
}

fun printAgeIfPerson(obj: Any) {
    // 타입캐스팅
    if (obj is Person) {
//        val person = obj as Person
        println(obj.age) // as 생략가능
    }

    // Person 이 아니라면
    if (obj !is Person) {
//        val person = obj as Person
//        println(obj.age) // as 생략가능
    }
}

fun printAgeIfPersonNullable(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}