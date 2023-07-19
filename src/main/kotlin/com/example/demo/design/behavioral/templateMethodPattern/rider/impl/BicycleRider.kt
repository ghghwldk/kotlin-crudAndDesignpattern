package com.example.demo.design.behavioral.templateMethodPattern.rider.impl

import com.example.demo.design.behavioral.templateMethodPattern.rider.Rider

class BicycleRider(name: String,
                   age: Int,
                   address: String,
                   var feePerDelivery: Int)
    : Rider(name, age, address) {

    override fun delivery() = "자전거배달"
    override fun repairVehicle() = "자전거수리"
}