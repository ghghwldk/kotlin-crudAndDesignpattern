package com.example.demo.design.structural.proxyPattern.impl

import com.example.demo.design.structural.proxyPattern.FooService

class ServiceB : FooService{
    override fun runSomething() {
        println("ServiceB running")
    }
}