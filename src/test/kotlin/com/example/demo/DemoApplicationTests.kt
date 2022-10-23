package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {
	class OurLinkedList {
		var first:Node? = null

		private val lastNode:Node?
			get(){
				var currentNode:Node ?= first
				while(currentNode?.next != null){
					currentNode = currentNode.next
				}
				return currentNode
			}
		fun add(data: String){
			val newNode = Node(data, null)
			if(first == null){
				first = newNode
			} else {
				lastNode!!.next = newNode
			}
		}

		val size: Int
			get(){
				var count = 0
				var currentNode:Node? = first
				while(currentNode != null){
					count ++
					currentNode = currentNode.next
				}
				return count
			}

		fun get(index: Int): String {
			var currentNode:Node? = first
			repeat(index){
				currentNode = currentNode!!.next
			}
			return currentNode!!.data
		}

		fun remove(index: Int){
			if(index == 0){
				first = first?.next
				return
			}

			var before:Node?= first
			repeat(index-1){
				before = before?.next
			}

//			var after:Node?= first
//			repeat(index+1){
//				after = after?.next
//			}

//			before?.next = after?.next
			before?.next = before?.next?.next
		}
	}

	class Node(val data: String, var next: Node?)

	@Test
	fun contextLoads() {
		val list = OurLinkedList()

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
