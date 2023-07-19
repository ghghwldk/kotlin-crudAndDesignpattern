package com.example.demo.design.behavioral.chainOfResponsibilityPattern

import com.example.demo.design.behavioral.chainOfResponsibilityPattern.rider.Rider

class RiderService(private val rider: Rider) {
    fun delivery(foodType:String): String = rider.delivery(foodType)
}