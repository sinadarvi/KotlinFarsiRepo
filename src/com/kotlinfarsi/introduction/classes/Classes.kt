package com.kotlinfarsi.introduction.classes

import java.util.*

/**e
 * Created by Sina on 7/15/2017
 */
class Customer(var id: Int, var name: String, var yearOfBirth: Int){
    val age :Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if(!value.startsWith("SM")){
                throw IllegalArgumentException("Social security should start with SM")
            }
            field = value
        }

    fun customerAsString(){
        println("id : $id - name : $name")
    }
}

fun main(args: Array<String>) {
    var customer = Customer(10, "Sina",1995)
    customer.socialSecurityNumber = "SM11234"

    println(customer.age)
    println(customer.socialSecurityNumber)

    customer.customerAsString()
}