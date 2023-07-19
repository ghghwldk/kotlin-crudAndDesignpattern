package com.example.demo.design.behavioral.visitorPattern.task

import com.example.demo.design.behavioral.visitorPattern.rider.Rider

interface RiderTask {
    fun doTask(rider: Rider): String
}