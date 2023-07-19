package com.example.demo.design.behavioral.statePattern.state.impl

import com.example.demo.design.behavioral.statePattern.Delivery
import com.example.demo.design.behavioral.statePattern.state.DeliveryStatus

// 배차완료
object Assigned : DeliveryStatus {
    override val name = "Assigned(배차완료)"
    override fun forward(delivery: Delivery): String {
        delivery.status = PickedUp
        return delivery.status.name
    }

    override fun backward(delivery: Delivery): String {
        delivery.status = Waiting
        return delivery.status.name
    }

}