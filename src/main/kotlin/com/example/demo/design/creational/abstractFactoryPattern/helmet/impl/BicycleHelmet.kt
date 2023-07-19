package com.example.demo.design.creational.abstractFactoryPattern.helmet.impl

import com.example.demo.design.creational.abstractFactoryPattern.helmet.Helmet

class BicycleHelmet : Helmet {
    override fun wear() = "자전거헬멧착용"
}