package com.kotlinfarsi.introduction.basics

/**
 * Created by Sina on 7/14/2017.
 */
fun main(args: Array<String>) {
    var streetNumber: Int = 10
    var streetName = "High Street"

    val zip = "E11 P1"
    streetName = "Pudding Lane"
//    zip = "SW1 ES2"   //wrong
    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01

    val myInt = 10
    val myLongAgain: Long = myInt.toLong()

    //String

    val myChar = 'A'
    val myString = "My String"

    val escapeCharacters = "A new Line \n"

    val rawString = "Hello " +
            "This is second line" +
            "a third line"

    val multipleLine = """
    this is a string
    and this is another line
    """

    val years = 10
    val message = "A decade is " + years + " years"
    val anotherMessage = "A decade is $years years"

    val name= "Mary"
    val anotherOne = "length of name is ${name.length}"

}