package com.example.demo

import com.example.demo.링크드리스트.CustomLinkedList
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {
	@Test
	fun contextLoads() {
		val list = CustomLinkedList()

		list.add("Element 1")
		list.add("Element 2")

		println(list.get(0))
		println(list.get(1))

		println("Our list has the size: ${list.size}")

		list.add("Element 3")
		list.remove(1)

		println("This should be Element1")
		println(list.get(0))
		println("This should be Element3")
		println(list.get(1))
	}
}
