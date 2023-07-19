package com.example.demo.design.structural

import com.example.demo.design.structural.adapterPattern.CelsiusTemperature
import com.example.demo.design.structural.adapterPattern.FahrenheitTemperature
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AdapterPattern {
    @Test
    fun test(){
        val celsiusTemperature = CelsiusTemperature(0.0)
        val fahrenheitTemperature = FahrenheitTemperature(celsiusTemperature)

        celsiusTemperature.temperature = 36.6
        println("${celsiusTemperature.temperature} C -> ${fahrenheitTemperature.temperature} F")

        fahrenheitTemperature.temperature = 100.0
        println("${fahrenheitTemperature.temperature} F -> ${celsiusTemperature.temperature} C")
    }
}