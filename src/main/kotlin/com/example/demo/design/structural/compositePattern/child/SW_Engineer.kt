package com.example.demo.design.structural.compositePattern.child

import com.example.demo.design.structural.compositePattern.JobComponent

class SW_Engineer(name : String, position : String, pay : Int) : JobComponent(){

    val mName = name
    val mPosition = position
    val mPay = pay

    override fun getName(): String  = mName
    override fun getPosition(): String  = mPosition
    override fun getPay(): Int = mPay


}