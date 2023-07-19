package com.example.demo.design.creational.abstractFactoryPattern.factory.impl

import com.example.demo.design.creational.abstractFactoryPattern.factory.RiderFactory
import com.example.demo.design.creational.abstractFactoryPattern.helmet.impl.MotorCycleHelmet
import com.example.demo.design.creational.abstractFactoryPattern.riderMission.impl.MotorCycleMission
import com.example.demo.design.creational.abstractFactoryPattern.vehicle.impl.MotorCycle

// 팩토리 클래스는 싱글톤으로 선언한다.
object FullTimeRiderFactory : RiderFactory {
    override fun getMission() = MotorCycleMission()
    override fun getHelmet() = MotorCycleHelmet()
    override fun getVehicle() = MotorCycle()
}