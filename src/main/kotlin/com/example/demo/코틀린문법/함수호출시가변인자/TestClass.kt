package com.example.demo.코틀린문법.함수호출시가변인자

class TestClass {
    fun <T> newList(vararg ts: T): List<T>{
        val result = ArrayList<T>()
        for(t in ts) result.add(t)
        return result
    }
}