package com.example.demo.todo.handler

import com.example.demo.model.http.ErrorResponse
import com.example.demo.todo.controller.api.todo.TodoApiController
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.time.LocalDateTime
import javax.servlet.http.HttpServletRequest

// TodoApiController에서 발생한 에러 처리
@ControllerAdvice(basePackageClasses = [TodoApiController::class])
class TodoApiControllerAdvice {


    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun methodArgumentNotValidException(e: MethodArgumentNotValidException
            , request: HttpServletRequest): ResponseEntity<ErrorResponse> {
        val errors = mutableListOf<com.example.demo.model.http.Error>()

        e.bindingResult.allErrors.forEach { objectError ->

            com.example.demo.model.http.Error().apply {
                this.field = (objectError as FieldError).field
                this.message = objectError.defaultMessage
                this.value = objectError.rejectedValue
            }.apply {
                errors.add(this)
            }
        } // for each end


        val errorResponse = ErrorResponse().apply {
            this.resultCode = "FAIL"
            this.httpStatus = HttpStatus.BAD_REQUEST.value().toString()
            this.httpMethod = request.method
            this.message = ""
            this.path = request.requestURI
            this.timestamp = LocalDateTime.now()
            this.errors = errors
        }
        return ResponseEntity.badRequest().body(errorResponse)
    }


}