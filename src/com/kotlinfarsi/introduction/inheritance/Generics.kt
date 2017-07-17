package com.kotlinfarsi.introduction.inheritance

/**
 * Created by Sina on 7/17/2017
 */

interface Repository<T> {
    fun getById(id:Int) : T

    fun getAll() : List<T>
}

fun main(args: Array<String>) {
    val customerRepo = GenericRepository<Customer>()
    val employeeRepo = GenericRepository<Employee>()
}
