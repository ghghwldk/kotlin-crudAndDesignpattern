package com.example.demo.design.structural.decoratorPattern.child.decorator.rider

import com.example.demo.design.structural.decoratorPattern.Employee
import com.example.demo.design.structural.decoratorPattern.child.decorator.CompanyWorkDecorator

class RiderWithRepairVehicle(private val employee: Employee) : CompanyWorkDecorator() {
    override fun showJobType() = employee.showJobType() + "|수리기사"
    override fun working() = employee.working() + "|오토바이수리"
}
