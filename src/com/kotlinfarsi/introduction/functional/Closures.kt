package com.kotlinfarsi.introduction.functional

/**
 * Created by Sina on 7/31/2017.
 */

fun outsideFunction() {
    for (number in 1..30) {
        unaryOperation(20, { x ->
            println(number)
            x * number
        })
    }
}

fun main(args: Array<String>) {
    outsideFunction()
}