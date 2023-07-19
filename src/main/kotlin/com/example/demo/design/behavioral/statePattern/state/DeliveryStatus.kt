package com.example.demo.design.behavioral.statePattern.state

import com.example.demo.design.behavioral.statePattern.Delivery

/**
 * 배달 상태를 변경하는 인터페이스 정
 * */
interface DeliveryStatus {
    val name:String
    fun forward(delivery: Delivery): String
    fun backward(delivery: Delivery): String
}