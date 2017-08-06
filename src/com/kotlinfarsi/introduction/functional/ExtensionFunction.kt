package com.kotlinfarsi.introduction.functional

/**
 * Created by Sina on 8/6/2017
 */
fun String.hello() {
    println("It's me")
}

fun String.toTilteCase(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

fun main(args: Array<String>) {
    println("this is a sample string to title case".toTilteCase())
}