package com.example.demo.design.creational.factoryMethodPattern.rider.impl

import com.example.demo.design.creational.factoryMethodPattern.rider.Rider

class PartTimeRider : Rider {
    override fun delivery() = "가끔씩배달"
    override fun repairVehicle() = "가끔식수리"
}