import obj.Money

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 === money4)
    println(money3 == money5) // 자동으로 equals 호출


    if (fun1() && fun2()) {
        println("본문")
        // Lazy연산은 자바와 동일함
    }

    val money6 = Money(1_000L)
    val money7 = Money(2_000L)
    println(money6 + money7)

}


fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}