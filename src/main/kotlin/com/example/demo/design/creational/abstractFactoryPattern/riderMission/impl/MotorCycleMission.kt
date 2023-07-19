package com.example.demo.design.creational.abstractFactoryPattern.riderMission.impl

import com.example.demo.design.creational.abstractFactoryPattern.riderMission.RiderMission

class MotorCycleMission : RiderMission {
    override fun delivery() = "오토바이배달"
    override fun repairVehicle() = "오토바이수리"
}