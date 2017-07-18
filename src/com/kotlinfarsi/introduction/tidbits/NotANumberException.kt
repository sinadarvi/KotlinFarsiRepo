package com.kotlinfarsi.introduction.tidbits

import java.io.BufferedReader
import java.io.FileReader

/**
 * Created by Sina on 7/18/2017
 */

class NotANumberException : Throwable() {

}

fun checkIsNumber(obj: Any){
    when(obj){
        !is Int, Long, Float, Double -> throw NotANumberException()
    }
}

fun main(args: Array<String>) {

//    try {
//        checkIsNumber("A")
//    } catch(e: NotANumberException) {
//        println("It was not a number")
//    }

    val buffer = BufferedReader(FileReader("input.txt"))
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars,0,40)
    }catch (e: IndexOutOfBoundsException){
        "Exception handled"
    }finally {
        println("Closing")
        buffer.close()
    }

    println(result)
}