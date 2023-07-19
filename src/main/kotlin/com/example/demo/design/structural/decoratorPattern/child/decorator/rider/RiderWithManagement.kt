package com.example.demo.design.structural.decoratorPattern.child.decorator.rider

import com.example.demo.design.structural.decoratorPattern.Employee
import com.example.demo.design.structural.decoratorPattern.child.decorator.CompanyWorkDecorator

class RiderWithManagement(private val employee: Employee) : CompanyWorkDecorator() {
    override fun showJobType() = employee.showJobType() + "|관리자"
    override fun working() = employee.working() + "|라이더관리업무"
}