package lec12

fun main() {

}

class Person private constructor(
    var name: String,
    var age: Int
) {

    companion object Factory : Log {
        private const val MIN_AGE = 1 // const 를 써주면 컴파일시에 변수가 할당된다. 쓰지 않을 시에는 런타임시 할당

        @JvmStatic // 이 키워드가 있으면 static에 바로 접근 가능
        fun newBaBy(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person Class Companion Class LOG")
        }
    }
}