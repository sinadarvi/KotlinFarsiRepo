package com.kotlinfarsi.introduction.functional

/**
 * Created by Sina on 7/30/2017.
 */
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun operation(x: Int, op: (Int) -> Unit): Unit {

}

fun route(path: String, vararg actions: (String, String) -> String) {

}

fun unaryOperation(x: Int, op: (Int) -> Int) {
    op(x)
}

fun sum(x: Int, y: Int) = x + y

class Database {
    fun commit() {
    }
}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

fun main(args: Array<String>) {

    println(operation(2, 3, ::sum))
    val LambdaSum = { x: Int, y: Int -> x + y }
    println(operation(2, 3, LambdaSum))

    unaryOperation(2, { x -> x * x })
    unaryOperation(2, { it * it })
    unaryOperation(2) {
        it * it
    }


    val db = Database()
    transaction(db) {
        //interact with database
    }

    unaryOperation(2, fun(x: Int): Int { return x * x })
}