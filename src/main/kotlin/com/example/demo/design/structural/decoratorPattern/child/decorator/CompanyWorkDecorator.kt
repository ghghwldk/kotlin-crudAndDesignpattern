package com.example.demo.design.structural.decoratorPattern.child.decorator

import com.example.demo.design.structural.decoratorPattern.Employee

abstract class CompanyWorkDecorator : Employee() {
    // Employee 클래스를 상속할 때 추상 메소드가 아닌 메소드를
    // 필요에 의해서 임의로 추상 메소드를 만들 수 도 있다.
    abstract override fun showJobType(): String
}