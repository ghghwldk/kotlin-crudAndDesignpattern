package com.example.demo.design.behavioral.commandPattern.command.impl

import com.example.demo.design.behavioral.commandPattern.vehicle.Bike
import com.example.demo.design.behavioral.commandPattern.command.DeliveryCommand

class BikeCommand(private var bike: Bike) : DeliveryCommand {
    override fun driveVehicle() = bike.pedaling()
}
