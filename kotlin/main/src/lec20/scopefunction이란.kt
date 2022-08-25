package lec20

import lec19.Person

// scope function : 일시적인 영역을 형성하는 함수

fun printPerson(person: Person?) {

    person?.let {
        println(it.name)
        println(it.age)
    }

    /*
    if (person != null) {
        println(person.name)
        println(person.age)
    }
     */

    /**
     * let : 람다를 사용해 일시적인 영역을 만들고 코드를 더 간결하게 만들거나,
     * method chaining에 활용하는 함수를 scope function이라고 합니다.
     */
}