package lec14

/**
 * 컴파일러가 enum의 모든 타입을 알고 있어 다른 타입에 대한 로직(else)을 작성하지 않아도 된다.
 */
fun handleCountry(country: EnumClass) {
    // when에서 enum의 변화가 있을 때 감지할 수 있다
    return when (country) {
        EnumClass.KOREA -> TODO()
        EnumClass.AMERICA -> TODO()
    }
}

enum class EnumClass(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US"),
//    A("A")
}