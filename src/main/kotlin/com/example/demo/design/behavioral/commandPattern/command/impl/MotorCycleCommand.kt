package com.example.demo.design.behavioral.commandPattern.command.impl

import com.example.demo.design.behavioral.commandPattern.vehicle.MotorCycle
import com.example.demo.design.behavioral.commandPattern.command.DeliveryCommand

class MotorCycleCommand(private var motorCycle: MotorCycle) : DeliveryCommand {
    override fun driveVehicle() =
            motorCycle.start() + motorCycle.accelerate()
}