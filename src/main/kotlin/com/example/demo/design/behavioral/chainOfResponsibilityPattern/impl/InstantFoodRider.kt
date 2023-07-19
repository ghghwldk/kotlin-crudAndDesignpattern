package com.example.demo.design.behavioral.chainOfResponsibilityPattern.impl

import com.example.demo.design.behavioral.chainOfResponsibilityPattern.rider.Rider

class InstantFoodRider(var next: Rider? = null) : Rider {
    override fun delivery(foodType: String) =
            if (foodType == "분식") "분식배달" else next!!.delivery(foodType)
}

