package com.example.demo.design.structural.compositePattern.child

import com.example.demo.design.structural.compositePattern.JobComponent

class Party(name : String) : JobComponent(){
    val mName = name
    override fun getName(): String = mName
    override fun getPosition(): String? = null
    override fun getPay(): Int {
        var totalpay =0
        for( i in partyList){
            totalpay += i.getPay()
        }
        return totalpay
    }

    private val partyList = mutableListOf<JobComponent>()

    fun add(person : JobComponent){
        partyList.add(person)
    }

    fun remove(person : JobComponent){
        partyList.remove(person)
    }
    fun getIntoEach(){
        partyList.forEach{it-> println("name : ${it.getName()}, position: ${it.getPosition()}")}
    }
    fun totalPersonCount() : Int = partyList.size
}