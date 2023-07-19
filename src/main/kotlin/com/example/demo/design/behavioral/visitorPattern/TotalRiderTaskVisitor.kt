package com.example.demo.design.behavioral.visitorPattern

import com.example.demo.design.behavioral.visitorPattern.rider.Rider
import com.example.demo.design.behavioral.visitorPattern.task.RiderTask
import com.example.demo.design.behavioral.visitorPattern.task.impl.DeliveryTask
import com.example.demo.design.behavioral.visitorPattern.task.impl.DriveVehicleTask
import com.example.demo.design.behavioral.visitorPattern.task.impl.RepairVehicleTask


class TotalRiderTaskVisitor : RiderTask {
    private val riderTaskList =
            mutableListOf(DeliveryTask(), DriveVehicleTask(), RepairVehicleTask())

    // 배달/운전/수리 모든 메소드를 수행한다.
    override fun doTask(rider: Rider) =
            riderTaskList.joinToString(separator = " "){ it.doTask(rider) }
}