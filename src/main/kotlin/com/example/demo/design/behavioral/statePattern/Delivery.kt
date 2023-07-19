package com.example.demo.design.behavioral.statePattern

import com.example.demo.design.behavioral.statePattern.state.DeliveryStatus
import com.example.demo.design.behavioral.statePattern.state.impl.Waiting

class Delivery {
    var status: DeliveryStatus = Waiting

    fun forwardStatus()= status.forward(this)
    fun backwardStatus() = status.backward(this)
}