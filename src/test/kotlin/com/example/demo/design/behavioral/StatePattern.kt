package com.example.demo.design.behavioral

import com.example.demo.design.behavioral.statePattern.Delivery
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StatePattern {
	@Test
	fun 상태패턴(){
		// Delivery Status 변화
		// Wait > Assign > Pickup > Complete
		val delivery = Delivery()
		println("--start--")
		val change1 = delivery.forwardStatus()
		val change2 = delivery.forwardStatus()
		val change3 = delivery.backwardStatus()
		val change4 = delivery.forwardStatus()
		val change5 = delivery.forwardStatus()
		val change6 = delivery.forwardStatus()

		val a = 1
	}
}
