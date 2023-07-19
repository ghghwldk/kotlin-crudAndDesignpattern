package com.example.demo.design.behavioral.templateMethodPattern.rider

abstract class Rider(var name: String,
                     var age: Int,
                     var address: String) {

    // 일련의 로직을 수행한다.
    fun work(): String {
        return goToWork() + " " + delivery() + " " + repairVehicle() + " " + offWork()
    }

    // 로직이 같은 부분이므로 하위 클래스가 구현할 필요 없다. 중복제거
    // 하위 클래스가 호출하지 못하도록 제한
    private fun goToWork() = "출근"
    private fun offWork() = "퇴근"

    // 로직이 다른 메소드는 하위 클래스가 구현하도록 한다
    protected abstract fun delivery(): String
    protected abstract fun repairVehicle(): String
}