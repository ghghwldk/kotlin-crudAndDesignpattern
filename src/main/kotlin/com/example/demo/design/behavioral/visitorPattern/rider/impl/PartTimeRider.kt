package com.example.demo.design.behavioral.visitorPattern.rider.impl

import com.example.demo.design.behavioral.visitorPattern.rider.Rider
import com.example.demo.design.behavioral.visitorPattern.task.impl.DeliveryTask
import com.example.demo.design.behavioral.visitorPattern.task.impl.DriveVehicleTask
import com.example.demo.design.behavioral.visitorPattern.task.impl.RepairVehicleTask


class PartTimeRider : Rider {
    override fun doTask(deliveryTask: DeliveryTask) = "자전거배달"
    override fun doTask(driveVehicleTask: DriveVehicleTask) = "자전거를운전한다"
    override fun doTask(repairVehicleTask: RepairVehicleTask) = "자전거를수리한다"
}