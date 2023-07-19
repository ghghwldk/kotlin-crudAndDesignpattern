package com.example.demo.design.structural.decoratorPattern.child

import com.example.demo.design.structural.decoratorPattern.Employee

/**
 * 추상클래스를 상속한 라이더클래스를 만든다
 * 라이더 클래스의 기본업무는 음식배달이다.
 */
class Rider(jobType: String) : Employee(jobType) {
    override fun working() = "음식배달"
}