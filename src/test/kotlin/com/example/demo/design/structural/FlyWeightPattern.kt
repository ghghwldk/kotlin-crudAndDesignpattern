package com.example.demo.design.structural

import com.example.demo.design.structural.flyweightPattern.RiderService
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FlyWeightPattern {
    @Test
    fun 플라이웨이트패턴(){
        val riderService = RiderService()
        riderService.delivery("강남","motorcycle")
    }
}