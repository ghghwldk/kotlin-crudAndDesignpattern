package com.example.demo.design.behavioral.observerPattern.publisher

import com.example.demo.design.behavioral.observerPattern.subscriber.Subscriber

// 발행 인터페이스를 정의한다.
interface Publisher {
    fun update(deliveryStatus: String): Boolean
    fun add(subscriber: Subscriber): Boolean
    fun delete(subscriber: Subscriber): Boolean

}