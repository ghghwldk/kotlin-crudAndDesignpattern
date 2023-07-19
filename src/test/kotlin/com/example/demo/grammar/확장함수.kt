package com.example.demo.grammar

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

data class Person(var name:String, var age:Int)

@SpringBootTest
class 확장함수 {
    @Test
    fun let테스트() {
        val person = Person("", 0)

        // fun <T, R> T.let(block: (T) -> R): R
        val resultIt = person.let{
            it.name = "James"
            it.age = 56
            it // (T)->R 부분에서 R에 해당하는 반환값
        }

        val resultStr = person.let {
            it.name = "Steve"
            it.age = 59
            val name = it.name
            val age = it.age
            "{$name is $age}" // (T)->R 부분에서의 R에 해당하는 반환값.
        }

        val resultUnit = person.let {
            it.name = "Joe"
            it.age = 63
            // (T)->R 부분에서의 R에 해당하는 반환값 없음
        }

        println("$resultIt")
        println("$resultStr")
        println("$resultUnit")

        println(1)
    }

    @Test
    fun with테스트() {
        // fun <T, R> with(receiver: T, block: T.() -> R): R
        //with는 일반 함수이기 때문에 객체 receive를 직접 입력받는다.
        // 객체를 사용하기 위한 두 번째 파라미터 블럭을 받는다.

        // T.()를 람다 리시버라고 한다.
        // 입력을 받으면 함수 내에서 this를 사용하지 않고도 입력받은 객체(receiver)의 속성을 변경할 수 있다.

        val person = Person("James", 56)
        with(person){
            println(name)
            println(age)
            name = "James2"
            println(name)

            // 자기자신을 반환해야 하는 경우 it이 아닌 this를 사용한다.
        }
    }

    @Test
    fun run테스트() {
        // fun <T, R> T.run(block: T.() -> R): R
//        val person = Person("James", 56)
        var person: Person?=null
        val ageNextYear = person?.run{

            ++age
        }
        println("$ageNextYear")

        person = Person("James", 56)
        val ageNextYear2 = person?.run{
            ++age
        }
        println("$ageNextYear2")
    }

    @Test
    fun apply테스트() {
        // fun <T> T.apply(block: T.() -> Unit): T
        val person = Person("", 0)
        val result = person.apply{
            name = "James"
            age = 56
        }

        println("$person")
    }

    @Test
    fun also테스트() {
        val person = Person("", 0)
        val result = person.also {
            it.name = "James"
            it.age = 56
        }

        println("$person")

//Person(name=James, age=56)
    }
}