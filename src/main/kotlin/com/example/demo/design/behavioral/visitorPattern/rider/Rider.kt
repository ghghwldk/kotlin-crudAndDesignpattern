package com.example.demo.design.behavioral.visitorPattern.rider

import com.example.demo.design.behavioral.visitorPattern.task.impl.DeliveryTask
import com.example.demo.design.behavioral.visitorPattern.task.impl.DriveVehicleTask
import com.example.demo.design.behavioral.visitorPattern.task.impl.RepairVehicleTask

interface Rider {
    fun doTask(deliveryTask: DeliveryTask): String
    fun doTask(driveVehicleTask: DriveVehicleTask): String
    fun doTask(repairVehicleTask: RepairVehicleTask): String
}