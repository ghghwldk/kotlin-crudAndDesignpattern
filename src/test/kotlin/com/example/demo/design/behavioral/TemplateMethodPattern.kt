package com.example.demo.design.behavioral

import com.example.demo.design.behavioral.templateMethodPattern.DeliveryService
import com.example.demo.design.behavioral.templateMethodPattern.rider.impl.BicycleRider
import com.example.demo.design.behavioral.templateMethodPattern.rider.impl.MotorCycleRider
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TemplateMethodPattern {
    @Test
    fun 탬플릿메소드패턴(){
        val deliveryService =
                DeliveryService(
                        MotorCycleRider("2", 23, "23", 2)
                )

        val deliveryService2 =
                DeliveryService(
                        BicycleRider("2", 23, "23", 2)
                )
        println("--start--")
        deliveryService.delivery()
        deliveryService2.delivery()

    }
}