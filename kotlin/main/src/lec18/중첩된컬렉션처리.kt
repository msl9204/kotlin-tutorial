package lec18

fun main() {
    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "사과", 1_000L, 1_000L),
            Fruit(2, "사과", 1_200, 1_200L),
            Fruit(3, "사과", 1_200L, 1_200L),
            Fruit(4, "사과", 1_500L, 1_500L),
        ),
        listOf(
            Fruit(5, "바나나", 3_000L, 3_000L),
            Fruit(6, "바나나", 3_200L, 3_200L),
            Fruit(7, "바나나", 2_500L, 2_500L),
        ),
        listOf(
            Fruit(8, "수박", 10_000L, 10_000L)
        )
    )


    // 출고가와 현재가가 동일한 과일을 골라주세요
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }

    // List<List<Fruit>> -> List<Fruit>
    fruitsInList.flatten()

}