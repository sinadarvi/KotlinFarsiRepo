package com.kotlinfarsi.introduction.classes

/**
 * Created by Sina on 7/16/2017
 */
enum class Priority(val value : Int ) {
    MINOR(-1){
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun toString(): String {
            return "Minor priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    MAJOR(1) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    abstract fun text(): String
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL

//    println(priority)
//    println(priority.value)
//
//    println(Priority.CRITICAL.name)

    for(priorityInList in Priority.values())
        println(priorityInList)

    val p = Priority.valueOf("MAJOR")
}