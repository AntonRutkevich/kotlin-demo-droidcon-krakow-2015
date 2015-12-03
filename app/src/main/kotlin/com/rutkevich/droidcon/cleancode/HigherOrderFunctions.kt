package com.rutkevich.droidcon.cleancode


fun main(vararg args: String) {

    val doubled : (Int) -> Int = { x -> x * 2 }
    val doubled2: (Int) -> Int = { it * 2 }
    val doubled3 = { x: Int -> x * 2 }


    val lock = Any()

    synchronized(lock) {

        println("Do synchronized stuff")

    }

}
