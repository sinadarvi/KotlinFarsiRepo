package com.kotlinfarsi.introduction.desginpatterns.singleton.kotlin

class KPrintName(val name: String){
    companion object Factory{
        fun printName() { println(KPrintName.)}
    }
}

fun main(args: Array<String>) {
    PrintName.print()
}