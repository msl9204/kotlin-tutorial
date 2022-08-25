package lec20

import lec19.Person

fun main() {
    val person = Person("이름", 100)

    val value1 = person.let {
        it.age // return it.age
    }

    val value2 = person.run {
        this.age
    }

    // let과 run은 람다의 결과가 return 된다

    val value3 = person.also {
        it.age
    }

    val value4 = person.apply {
        this.age
    }

    // also과 apply은 객체 그 자체가 return 된다


    with(person) {
        println(name)
        println(this.age)
    }

    // with(파라미터, 람다) : this를 사용해 접근하고, this는 생략 가능하다.




    /**
     * it과 this의 차이
     *
     * this : 생략이 가능한 대신, 다른 이름을 붙일 수 없다.
     * it : 생략이 불가능한 대신, 다른 이름을 붙일 수 있다.
     */

    /**
     * 확장 함수는 본인 자신을 this로 호출할 수 있었다.
     * run 과 apply는 확장함수이기 때문에 this로 부른다.
     */
}