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

    // 과일이름 -> List<과일> map
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruits -> fruits.name }

    // id -> 과일 map
    val map2: Map<Long, Fruit> = fruits.associateBy { fruits -> fruits.id }
    println(map2)

    // 과일이름 -> List<출고가> map
    val map3: Map<String, List<Long>> = fruits.groupBy({ fruits -> fruits.name }, { fruit -> fruit.factoryPrice })
    println(map3)

    // id -> 출고가 map
    val map4: Map<Long, Long> = fruits.associateBy({ fruits -> fruits.id }, { fruit -> fruit.factoryPrice })

}