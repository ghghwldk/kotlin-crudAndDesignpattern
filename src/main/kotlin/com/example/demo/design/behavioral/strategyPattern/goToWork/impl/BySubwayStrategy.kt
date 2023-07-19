package com.example.demo.design.behavioral.strategyPattern.goToWork.impl

import com.example.demo.design.behavioral.strategyPattern.goToWork.GoToWorkStrategy

class BySubwayStrategy : GoToWorkStrategy {
    override fun goToBy() = "지하철"
}
