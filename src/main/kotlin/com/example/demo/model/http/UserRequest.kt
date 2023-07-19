package com.example.demo.model.http

import com.example.demo.annotation.StringFormatDateTime

import javax.validation.constraints.*

data class UserRequest(
        /*
        * 잘 봐라, 여기는 생성자이다.
        * */
        @field:NotEmpty // data
        @field:Size(min = 2 , max = 8)
        var name:String?=null,

        @field:PositiveOrZero // 0 < 숫자를 검증 0 도 포함 (양수)
        var age:Int?=null,

        @field:Email    // email 양식
        var email:String?=null,

        @field:NotBlank // 공백을 검증
        var address:String?=null,

        @field:Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}\$")  // 정규식 검증
        var phoneNumber:String?=null,    // phone_number

        @field:StringFormatDateTime(pattern = "yyyy-MM-dd HH:mm:ss", message = "패턴이 올바르지 않습니다.")
        var createdAt:String?=null  // yyyy-MM-dd HH:mm:ss   ex) 2020-10-02 13:00:00
){

}