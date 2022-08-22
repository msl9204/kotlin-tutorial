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

    // all : 조건을 모두 만족하면 true 그렇지 않으면 false
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }

    // none : 조건을 모두 불만족하면 true 그렇지 않으면 false
    val isAllApple2 = fruits.none { fruit -> fruit.name == "사과" }

    // any : 조건을 하나라도 만족하면 true 그렇지 않으면 false
    val isAllApple3 = fruits.any { fruit -> fruit.factoryPrice == 10_000L }

    // count : 개수를 센다
    val fruitCount = fruits.count()

    val sortedByAes = fruits.sortedBy { fruit -> fruit.currentPrice } // 오름차순
    val sortedByDesc = fruits.sortedByDescending { fruit -> fruit.currentPrice } // 내림차순

    // distinctBy : 변형된 값을 기준으로 중복을 제거한다
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    // first : 첫번째 값을 가져온다 (무조건 null이 아니어야함)
    // firstOrNull : 첫번째 값 또는 null을 가져온다

    // last : 마지막 값을 가져온다 (무조건 null이 아니어야함)
    // lastOrNull : 마지막 값 또는 null을 가져온다

    fruits.last()
    fruits.lastOrNull()
}