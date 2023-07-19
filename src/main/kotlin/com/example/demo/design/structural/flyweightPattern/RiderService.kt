package com.example.demo.design.structural.flyweightPattern

class RiderService (){
    private val riderFactory = RiderFactory()
    fun delivery(center: String, type: String) = riderFactory
            .getRider(center, type)
            .delivery()
}