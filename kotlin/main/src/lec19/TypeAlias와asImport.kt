package lec19

import lec17.Fruit as FruitB
import lec18.Fruit as FruitA

// typealias를 통해 타입별칭으로 표현할 수 있다.
typealias FruitFilter = (FruitA) -> Boolean
fun filterFruits(fruits: List<FruitA>, filter: FruitFilter) {
}

// 다른 패키지의 같은 이름 함수를 동시에 가져오고 싶다면?!
// import lec17.Fruit as FruitB
// import lec18.Fruit as FruitA
// 위처럼 쓰면 같은 이름을 가진 함수를 가져올 수 있다.