package com.kotlinfarsi.introduction.interop

import com.kotlinfarsi.introduction.classes.CustomerJava

/**
 * Created by Sina on 8/6/2017
 */
fun main(args: Array<String>) {
    val customer = CustomerJava()
    println(customer.email)

    val runnable = Runnable { println("Invoking") }
}

class PersonKotlin : PersonJava()

class KotlinCustomerRepo : CustomerRepository {
    override fun getAll(): MutableList<CustomerJava> {
        TODO("not implemented")
    }
    override fun getById(id: Int): CustomerJava {
        TODO("not implemented")
    }
}

class RunnableKotlin : Runnable {
    override fun run() {
        TODO("not implemented")
    }
}
