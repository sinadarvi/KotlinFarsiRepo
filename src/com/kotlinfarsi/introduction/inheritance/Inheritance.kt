package com.kotlinfarsi.introduction.inheritance

/**
 * Created by Sina on 7/16/2017
 */
open class Person{
    open fun validate(){

    }
}

class Customer: Person{
    override fun validate() {
        super.validate()
    }

    constructor():super(){

    }
}

fun main(args: Array<String>) {
    val customer = Customer()

    customer.validate()
}