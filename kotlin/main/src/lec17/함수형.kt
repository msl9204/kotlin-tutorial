package lec17

fun main() {

    val fruits = listOf(
        Fruit("사과", 1_000L),
        Fruit("사과", 1_200L),
        Fruit("사과", 1_200L),
        Fruit("사과", 1_500L),
        Fruit("바나나", 3_000L),
        Fruit("바나나", 3_200L),
        Fruit("바나나", 2_500L),
        Fruit("수박", 10_00L),
    )


    // 함수를 할당, 람다를 만드는 방법 1
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 리턴타입 생략 가능
    val _isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법 2
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }


    // 리턴타입 생략 가능 함수의 타입 : (파라미터 타입) -> 반환타입
    val _isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    // 람다를 직접 호출하는 방법 1
    isApple(fruits[0])
    // 람다를 직접 호출하는 방법 2
    isApple.invoke(fruits[0]) // invoke 를 명시적으로 작성해서 함수를 호출할 수도 있다.


    val filterFruits = filterFruits(fruits, isApple)
    println("filterFruits = ${filterFruits}")


    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" } // 마지막에 위치한 람다는 () 뒤로 뺼수있다
    filterFruits(fruits) { fruit -> fruit.name == "사과" } // 추론가능 하기 때문에 Fruit 생략가능
    filterFruits(fruits) { a -> a.name == "사과" } // 이름도 바꿀 수 있다
    filterFruits(fruits) { a ->
        println("여러줄 작성..")
        a.name == "사과" } // 여러줄 작성하게 되면 마지막줄 결과가 람다의 반환값이다
    filterFruits(fruits) { it.name == "사과" } // 람다에서 사용하는 파라미터가 1개라면 it 으로 쓸수있다


    // closure
    var targetFruitName = "바나나"
    targetFruitName = "수박"
    filterFruits(fruits) {it.name == targetFruitName} // 코틀린에서는 람다가 시작하는 지점에 참조하고 있는 변수들을 모두 포획사여 그 정보를 가지고 있다.
    // 자바에서는 안됨. 변수를 final로 해야 가능
    // 이렇게 해야만, 람다를 진정한 일급 시민으로 간주할 수 있다.
    // 이 데이터 구조를 Closure라고 부른다.

}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()

    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

