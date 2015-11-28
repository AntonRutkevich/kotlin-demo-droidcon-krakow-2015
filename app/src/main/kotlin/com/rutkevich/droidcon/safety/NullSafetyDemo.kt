package com.rutkevich.droidcon.safety

import java.util.*

fun generateCity(): String? {
    val list = listOf("Krakow", "Warsaw", "Gdansk", null, null)
    return list.elementAt(Random().nextInt(list.size))
}


fun main(vararg args: String) {
    (1..10).forEach {
        val city = generateCity()
//        val endsWithW = city.endsWith("w")

//        println("$city ends with w: $endsWithW")
    }
}
