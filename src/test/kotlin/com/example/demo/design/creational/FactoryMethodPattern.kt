package com.example.demo.design.creational

import com.example.demo.design.creational.factoryMethodPattern.RiderFactory
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FactoryMethodPattern {
    @Test
    fun 팩토리메소드패턴(){
        var riderFactory = RiderFactory()

        val rider = riderFactory.createRider("fulltime")
        rider.delivery()
    }
}