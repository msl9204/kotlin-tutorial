package lec16

import lec16.java.Person
import java.lang.IllegalArgumentException

fun createPerson(firstName: String, lastName: String): Person {

    // 지역함수는 함수안에 함수를 넣을 수 있다
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재 값 : $name")
        }
    }

    return Person(firstName, lastName, 1)
}