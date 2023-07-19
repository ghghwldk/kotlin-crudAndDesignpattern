package com.example.demo.design.behavioral.templateMethodPattern

import com.example.demo.design.behavioral.templateMethodPattern.rider.Rider

class DeliveryService(private val rider: Rider) {
    fun delivery() = println(rider.work())
}