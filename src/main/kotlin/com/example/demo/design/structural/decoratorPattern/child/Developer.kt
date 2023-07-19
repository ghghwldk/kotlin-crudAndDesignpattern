package com.example.demo.design.structural.decoratorPattern.child

import com.example.demo.design.structural.decoratorPattern.Employee

/**
 * 추상클래스를 상속한 개발자클래스를 만든다
 * 개발자 클래스의 기본업무는 java개발이다.
 */
class Developer(jobType: String) : Employee(jobType) {
    override fun working() = "java개발"
}