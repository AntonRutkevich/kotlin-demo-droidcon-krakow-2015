package com.rutkevich.droidcon.safety.immutability

data class Person(val name: String, val age: Int = 20)

fun main(vararg args: String) {
    val john = Person(name = "John")

    // Shallow copy! Don't use var's in th data classes
    val john5YearsLater = john.copy(age = john.age + 5)
}
