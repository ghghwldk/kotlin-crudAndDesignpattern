package com.example.demo.design.creational.factoryMethodPattern.rider.impl

import com.example.demo.design.creational.factoryMethodPattern.rider.Rider

class NightTimeRider : Rider {
    override fun delivery() = "밤에오토바이배달"
    override fun repairVehicle() = "밤에오토바이수리"
}