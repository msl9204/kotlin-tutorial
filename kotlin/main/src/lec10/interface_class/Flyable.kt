package lec10.interface_class

interface Flyable {

    // default 키워드 없이 메소드 구현이 가능하다
    fun act() {
        println("파닥 파닥")
    }

    // 구현해야 할 함수는 아래처럼 쓴다.
//    fun fly()

}