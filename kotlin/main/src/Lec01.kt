fun main() {

    /**
     * JAVA에서
     *
     * long number 1 = 10L;
     * final long number2 = 10L;
     */

    var number1 = 10L
    val number2 = 10L

    // 초기값을 지정해주지 않는 경우

    var number3: Long
    val number4: Long

    number4 = 1 // 최초 한번은 할당 가능
//    number4 = 2
    println(number4)


    // null이 변수에 들어가려면 타입에 ?를 붙여야 한다.
    var number5: Long? = 10L
    number5 = null

    val person = Person("사람")
    println(person.name)


}