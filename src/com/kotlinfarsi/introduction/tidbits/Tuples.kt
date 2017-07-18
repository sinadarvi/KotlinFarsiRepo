package com.kotlinfarsi.introduction.tidbits

import com.kotlinfarsi.introduction.classes.CustomerKotlin

/**
 * Created by Sina on 7/17/2017
 */
fun capitalAndPopulation(country: String): Pair<String,Long>{
    return Pair("Madrid",2000000)
}
fun countryInformation(country: String): Triple<String,String,Long>{
    return Triple("Madrid", "Europe",2300000)
}
fun main(args: Array<String>) {
    val countryInfo = countryInformation("Spain")
    println(countryInfo.first)
    println(countryInfo.second)
    println(countryInfo.third)

    val result = capitalAndPopulation("Spain")
    println(result.first)
    println(result.second)

    val (capital,population) = capitalAndPopulation("Spain")

    println(capital)
    println(population)

    val (id,name,email) = CustomerKotlin(1,"Sina","Sinadarvi@gmail.com")
}