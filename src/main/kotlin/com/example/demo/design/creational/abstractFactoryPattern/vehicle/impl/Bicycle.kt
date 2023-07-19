package com.example.demo.design.creational.abstractFactoryPattern.vehicle.impl

import com.example.demo.design.creational.abstractFactoryPattern.vehicle.Vehicle

class Bicycle : Vehicle {
    override fun start() = "없음"
    override fun move() = "페달"
}