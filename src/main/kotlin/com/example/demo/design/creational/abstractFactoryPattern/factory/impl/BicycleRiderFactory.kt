package com.example.demo.design.creational.abstractFactoryPattern.factory.impl

import com.example.demo.design.creational.abstractFactoryPattern.riderMission.impl.BicycleMission
import com.example.demo.design.creational.abstractFactoryPattern.factory.RiderFactory
import com.example.demo.design.creational.abstractFactoryPattern.helmet.impl.BicycleHelmet
import com.example.demo.design.creational.abstractFactoryPattern.vehicle.impl.Bicycle

object BicycleRiderFactory : RiderFactory {
    override fun getMission() = BicycleMission()
    override fun getHelmet() = BicycleHelmet()
    override fun getVehicle() = Bicycle()
}