package com.example.demo.design.structural

import com.example.demo.design.structural.compositePattern.child.Party
import com.example.demo.design.structural.compositePattern.child.SW_Engineer
import com.example.demo.design.structural.compositePattern.child.UI_Designer
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CompositePattern {
    @Test
    fun 컴포지트패턴(){
        val sw_1 = SW_Engineer("A","Android", 1000)
        val sw_2 = SW_Engineer("B","ios", 1000)
        val sw_3 = SW_Engineer("C","Server", 1500)
        val ui_1 = UI_Designer("D","All_round",1200)

        val party = Party("test project")
        party.add(sw_1)
        party.add(sw_2)
        party.add(sw_3)
        party.add(ui_1)

        val totalpay = party.getPay()
        val totalperson = party.totalPersonCount()
        val partyName = party.getName()
        println("project Name : $partyName")
        println("totalPerson Count : $totalperson")
        println("totlaPay: $totalpay")
        party.getIntoEach()
    }
}