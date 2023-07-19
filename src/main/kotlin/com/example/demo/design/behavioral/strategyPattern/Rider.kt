package com.example.demo.design.behavioral.strategyPattern

import com.example.demo.design.behavioral.strategyPattern.delivery.DeliveryStrategy
import com.example.demo.design.behavioral.strategyPattern.goToWork.GoToWorkStrategy

class Rider(
        var name: String,
        private var goToWorkStrategy: GoToWorkStrategy,
        private var deliveryStrategy: DeliveryStrategy) {

    // 추후 변경이 생기면 전략을 갈아 끼운다
    fun changeGoToWorkStrategy(goToWorkStrategy: GoToWorkStrategy) {
        this.goToWorkStrategy = goToWorkStrategy
    }

    fun changeDeliveryStrategy(deliveryStrategy: DeliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy
    }

    // 로직의 일부를 패턴화한 전략을 사용한다.
    fun goToWork() {
        // 아침에 일어난다
        // 샤워를 하고 옷을 입는다
        println(goToWorkStrategy.goToBy()) // 출근 시 이동수단 전략을 사용한다.
        // 내려서 지점 건물 까지 걸어간다.
    }

    fun goToDelivery() {
        // 배달을 배차한다
        // 음식을 픽업한다.
        println(deliveryStrategy.move()) // 배달시 이동수단 전략을 사용한다.
        // 고객에게 음식을 전달한다.
    }
}