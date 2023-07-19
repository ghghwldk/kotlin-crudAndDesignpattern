package com.example.demo.design.behavioral.strategyPattern.goToWork.impl

import com.example.demo.design.behavioral.strategyPattern.goToWork.GoToWorkStrategy

class ByCarStrategy : GoToWorkStrategy {
    override fun goToBy() = "자가용"
}
