package com.example.demo.링크드리스트

class CustomLinkedList {
    var first:Node? = null

    private val lastNode:Node?
        get(){
            var currentNode:Node ?= first
            while(currentNode?.next != null){
                currentNode = currentNode.next
            }
            return currentNode
        }
    fun add(data: String){
        val newNode = Node(data, null)
        if(first == null){
            first = newNode
        } else {
            lastNode!!.next = newNode
        }
    }

    val size: Int
        get(){
            var count = 0
            var currentNode:Node? = first
            while(currentNode != null){
                count ++
                currentNode = currentNode.next
            }
            return count
        }

    fun get(index: Int): String {
        var currentNode:Node? = first
        repeat(index){
            currentNode = currentNode!!.next
        }
        return currentNode!!.data
    }

    fun remove(index: Int){
        if(index == 0){
            first = first?.next
            return
        }

        var before:Node?= first
        repeat(index-1){
            before = before?.next
        }
        before?.next = before?.next?.next
    }
}