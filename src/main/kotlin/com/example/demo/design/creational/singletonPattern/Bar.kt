package com.example.demo.design.creational.singletonPattern

class Bar private constructor(var name: String){
    companion object{
        private var instance: Bar? = null
        fun getInstance(): Bar = instance ?: Bar("bar").also { instance = it}
    }
}