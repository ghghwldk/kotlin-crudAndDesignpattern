package com.example.demo.design.behavioral.observerPattern.subscriber

// 구독 인터페이스를 정의한다.
interface Subscriber {
    fun onUpdate(deliveryStatus: String): Boolean
}