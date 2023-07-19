package com.example.demo.design.behavioral.observerPattern.publisher.impl

import com.example.demo.design.behavioral.observerPattern.publisher.Publisher
import com.example.demo.design.behavioral.observerPattern.subscriber.Subscriber

class DeliveryStatusPublisher : Publisher {

    private val observerList = mutableListOf<Subscriber>()
    private var deliveryStatus = "WAIT"

    // 등록된 구독자들에게 이벤트발송
    // 등록된 구독자들을 순회하면서 이벤트 수신 받을 메소드들을 호출한다.
    override fun update(deliveryStatus: String): Boolean {
        this.deliveryStatus = deliveryStatus
        observerList.forEach { it.onUpdate(deliveryStatus) }
        return true
    }

    // 구독자를 추가한다
    override fun add(subscriber: Subscriber) = observerList.add(subscriber)

    // 구독자를 제거한다.
    override fun delete(subscriber: Subscriber) = observerList.remove(subscriber)
}