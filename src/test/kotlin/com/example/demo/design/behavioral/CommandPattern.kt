package com.example.demo.design.behavioral

import com.example.demo.design.behavioral.commandPattern.vehicle.Bike
import com.example.demo.design.behavioral.commandPattern.vehicle.MotorCycle
import com.example.demo.design.behavioral.commandPattern.Rider
import com.example.demo.design.behavioral.commandPattern.command.impl.BikeCommand
import com.example.demo.design.behavioral.commandPattern.command.impl.MotorCycleCommand
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CommandPattern {
    @Test
    fun 커맨드패턴(){
        // 1. command 선언
        val motorCycleCommand = MotorCycleCommand(MotorCycle())
        val bikeCommand = BikeCommand(Bike())

        // 2. 특정 command를 따를 rider를 선언
        val rider = Rider(motorCycleCommand)
        rider.delivery()

        // 3. command 변경 후 실행
        rider.changeDeliveryCommand(bikeCommand)
        rider.delivery()
    }

}