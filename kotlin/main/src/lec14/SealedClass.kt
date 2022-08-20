package lec14

sealed class SealedClass(
    val name: String,
    val price: Long
)

class Avante : SealedClass("아반떼", 1_000L)
class Sonata : SealedClass("소나타", 2_000L)
class Grandeur : SealedClass("그렌저", 3_000L)

private fun handler(car: SealedClass) {

    /**
     * Enum과 비슷하게
     * SealedClass의 하위 구현체가 추가되거나 제거됐을 때 좀 더 쉽게 알아차릴 수 있다.
     */

    when (car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}