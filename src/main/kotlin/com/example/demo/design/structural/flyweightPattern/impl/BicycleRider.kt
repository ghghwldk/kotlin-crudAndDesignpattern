package com.example.demo.design.structural.flyweightPattern.impl

import com.example.demo.design.structural.flyweightPattern.Rider

class BicycleRider(override var center: String) : Rider {
    override fun delivery() = "$center 자전거배달"
}