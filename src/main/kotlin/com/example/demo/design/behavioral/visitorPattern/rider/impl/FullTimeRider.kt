package com.example.demo.design.behavioral.visitorPattern.rider.impl

import com.example.demo.design.behavioral.visitorPattern.rider.Rider
import com.example.demo.design.behavioral.visitorPattern.task.impl.DeliveryTask
import com.example.demo.design.behavioral.visitorPattern.task.impl.DriveVehicleTask
import com.example.demo.design.behavioral.visitorPattern.task.impl.RepairVehicleTask


class FullTimeRider : Rider {
    override fun doTask(deliveryTask: DeliveryTask) = "오토바이배달"
    override fun doTask(driveVehicleTask: DriveVehicleTask) = "오토바이를운전한다"
    override fun doTask(repairVehicleTask: RepairVehicleTask) = "오토바이를수리한다"
}