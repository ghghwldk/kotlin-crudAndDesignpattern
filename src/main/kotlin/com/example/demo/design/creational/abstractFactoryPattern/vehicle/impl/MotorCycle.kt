package com.example.demo.design.creational.abstractFactoryPattern.vehicle.impl

import com.example.demo.design.creational.abstractFactoryPattern.vehicle.Vehicle

class MotorCycle : Vehicle {
    override fun start() = "시동버튼"
    override fun move() = "악셀"
}