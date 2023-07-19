package com.example.demo.design.behavioral.strategyPattern.delivery.impl

import com.example.demo.design.behavioral.strategyPattern.delivery.DeliveryStrategy

class BikeStrategy : DeliveryStrategy {
    override fun move() = "자전거"
}