package com.kotlinfarsi.introduction.nulls

/**
 * Created by Sina on 7/17/2017
 */

fun main(args: Array<String>) {
    val message: String = "A String"

    val nullMessage :String? = null
    val inferredNullMessage = null

    println(nullMessage!!.length)
}