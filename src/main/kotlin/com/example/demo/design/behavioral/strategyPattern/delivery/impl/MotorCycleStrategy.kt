package com.example.demo.design.behavioral.strategyPattern.delivery.impl

import com.example.demo.design.behavioral.strategyPattern.delivery.DeliveryStrategy

class MotorCycleStrategy : DeliveryStrategy {
    override fun move() = "오토바이"
}
