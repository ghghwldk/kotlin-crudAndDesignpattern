package com.example.demo.design.creational.factoryMethodPattern.rider.impl

import com.example.demo.design.creational.factoryMethodPattern.rider.Rider

class FullTimeRider : Rider {
    override fun delivery() = "하루웬종일오토바이배달"
    override fun repairVehicle() = "하루웬종일오토바이수리"
}