package com.example.demo.design.creational

import com.example.demo.design.creational.singletonPattern.Foo
import com.example.demo.design.creational.singletonPattern.Bar
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class Singleton {
	@Test
	fun 싱글톤패턴테스트(){
		if(Foo.sampleString == Foo.sampleString){
			print("동등성 비교 true")
		}
		if(Foo.sampleString === Foo.sampleString){
			print("동일성 비교 true")
		}

		val s2 = Bar.getInstance()
	}
}
