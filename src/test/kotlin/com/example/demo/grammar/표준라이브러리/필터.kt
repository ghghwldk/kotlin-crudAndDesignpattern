package com.example.demo.grammar.표준라이브러리

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class 필터 {
    @Test
    // 컬렉션 내 인자들 중 주어진 조건과 일치하는 인자만 걸러주는 역할
    fun filter(){
        val cities = listOf("Seoul", "Tokyo", "View")

        // Seoul, Tokyo
        cities.filter{ city -> city.length <= 5}
                .forEach{ println(it) }
    }

    @Test
    // take() : 컬렉션 내 인자들 중 앞에서 take) 함수의 인자로 받은 개수만큼만을 인자로 갖는 리스트를 반환한다.
    // takeLast() : take() 함수와 반대로 뒤에서부터 적용해 반환한다.
    // takeWhile() : 첫 번째 인자부터 시작하여 주어진 조건을 만족하는 인자까지를 포함하는 리스트를 반환한다.
    // takeLastWhile() : takeLastWhile() 함수와 반대로 뒤에서부터 적용해 반환한다.
    fun take(){
        val cities = listOf("Seoul", "Tokyo", "London", "NYC", "Singapore")

        // Seoul, Tokyo
        cities.take(2)
                .forEach { println(it) }

        // London, NYC, Singapore
        cities.takeLast(3)
                .forEach { println(it) }

        // Seoul, Tokyo
        cities.takeWhile { city -> city.length <= 5 }
                .forEach { println(it) }

        // Singapore
        cities.takeLastWhile { city -> city.length > 5 }
                .forEach { println(it) }
    }

    @Test
    // take() 함수의 반대 역할을 하며, 조건을 만족하는 항목을 컬렉션에서 제외한 결과를 반환한다.
    fun main(args: Array<String>) {
        val cities = listOf("Seoul", "Tokyo", "London", "NYC", "Singapore")

        // London, NYC, Singapore
        cities.drop(2)
                .forEach { println(it) }

        // Seoul, Tokyo
        cities.dropLast(3)
                .forEach { println(it) }

        // NYC, Singapore
        cities.dropWhile { city -> city.length <= 5 }
                .forEach { println(it) }

        // Seoul, Tokyo, London, NYC
        cities.dropLastWhile { city -> city.length > 5 }
                .forEach { println(it) }
    }

    @Test
    // 컬렉션 내 첫 번째 인자를 반환한다.
    // 단순히 리스트 내에서 첫 번째에 위치하는 인자를 반환하는 것뿐 아니라,
    // 특정 조건을 만족하는 첫 번째 인자를 반환하도록 구성하는 것도 가능하다.
    //
    // 조건을 만족하는 인자가 없는 경우엔 NoSuchElementException 예외를 발생시킨다.
    // firstOnNull() 함수를 사용하면 널 값을 반환하도록 할 수 있다.
    fun firstAndLast(){
        val cities = listOf("Seoul", "Tokyo", "London", "NYC", "Singapore")

        // Seoul
        println(cities.first())

        // Singapore
        println(cities.last())

        // London
        println(cities.first { it.length > 5 })

        // null
        println(cities.firstOrNull { it.length > 10 })
    }

    @Test
    // 컬렉션 내에 포함된 항목 중 중복된 항목을 걸러낸 결과를 반환한다.
    // 항목의 중복 여부는 equals()로 판단하며,
    // distinctBy() 함수를 사용하면 비교에 사용할 키 값을 직접 설정할 수 있다.
    fun distinct(){
        val cities = listOf("Seoul", "Tokyo", "London", "Seoul", "Tokyo")

        // Seoul, Tokyo, London
        cities.distinct()
                .forEach { println(it) }

        // Seoul, London
        cities.distinctBy { it.length } // 도시 이름의 길이를 판단 기준으로 사용
                .forEach { println(it) }
    }
}