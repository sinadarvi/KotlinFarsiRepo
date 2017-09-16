package com.kotlinfarsi.introduction.desginpatterns.creational.singleton.kotlin

class KPrintName private constructor(var name: String) {
    companion object {
        private lateinit var instance: KPrintName
            private set

        fun init(name: String) {
            instance = KPrintName(name)
        }

        fun printName() {
            println("Name is : ${instance.name}")
        }
    }
}

object SimpleKPrintName {
    lateinit var name : String

    fun init(name: String){
        SimpleKPrintName.name = name
    }

    fun printName(){
        println("Name is : ${name}")
    }
}

fun main(args: Array<String>) {
    KPrintName.init("Sina")
    KPrintName.printName()

    SimpleKPrintName.init("Maryam")
    SimpleKPrintName.printName()
}