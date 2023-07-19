package com.example.demo.design.behavioral.chainOfResponsibilityPattern.impl

import com.example.demo.design.behavioral.chainOfResponsibilityPattern.rider.Rider

class KoreanFoodRider(var next: Rider? = null) : Rider {
    override fun delivery(foodType: String) =
            if (foodType == "한식") "한식배달" else next!!.delivery(foodType)
}
