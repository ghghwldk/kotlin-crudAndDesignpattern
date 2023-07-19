package com.example.demo.design.behavioral

import com.example.demo.design.behavioral.strategyPattern.Rider
import com.example.demo.design.behavioral.strategyPattern.delivery.impl.BikeStrategy
import com.example.demo.design.behavioral.strategyPattern.delivery.impl.MotorCycleStrategy
import com.example.demo.design.behavioral.strategyPattern.goToWork.impl.ByCarStrategy
import com.example.demo.design.behavioral.strategyPattern.goToWork.impl.BySubwayStrategy
import com.example.demo.design.behavioral.strategyPattern.goToWork.impl.DontGoToWorkStrategy
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StrategyPattern {
    @Test
    fun 전략패턴(){
        // delivery 옵션
        var motorCycleStrategy = MotorCycleStrategy()
        var bikeStrategy = BikeStrategy()
        // goToWork 옵션
        var byCarStrategy = ByCarStrategy()
        var bySubwayStrategy = BySubwayStrategy()
        var dontGoToWorkStrategy = DontGoToWorkStrategy()

        // 1. rider 생성
        // 2nd parameter: GoToWorkStrategy
        // 3rd parameter: DeliveryStrategy
        val rider = Rider("김찬정", bySubwayStrategy, motorCycleStrategy)
        rider.goToWork()
        rider.goToDelivery()

        // 2. 배달전략 변경
        rider.changeDeliveryStrategy(bikeStrategy)
        rider.goToDelivery()
    }
}