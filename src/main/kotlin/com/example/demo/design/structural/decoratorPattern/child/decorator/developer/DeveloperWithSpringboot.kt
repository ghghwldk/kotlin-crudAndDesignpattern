package com.example.demo.design.structural.decoratorPattern.child.decorator.developer

import com.example.demo.design.structural.decoratorPattern.Employee
import com.example.demo.design.structural.decoratorPattern.child.decorator.CompanyWorkDecorator

class DeveloperWithSpringboot(private val employee: Employee) : CompanyWorkDecorator() {
    override fun showJobType() = employee.showJobType() + "|백엔드"
    override fun working() = employee.working() + "|springboot"
}