package com.example.demo.design.behavioral

import com.example.demo.design.behavioral.chainOfResponsibilityPattern.impl.InstantFoodRider
import com.example.demo.design.behavioral.chainOfResponsibilityPattern.impl.KoreanFoodRider
import com.example.demo.design.behavioral.chainOfResponsibilityPattern.RiderService
import com.example.demo.design.behavioral.chainOfResponsibilityPattern.impl.WesternFoodRider
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ChainOfResponsibility {

    @Test
    fun 책임연쇄패턴(){
        /*
        * if (foodType == "양식") "양식배달" else next!!.delivery(foodType)
        *
        * Western/Korean/Instant FoodRider 클래스 내부에 위와 같은 코드 존재
        * 본인에게 할당된 것이 아니라면, 나중으로 미룬다는 의미
        * */
        val riderService = RiderService(WesternFoodRider(KoreanFoodRider(InstantFoodRider())))

        val delivery = riderService.delivery("분식")

        println("--start--")
        println(delivery)
    }


}