package com.kotlinfarsi.introduction.classes

/**
 * Created by Sina on 7/16/2017
 */
object Global{
    val PI = 3.14
}

fun main(args: Array<String>) {
    val localObject = object {
        val PI = 3.14159
    }

    println(localObject.PI)
    println(Global.PI)
}