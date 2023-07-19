package com.example.demo.etc

import com.example.demo.코틀린문법.함수호출시가변인자.TestClass
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class 함수호출시가변인자 {
	@Test
	fun 함수호출시가변인자() {
		val newList = TestClass().newList(1, 2, 3)
		val item = Array(5) { idx -> idx + 1 }
		// *는 스프레드 연산자이다. item 배열의 요소를 풀어서 넘긴다.
		val newList2 = TestClass().newList(*item)
	}
}
