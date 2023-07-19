package com.example.demo.design.creational

import com.example.demo.design.creational.abstractFactoryPattern.RiderService
import com.example.demo.design.creational.abstractFactoryPattern.factory.impl.FullTimeRiderFactory
import com.example.demo.design.creational.abstractFactoryPattern.factory.impl.BicycleRiderFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AbstractFactoryPattern {
    @Test
    fun 추상팩토리패턴(){
        // 라이더의 종류를 선택하여 팩토리를 매겨변수로 넘겨준다.
        // 클라이언트가 원하는 종류를 선택하여 사용한다.
        val riderService1 = RiderService(FullTimeRiderFactory)
        val riderService2 = RiderService(BicycleRiderFactory)

        assertEquals("오토바이배달오토바이헬멧착용악셀", riderService1.work())
        assertEquals("자전거배달자전거헬멧착용페달", riderService2.work())
    }
}