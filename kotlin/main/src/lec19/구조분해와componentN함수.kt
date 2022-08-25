package lec19

fun main() {
    val person = Person("Lee", 100)
    // 구조분해 : 복합적인 값을 분해하여 여러 변수를 한번에 초기화 하는 것
    val (name, age) = person
    println("이름 : ${name}, 나이 : ${age}")
    // 구조분해는 사실 아래처럼 부르고 있는 것
    /*
        val name = person.component1()
        val age = person.component2()

        첫번째 property를 component1
        두번째 property를 component2
        에 넣어주기 때문에 구조분해 할때에는 순서에 유의해야 한다.
        val (age, name) = person => 이경우는 반대로 나오게됨
     */

    val personNonDataClass = PersonNonDataClass("Lee", 100)
    // 구조분해 : 복합적인 값을 분해하여 여러 변수를 한번에 초기화 하는 것
    val (nameN, ageN) = personNonDataClass
    println("이름 : ${nameN}, 나이 : ${ageN}")


}

// data class는 기본적으로 componentN이라는 함수도 자동으로 만들어 준다
data class Person(
    val name: String,
    val age: Int
) {
    lateinit var hobby: String
    override fun toString(): String {
        return "name=$name age=$age hobby=$hobby"
    }
}

// non data class 는 아래처럼 만들어주면 된다.
class PersonNonDataClass(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}
