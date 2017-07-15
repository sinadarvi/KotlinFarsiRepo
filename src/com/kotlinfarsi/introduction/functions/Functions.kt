package com.kotlinfarsi.introduction.functions

/**
 * Created by Sina on 7/15/2017
 */

fun hello(): Unit{
    println("Hello")
}

fun throwingException(): Nothing{
    throw Exception("This function throws an exception")
}

fun returnAFour(): Int {
    return 4
}

fun takingString(name: String){
    println(name)
}

fun sum(x:Int, y:Int, z:Int=0) = x+y+z

fun printDetails(name: String,email: String="",phone: String){
    println("name :  $name - email : $email - phone : $phone")
}

fun printStrings(vararg strings:String){
    realyPrintStirngs(*strings)
}

fun realyPrintStirngs(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {
//    hello()
//    val value = returnAFour()
//    takingString("Some Value")
    sum(1,2,3)
    sum(1,2)

    printDetails("Sina Darvishi",phone = "555 87 345")

    printStrings("1")
    printStrings("1","2")
    printStrings("1","2","3")
}