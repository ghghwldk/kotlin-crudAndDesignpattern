package com.example.demo.design.structural.decoratorPattern.child.decorator.developer

import com.example.demo.design.structural.decoratorPattern.Employee
import com.example.demo.design.structural.decoratorPattern.child.decorator.CompanyWorkDecorator

class DeveloperWithReactJs(private var employee: Employee) : CompanyWorkDecorator() {
    override fun showJobType() = employee.showJobType() + "|프론트엔드"
    override fun working() = employee.working() + "|reactjs"
}