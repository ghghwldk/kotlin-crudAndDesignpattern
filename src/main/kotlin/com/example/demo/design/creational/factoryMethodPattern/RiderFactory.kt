package com.example.demo.design.creational.factoryMethodPattern

import com.example.demo.design.creational.factoryMethodPattern.rider.impl.FullTimeRider
import com.example.demo.design.creational.factoryMethodPattern.rider.impl.NightTimeRider
import com.example.demo.design.creational.factoryMethodPattern.rider.impl.PartTimeRider
import com.example.demo.design.creational.factoryMethodPattern.rider.Rider
import java.time.LocalDateTime

class RiderFactory {
    fun createRider(className: String): Rider {
        return when (className) {
            "fulltime" -> FullTimeRider()
            "parttime" -> PartTimeRider()
            "nighttime" ->
                if (LocalDateTime.now().hour > 21)
                    NightTimeRider()
                else
                    throw IllegalArgumentException("오후 9시 이후만 생성 가능합니다")
            else -> throw IllegalArgumentException("생성할 수 있는 객체명이 아닙니다.")
        }
    }
}