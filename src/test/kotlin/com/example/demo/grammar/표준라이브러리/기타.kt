package com.example.demo.grammar.표준라이브러리

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class 기타 {
    @Test
    // 컬렉션 내 단 하나의 자료라도 존재하면 true를,
    // 그렇지 않으면 false를 반환한다.
    //
    // 인자로 조건식을 전달할 경우,
    // 해당 조건식을 만족하는 자료의 유무 여부를 반환한다.
    fun any(){
        val cities = listOf("Seoul", "Tokyo", "London", "NYC", "Singapore")

        // true
        println(cities.any { it.length >= 5 })
    }

    @Test
    // any() 함수와 반대 작업을 수행하며,
    // 컬렉션이 비어있는지 여부를 반환한다.
    //
    // any() 함수와 마찬가지로,
    // 조건식을 전달하여 해당 조건식에 만족하는 자료의 유무를 판단할 수 있다.
    fun none(){
        val cities =
                listOf("Seoul", "Tokyo", "London", "NYC", "Singapore")

        // true
        println(cities.none { it.length >= 10 })
    }
}