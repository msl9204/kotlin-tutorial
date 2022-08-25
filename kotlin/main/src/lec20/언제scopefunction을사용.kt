package lec20

import lec19.Person

fun main() {
    // let

    val strings = listOf("APPLE", "CAR")

    /**
     * let은 하나 이상의 함수를 call chain 결과로 호출 할 때 사용한다.
     */
    strings.map { it.length }
        .filter { it > 3 }
        .let(::println) // 아래와 동일하다.
//        .let { lengths -> println(lengths) }

    /**
     * non-null 값에 대해서만 code block을 실행시킬 때
     */

    var str: String?
    str = "abc"

    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    /**
     * 일회성으로 제한된 영역에 지역 변수를 만들 때
     */
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem)

    // run

    /**
     * 객체 초기화와 반환 값의 계산을 동시에 해야 할 때
     */
    val personRepository = PersonRepository()

    val person = Person("Lee", 100).run {
        hobby = "독서"
        personRepository.save(this)
    }
    println(person)

    // apply
    /**
     * apply 특징 : 객체 그 자체가 반환된다.
     * 객체 설정을 할 때에
     * 객체를 수정하는 로직이 call chain 중간에 필요할 때
     */
    fun createPerson(
        name: String,
        age: Int,
        hobby: String
    ): Person {
        return Person(
            name = name,
            age = age
        ).apply {
            this.hobby = hobby
        }
    }

    // also
    /**
     * also 특징 : 객체 그 자체가 반환된다.
     * 객체를 수정하는 로직이 call chain 중간에 필요할 때
     */
    mutableListOf("one", "two", "three")
        .also { println("four 추가 이전 지금 값 : $it") }
        .add("four")


    // with
    /**
     * 특정 객체를 다른 객체로 변환해야 하는데,
     * 모듈간의 의존성에 의해
     * 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때
     */
    return with(person) {
        PersonDto(
            name = name,
            age = age
        )
    }
}

class PersonRepository {
    fun save(person: Person): Person {
        println(person)
        return person
    }
}

data class PersonDto(
    val name: String,
    val age: Int
)

