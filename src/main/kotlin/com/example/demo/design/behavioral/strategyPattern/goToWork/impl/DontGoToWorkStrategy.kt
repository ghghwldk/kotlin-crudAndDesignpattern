package com.example.demo.design.behavioral.strategyPattern.goToWork.impl

import com.example.demo.design.behavioral.strategyPattern.goToWork.GoToWorkStrategy

class DontGoToWorkStrategy : GoToWorkStrategy {
    override fun goToBy() = "출근안함"
}