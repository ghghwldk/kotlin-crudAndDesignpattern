package com.example.demo.design.creational.abstractFactoryPattern

import com.example.demo.design.creational.abstractFactoryPattern.factory.RiderFactory

class RiderService(private val riderFactory: RiderFactory) {
    fun work(): String {
        val riderMission = riderFactory.getMission()
        val helmet = riderFactory.getHelmet()
        val vehicle = riderFactory.getVehicle()
        return riderMission.delivery() + helmet.wear() + vehicle.move()
    }
}