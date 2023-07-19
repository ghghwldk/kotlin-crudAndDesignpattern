package com.example.demo.design.behavioral.commandPattern

import com.example.demo.design.behavioral.commandPattern.command.DeliveryCommand

class Rider(private var deliveryCommand: DeliveryCommand) {
    fun changeDeliveryCommand(deliveryCommand: DeliveryCommand): Rider {
        this.deliveryCommand = deliveryCommand
        return this
    }

    fun delivery() = deliveryCommand.driveVehicle()
}