package com.example.demo.model.http

import com.example.demo.todo.model.http.TodoDto
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import javax.validation.Validation

@SpringBootTest
class TodoDtoTest {
    val validator = Validation.buildDefaultValidatorFactory().validator

    @Test
    fun todoDtoTest(){
        val todoDto = TodoDto().apply{
            this.title = ""
            this.description = ""
            this.schedule = "2020-10-20 13:00:0023123"
        }

        val result = validator.validate(todoDto)

        result.forEach{
            println(it.propertyPath.last().name)
            println(it.message)
            println(it.invalidValue)
        }

        Assertions.assertEquals(true, result.isEmpty())
    }
}