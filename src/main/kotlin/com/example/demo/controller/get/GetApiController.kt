package com.example.demo.controller.get

import com.example.demo.model.http.UserRequest
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class GetApiController {
    @GetMapping(path=["/hello", "/abcd"])
    fun hello(): String{
        return "hello Kotlin"
    }

    // http://localhost:8080/api/get-mapping/path-variable/steve/31
    @GetMapping("/get-mapping/path-variable/{name}/{age}")
    fun pathVariable(@PathVariable name: String, @PathVariable age: Int): String{
        println("${name}, ${age}")
        return name + " " + age
    }

    // http://localhost:8080/api/get-mapping/path-variable2/steve/31
    @GetMapping("/get-mapping/path-variable2/{name}/{age}")
    fun pathVariable2(@PathVariable(value = "name") _name: String, @PathVariable(name = "age") age:Int): String{
        val name = "kotlin"
        println("${_name} , ${age}")
        return _name+" "+age
    }

    // http://localhost:8080/api/get-mapping/query-param?name=steve&age=20
    @GetMapping("/get-mapping/query-param")
    fun queryParam(
            @RequestParam(name = "name") name: String,
            @RequestParam(value = "age") age:Int
    ): String{
        println("${name} , ${age}")
        return name+" "+age
    }

    @GetMapping("/get-mapping/query-param/object")
    fun queryParamObject(userRequest: UserRequest): UserRequest {
        println(userRequest)
        return userRequest
    }

    @GetMapping("/get-mapping/query-param/map")
    fun queryParamMap(@RequestParam map: Map<String,Any>): Map<String, Any> {
        println(map)
        val phoneNumber = map.get("phone-number").toString()

        return map
    }
}
