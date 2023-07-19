package com.example.demo.design.structural.proxyPattern.impl

import com.example.demo.design.structural.proxyPattern.FooService

class ServiceA : FooService {
    override fun runSomething() {
        println("ServiceA running")
    }
}