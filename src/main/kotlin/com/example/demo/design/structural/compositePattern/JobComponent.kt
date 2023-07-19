package com.example.demo.design.structural.compositePattern

abstract  class JobComponent{
    abstract fun getName() : String
    abstract fun getPosition() : String?
    abstract  fun getPay() : Int
}