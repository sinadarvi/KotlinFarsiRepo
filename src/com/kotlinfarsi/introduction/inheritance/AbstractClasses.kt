package com.kotlinfarsi.introduction.inheritance

/**
 * Created by Sina on 7/17/2017
 */

abstract class StoredEntity{
    val isActive = true
    abstract fun store()
    fun status():String{
        return isActive.toString()
    }
}

class Employee: StoredEntity() {
    override fun store() {
        TODO("not implemented")
    }
}

fun main(args: Array<String>) {
    val se = Employee()

    se.isActive
    se.status()
}