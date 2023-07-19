package com.example.demo.design.behavioral

import com.example.demo.design.behavioral.visitorPattern.TotalRiderTaskVisitor
import com.example.demo.design.behavioral.visitorPattern.rider.impl.FullTimeRider
import com.example.demo.design.behavioral.visitorPattern.rider.impl.PartTimeRider
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class VisitorPattern {
	@Test
	fun 방문자패턴테스트(){
		val fullTimeRider = FullTimeRider()
		val partTimeRider = PartTimeRider()
		val totalRiderTaskVisitor = TotalRiderTaskVisitor()

		/**
		 * doTask 메소드는 정규직/시간제 라이더 타입별, 배달/운전/수리 메소드별 처리를 구분하는 로직이 필요 없고
		 * 추후 라이더 타입 추가 및 메소드 추가에도 코드 변경으로부터 자유롭다.
		 * */
		println(totalRiderTaskVisitor.doTask(fullTimeRider))
		println(totalRiderTaskVisitor.doTask(partTimeRider))
	}
}
