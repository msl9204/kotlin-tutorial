package lec13

fun main() {

}

class JavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom
) {

    /**
     * 기본적으로 코틀린에서는 바깥 클래스에 대한 연결이 없는 중첩 클래스가 만들어 진다
     */
    class LivingRoom(
        private val area: Double
    )


    /**
     * inner 키워드를 붙이면 바깥 클래스에 대한 정보를 가지고 있게 된다.
     */
    inner class LivingRoomNotRecommend(
        private val area: Double
    ) {
        val address: String
            // 바깥클래스 참조를 위해 this@바깥클래스 를 사용한다.
            get() = this@LivingRoomNotRecommend.address
    }


}