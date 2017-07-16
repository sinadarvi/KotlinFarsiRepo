package com.kotlinfarsi.introduction.classes

/**
 * Created by Sina on 7/16/2017
 */
data class CustomerKotlin(var id: Int, var name: String, var email: String){
    override fun toString(): String {
        return "{\"id\": \"$id\", \"name\": \"$name\"}"
    }
}

fun main(args: Array<String>) {

    val customer1 = CustomerKotlin(1,"Sina","Sinadarvi@gmail.com")
    val customer2 = CustomerKotlin(1,"Sina","Sinadarvi@gmail.com")

    if(customer1 == customer2){
        println("They are the same")
    }else{
        println("they are not the same")
    }

    var customer3 = customer1
    var customer4 = customer1.copy(email = "Sina@Darvishi.com")
}