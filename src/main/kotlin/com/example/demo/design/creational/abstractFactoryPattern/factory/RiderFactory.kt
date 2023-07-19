package com.example.demo.design.creational.abstractFactoryPattern.factory

import com.example.demo.design.creational.abstractFactoryPattern.riderMission.RiderMission
import com.example.demo.design.creational.abstractFactoryPattern.helmet.Helmet
import com.example.demo.design.creational.abstractFactoryPattern.vehicle.Vehicle

interface RiderFactory {
    fun getMission(): RiderMission
    fun getHelmet(): Helmet
    fun getVehicle(): Vehicle
}