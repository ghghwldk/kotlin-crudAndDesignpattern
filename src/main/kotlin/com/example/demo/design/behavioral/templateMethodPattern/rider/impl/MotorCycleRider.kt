package com.example.demo.design.behavioral.templateMethodPattern.rider.impl

import com.example.demo.design.behavioral.templateMethodPattern.rider.Rider

class MotorCycleRider(name: String,
                      age: Int,
                      address: String,
                      var employeeNumber: Int)
    : Rider(name, age, address) {

    override fun delivery() = "오토바이배달"
    override fun repairVehicle() = "오토바이수리"
}