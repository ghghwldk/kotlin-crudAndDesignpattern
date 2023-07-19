package com.example.demo.design.structural.flyweightPattern

import com.example.demo.design.structural.flyweightPattern.impl.MotorcycleRider
import com.example.demo.design.structural.flyweightPattern.impl.BicycleRider
import kotlin.reflect.full.primaryConstructor

class RiderFactory {
    // 인스턴스 생성시 if문을 제거 하기 위해서 map활용하여 관리함
    private val riderClasses =
            mapOf("motorcycle" to MotorcycleRider::class, "bicycle" to BicycleRider::class)
    // 생성된 인스턴스가 관리됨
    private val riderMap = mutableMapOf<String, Rider>()

    // 강남지점-정규직라이더가 이미 있으면 리턴
    // 없으면 riderClasses에서 클래스원본을 가져와 리플렉션을 사용하여 새 인스턴스를 생성
    // 이 로직은 단순히 if 처리를 제거하기 위함임(패턴과는 관계 없음)
    fun getRider(center: String, type: String) =
        riderMap.computeIfAbsent(center + type) {
            riderClasses[type]!!.primaryConstructor!!.call(center)
        }
}