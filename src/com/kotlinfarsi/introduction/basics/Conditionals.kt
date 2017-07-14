package com.kotlinfarsi.introduction.basics

/**
 * Created by Sina on 7/14/2017.
 */
fun main(args: Array<String>) {
    var myString= "Not Empty"

//    if(myString != ""){
//        println("Not Empty")
//    }else if (myString.startsWith("a")){
//        println("Starts With A")
//    }else{
//        println("Is Empty")
//    }

//    var result = if(myString != ""){
//        "Not Empty"
//    }else {
//        "Starts With A"
//    }
//
//    println(result)

    var result = "Value"
    val whenValue = when(result){
        "Value" -> {
            println("It's a Value")
            println("Second statement")
            "Here"
        }
        is String -> {
            println("Excellent")
            "And Here"
        }
        else -> {
            println("It came to this?")
            "and what about here?"
        }
    }
    println(whenValue)
}