package com.rutkevich.droidcon.safety.immutability


fun main(vararg args: String) {
    val cities: MutableList<String> = arrayListOf("Krakow", "Warsaw")
    cities.add("Gdansk")

    val immutableCities: List<String> = listOf("Krakow", "Warsaw")
    // No add() method
//    immutableCities.add("Gdansk")
}
