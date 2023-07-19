package com.example.demo.design.behavioral

import com.example.demo.design.behavioral.observerPattern.publisher.impl.DeliveryStatusPublisher
import com.example.demo.design.behavioral.observerPattern.subscriber.impl.DeliveryStatusSubscriber
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ObserverPattern {

    @Test
    fun 옵저버패턴(){
        val p = DeliveryStatusPublisher()

        val s1 = DeliveryStatusSubscriber()
        val s2 = DeliveryStatusSubscriber()
        val s3 = DeliveryStatusSubscriber()
        p.add(s1)
        p.add(s2)
        p.add(s3)

        println("--start--")
        p.update("NOT COMPLETE")
        p.update("COMPLETE")

        p.update("NOT COMPLETE")
        p.update("COMPLETE")
    }


}