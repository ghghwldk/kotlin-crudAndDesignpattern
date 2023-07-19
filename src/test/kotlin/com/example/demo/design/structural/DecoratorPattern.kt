package com.example.demo.design.structural

import com.example.demo.design.structural.decoratorPattern.child.Developer
import com.example.demo.design.structural.decoratorPattern.child.decorator.developer.DeveloperWithReactJs
import com.example.demo.design.structural.decoratorPattern.child.decorator.developer.DeveloperWithSpringboot
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DecoratorPattern {
    // 나중에 필요한 기능을 조합할 때 덧붙여 조합하여 최종 기능을 만드는데 활용된다.
    @Test
    fun 데코레이터패턴(){
        // 개발자 기본 객체 단순히 일한다는 기능만 있음
        val developer = Developer("개발자")

        // 개발자+ReactJS 개발 기능을 추가함
        val developerWithReactJs = DeveloperWithReactJs(developer)

        // 개발자+ReactJS+SpringBoot 개발 기능을 추가 하여 풀스택개발자를 만듬
        val fullStackDeveloper = DeveloperWithSpringboot(developerWithReactJs)
    }
}