package com.example.demo.design.behavioral.statePattern.state.impl

import com.example.demo.design.behavioral.statePattern.Delivery
import com.example.demo.design.behavioral.statePattern.state.DeliveryStatus

// 전달완료
object Complete : DeliveryStatus {
    override val name = "Complete(전달완료)"
    // 전달완료는 다음상태가 없기 때문에 진행불가
    override fun forward(delivery: Delivery) = "ImpossibleToFoward"

    override fun backward(delivery: Delivery): String {
        delivery.status = PickedUp
        return delivery.status.name
    }
}