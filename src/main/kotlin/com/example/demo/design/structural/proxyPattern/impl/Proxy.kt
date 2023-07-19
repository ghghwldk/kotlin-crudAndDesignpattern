package com.example.demo.design.structural.proxyPattern.impl

import com.example.demo.design.structural.proxyPattern.FooService

class Proxy: FooService {
    lateinit var service: FooService

    init{
        println("ProxyCreated")
    }

    override fun runSomething() {
        println("Proxy Running...")
        service.runSomething()
    }
}