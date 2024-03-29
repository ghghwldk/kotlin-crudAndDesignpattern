package com.example.demo.controller.post

import com.example.demo.model.http.UserRequest
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class PostApiController {
    @PostMapping("/post-mapping")
    fun postMapping(): String{
        return "post-mapping"
    }

    @RequestMapping(method = [RequestMethod.POST],
            path = ["/request-mapping"])
    fun requestMapping(): String{
        return "request-mapping"
    }

    @PostMapping("/post-mapping/object")
    fun postMappingObject(@RequestBody userRequest: UserRequest):
            UserRequest{
        // json -> object
        println(userRequest)
        return userRequest  // object -> json
    }
}