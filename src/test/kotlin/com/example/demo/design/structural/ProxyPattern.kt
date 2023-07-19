package com.example.demo.design.structural

import com.example.demo.design.structural.proxyPattern.FooService
import com.example.demo.design.structural.proxyPattern.impl.Proxy
import com.example.demo.design.structural.proxyPattern.impl.ServiceA
import com.example.demo.design.structural.proxyPattern.impl.ServiceB
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ProxyPattern {
    /*
    * 프록시: 프록시는 대리인라는 의미이다.
    * 대리자, 대변인은 누군가를 대신하여 일을 수행한다는 의미이다.
    * 즉, 프록시에게 어떤 일을 대신 시킨다는 의미이다.
    * */
    @Test
    fun 프록시패턴(){
        // no proxy
        var service: FooService = ServiceA()
        service.runSomething()
        service = ServiceB()
        service.runSomething()

        val proxy = Proxy()
        proxy.service = ServiceA()
        proxy.runSomething()
        proxy.service = ServiceB()
        proxy.runSomething()
    }
}