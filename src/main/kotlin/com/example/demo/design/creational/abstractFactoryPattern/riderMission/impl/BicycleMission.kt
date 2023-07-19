package com.example.demo.design.creational.abstractFactoryPattern.riderMission.impl

import com.example.demo.design.creational.abstractFactoryPattern.riderMission.RiderMission

class BicycleMission : RiderMission {
    override fun delivery() = "자전거배달"
    override fun repairVehicle() = "자전거수리"
}