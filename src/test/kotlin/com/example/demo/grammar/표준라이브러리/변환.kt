package com.example.demo.grammar.표준라이브러리

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class 표준라이브러리 {
    @Test
    // 컬렉션 내 인자를 다른 값 혹은 타입으로 변환할 때 사용한다.
    fun map(){
        val cities = listOf("Seoul", "Tokyo", "London")

        cities.map{city->city.toUpperCase()}
                .forEach{println(it)}
        cities.map{city-> city.length}
                .forEach{println(it)}

        print(1)
    }

    @Test
    // 컬렉션 내 포함된 인자의 인덱스 값을 변환 함수 내에서 사용할 때 사용한다.
    fun mapIndexed(){
        val numbers = 0..5

        // 0, 1, 4, 9, 16, 25
        numbers.mapIndexed{idx, number -> idx * number}
                .forEach{println(it)}
    }

    @Test
    // 컬렉션 내 인자를 변환함과 동시에, 변환한 결과가 널 값인 경우 이를 무시한다.
    fun mapNotNull(){
        val cities = listOf("Seoul", "Tokyo", "London")
        cities.mapNotNull{city-> if(city.length <= 5) city else null}
                .forEach{println(it)}
    }

    @Test
    // 컬렉션 내 인자들을 지정한 기준에 따라 분류하여 맵 형태로 결과를 반환한다.
    fun groupBy(){
        val cities = listOf("Seoul", "Tokyo", "London")

        // A [Seoul, Tokyo], B[London]
        cities.groupBy { city -> if (city.length <= 5) "A" else "B" }
                .forEach { (key, cities) -> println("$key $cities") }
    }
}