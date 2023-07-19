package com.example.demo.design.structural.flyweightPattern.impl

import com.example.demo.design.structural.flyweightPattern.Rider

class MotorcycleRider(override var center: String) : Rider {
    override fun delivery() = "$center 오토바이배달"
}