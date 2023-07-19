package com.example.demo.design.behavioral.statePattern.state.impl

import com.example.demo.design.behavioral.statePattern.Delivery
import com.example.demo.design.behavioral.statePattern.state.DeliveryStatus

// 픽업완료
object PickedUp : DeliveryStatus {
    override val name = "PickedUp(픽업완료)"
    override fun forward(delivery: Delivery): String {
        delivery.status = Complete
        return delivery.status.name
    }

    override fun backward(delivery: Delivery): String {
        delivery.status = Assigned
        return delivery.status.name
    }

}