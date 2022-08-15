import java.lang.IllegalArgumentException

fun main() {

    val str: String? = "ABC"
    val str2: String? = null
//    str.length // 불가능
    str?.length // 가능

    /**
     * null이 아니면 실행하고,
     * null이면 실행하지 않는다 (그대로 null)
     */

    println(str?.length)
    println(str2?.length)

    /**
     * Elvis 연산자
     * 앞의 연산 결과가 null이면 뒤의 값을 사용
     */

    val str3: String? = null
    println(str3?.length ?: 0)


    println(startWith("ABC"))

    val person = Person("공부하는 개발자")
    startWithA(person.name!!)


}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
            ?: throw IllegalArgumentException("null이 들어왔습니다")

// JAVA
//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다")
//    }
//
//    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")

// JAVA
//    if (str == null) {
//        return null
//    }
//
//    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false

// JAVA
//    if (str == null) {
//        return false
//    }
//
//    return str.startsWith("A")
}

fun startWith(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}