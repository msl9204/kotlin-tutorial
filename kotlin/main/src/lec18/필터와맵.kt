package lec18



fun main() {
    val fruits = listOf(
        Fruit(1, "사과", 1_000L, 1_000L),
        Fruit(2, "사과", 1_200, 1_200L),
        Fruit(3, "사과", 1_200L, 1_200L),
        Fruit(4, "사과", 1_500L, 1_500L),
        Fruit(5, "바나나", 3_000L, 3_000L),
        Fruit(6, "바나나", 3_200L, 3_200L),
        Fruit(7, "바나나", 2_500L, 2_500L),
        Fruit(8, "수박", 10_000L, 10_000L)
    )


    // filter : 사과만 주세요!
    val apples = fruits.filter { fruit -> fruit.name == "사과" }

    // 필터에서 인덱스가 필요하다면?!
    val apples2 = fruits.filterIndexed {idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }

    // map : 사과의 가격들을 알려주세요!
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }

    // map 에서 인덱스가 필요하다면?!
    val applePrices2 = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed() { idx, fruit ->
            println(idx)
            fruit.currentPrice
    }

    // Mapping의 결과가 null이 아닌 것만 가져오고 싶다면?!
    val values = fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit.name }




    println(applePrices)
}
