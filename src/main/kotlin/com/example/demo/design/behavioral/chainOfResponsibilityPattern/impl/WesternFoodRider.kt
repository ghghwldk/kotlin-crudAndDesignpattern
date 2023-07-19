package com.example.demo.design.behavioral.chainOfResponsibilityPattern.impl

import com.example.demo.design.behavioral.chainOfResponsibilityPattern.rider.Rider

class WesternFoodRider(var next: Rider? = null) : Rider {
    override fun delivery(foodType: String) =
            if (foodType == "양식") "양식배달" else next!!.delivery(foodType)
}