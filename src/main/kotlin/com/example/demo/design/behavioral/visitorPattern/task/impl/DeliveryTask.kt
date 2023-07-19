package com.example.demo.design.behavioral.visitorPattern.task.impl

import com.example.demo.design.behavioral.visitorPattern.rider.Rider
import com.example.demo.design.behavioral.visitorPattern.task.RiderTask


class DeliveryTask : RiderTask {
    override fun doTask(rider: Rider) = rider.doTask(this)
}