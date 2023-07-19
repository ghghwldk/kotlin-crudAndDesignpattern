package com.example.demo.design.structural.decoratorPattern

/**
 * 기본 기능 즉 "일한다" 정의한 추상 클래스를 만든다
 */
abstract class Employee(var jobType: String = "") {
    open fun showJobType() = jobType
    abstract fun working(): String
}