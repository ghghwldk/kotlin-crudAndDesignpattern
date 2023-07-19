package com.example.demo.design.behavioral.observerPattern.subscriber.impl

import com.example.demo.design.behavioral.observerPattern.subscriber.Subscriber

class DeliveryStatusSubscriber : Subscriber {

    // 배달 상태 변경, 배달 완료 상태라면 이메일을 발송한다.
    override fun onUpdate(deliveryStatus: String): Boolean {
        if (deliveryStatus == "COMPLETE") {
            sendEmail()
        }

        return true
    }

    private fun sendEmail() {
        println("Email 전송완료")
    }
}