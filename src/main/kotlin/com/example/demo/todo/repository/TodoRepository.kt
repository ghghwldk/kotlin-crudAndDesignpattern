package com.example.demo.todo.repository

import com.example.demo.todo.database.Todo

interface TodoRepository {

    fun save(todo: Todo): Todo?
    fun saveAll(todoList: MutableList<Todo>): Boolean

    fun delete(index: Int): Boolean

    fun findOne(index:Int): Todo?
    fun findAll(): MutableList<Todo>

}