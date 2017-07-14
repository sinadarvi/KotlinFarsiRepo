package com.kotlinfarsi.introduction.basics

/**
 * Created by Sina on 7/14/2017.
 */
fun main(args: Array<String>) {

    for(a in 1..100){
        println(a)
    }

    val numbers = 1..100

    for(a in numbers){
        println(a)
    }

    for(a in 100 downTo 1){
        println(a)
    }

    for(a in 100..1){
        println(a)
    }

    for(b in 100..1 step 5){
        println(b)
    }

    val capitals = listOf("London","Paris","Rome","Madrid")
    for(capital in capitals){
        println(capital)
    }

    var i = 100
    while (i>0){
        i--
    }
    var x = 10
    do {
        x--
    }while (x>0)

    loop@ for (i in 1..100){
        for(j in 1..100){
            if(i%j == 0)
                continue
        }
    }
}