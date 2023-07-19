package com.example.demo.grammar.표준라이브러리

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class 조합및함계 {
    @Test
    // 컬렉션 내의 자료들을 조합하여 새로운 자료를 만들 때 사용한다.
    // 두 컬렉션 간 자료의 개수가 달라도 사용할 수 있으며,
    // 이 경우에는 반환되는 수는 컬렉션의 수 중 더 적은 쪽을 따라간다.
    //
    // 기본 값으로는 조합된 결과를 Pair로 만들며,
    // 원하는 경우 조합 규칙을 직접 정의할 수 있다.
    fun zip(){
        val cityCodes = listOf("SEO", "TOK", "MTV", "NYC")

        val cityNames = listOf("Seoul", "Tokyo", "Mountain View")

        // Pair 형태로 출력된다.
        cityCodes.zip(cityNames)
                .forEach { println(it) }

        // 사용자가 직접 정의
        cityCodes.zip(cityNames) { code, name -> "$code $name" }
                .forEach { println(it) }
    }

    @Test
    // 컬렉션 내 자료를 문자열 형태로 변환함과 동시에,
    // 이를 조합하여 하나의 문자열로 생성한다.
    //
    // 몇 가지 인자를 함께 전달하면 자신이 원하는 형태로 출력 문자열을 구성하는 것도 가능하다.
    fun joinToString(){
        val cities = listOf("Seoul", "Tokyo", "London", "NYC", "Singapore")

        //Seoul, Tokyo, London, NYC, Singapore
        println(cities.joinToString())

        // Seoul & Tokyo & London & NYC & Singapore
        println(cities.joinToString(separator = " & "))
    }

    @Test
    // 컬렉션 내 포함된 자료의 개수를 반환하며,
    // 별도의 조건식을 추가하면 해당 조건을 만족하는 자료의 개수를 반환할 수 있다.
    fun count(){
        val cities =
                listOf("Seoul", "Tokyo", "London", "NYC", "Singapore")
        println(cities.count())
        println(cities.count{it.length<=5})
    }

    @Test
    // 컬렉션 내 자료둘을 모두 합쳐 하나의 값으로 만들어주는 역할을 한다.
    fun reduce(){
        val cities = listOf(1,2,3,4,5)
        println(cities.reduce{acc, s -> acc + s})
    }

    @Test
    fun fold(){
        val cities = listOf(1,2,3,4,5)

        println(cities.fold(20){acc, s -> acc + s})
    }
}