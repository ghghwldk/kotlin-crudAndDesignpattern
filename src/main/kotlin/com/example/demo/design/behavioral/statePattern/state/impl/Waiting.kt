package com.example.demo.design.behavioral.statePattern.state.impl

import com.example.demo.design.behavioral.statePattern.Delivery
import com.example.demo.design.behavioral.statePattern.state.DeliveryStatus

// 배차대기
object Waiting : DeliveryStatus {
    override val name = "Waiting(배차대기)"

    // 배차대기의 다음 상태는 배차완료 이므로 배차완료 상태로 변경한다.
    override fun forward(delivery: Delivery): String {
        delivery.status = Assigned // 해당 배달을 매겨변수로 넘겨 받아 상태를 변경시킨다.
        return delivery.status.name
    }

    // 배차대기에서 뒤로 갈 상태가 없으므로 뒤로불가 리턴한다.
    override fun backward(delivery: Delivery) = "ImpossibleToBackward"

}