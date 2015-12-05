package com.rutkevich.droidcon.safety

import java.util.Random

fun generateCity(): String? {
    val list = listOf("Krakow", "Warsaw", "Gdansk", null, null)
    return list.elementAt(Random().nextInt(list.size))
}


fun main(vararg args: String) {
    (1..10).forEach {
        val city : String? = generateCity()

        // ignore nulls
        if (city != null) {
            val endsWithW: Boolean = city.endsWith("w")

            println("$city ends with w: $endsWithW")
        }

        // or give a default value to them

        // Elvis!
        val endsWithW = city?.endsWith("W") ?: false
        println("$city ends with w: $endsWithW")

        // or behave like Java: throw an exception
        val endsWithW2 = city!!.endsWith("W")
        println("$city ends with w: $endsWithW")
    }
}
