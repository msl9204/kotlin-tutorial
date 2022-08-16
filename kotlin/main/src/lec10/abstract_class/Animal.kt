package lec10.abstract_class

abstract class Animal(
    protected val species: String,
    // 프로퍼티를 override 할때에는 반드시 open을 붙여줘야 한다.
    protected open val legCount: Int,
) {
    abstract fun move()
}