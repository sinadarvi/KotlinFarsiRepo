package com.kotlinfarsi.introduction.tidbits

/**
 * Created by Sina on 7/17/2017
 */
open class Person

class Employee: Person(){
    fun vactionDays(days: Int){
        if(days < 60)
            println("You need more vacation")
    }
}

var input : Any = 10
fun main(args: Array<String>) {
    val str = input as? String
    println(str?.length)
}