package com.example.demo.todo.repository

import com.example.demo.todo.database.Todo
import com.example.demo.todo.database.TodoDataBase
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class TodoRepositoryImpl(
        val todoDataBase: TodoDataBase
) : TodoRepository{

    /**
     * 5가지 기본적인 범위 지정함수
     * let, run, apply, also, with
     *
     * 범위 지정함수 = 수신객체 지정 람다(함수)
     * 수신객체를 명시하지 않거나 it을 호출하는 것만으로 람다 안에서 수신객체의 메서드를 호출 가능
     * */
    override fun  save(todo: Todo): Todo? {
        return todo.index?.let {  index ->
            // update

            findOne(index)?.apply {
                this.title = todo.title
                this.description = todo.description
                this.schedule = todo.schedule
                this.updatedAt = LocalDateTime.now()
            }
        }?: kotlin.run {
            // insert

            todo.apply {
                this.index = ++todoDataBase.index
                this.createdAt = LocalDateTime.now()
                this.updatedAt = LocalDateTime.now()
            }.run {
                todoDataBase.todoList.add(todo)
                this
            }
        }
    }

    override fun saveAll(todoList: MutableList<Todo>): Boolean {
        return try{
            todoList.forEach {
                save(it)
            }
            true
        }catch (e: Exception){
            false
        }
    }

    override fun delete(index: Int): Boolean {

        return findOne(index)?.let {
            todoDataBase.todoList.remove(it)
            true
        }?: kotlin.run {
            false
        }
    }

    override fun findOne(index: Int): Todo? {
        return todoDataBase.todoList.firstOrNull { it.index == index }
    }

    override fun findAll(): MutableList<Todo> {
        return todoDataBase.todoList
    }
}