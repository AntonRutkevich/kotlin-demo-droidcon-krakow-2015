package com.rutkevich.droidcon.cleancode

import android.util.Log
import com.rutkevich.droidcon.BuildConfig


inline fun logD (message: () -> String) {
    if (BuildConfig.DEBUG) {
        Log.d("TAG", message())
    }
}


fun main(vararg args: String) {

    logD {
        val exception = RuntimeException()
        "Current stacktrace is ${Log.getStackTraceString(exception)}"
    }

}







inline fun <T> debugOnly(lambda: () -> T): T? {
    return if (BuildConfig.DEBUG) {
        lambda()
    } else {
        null
    }
}







inline fun <T> measure(message: String, lambda: () -> T): T {
    val startTime = System.currentTimeMillis()
    val result = lambda()
    val endTime = System.currentTimeMillis() - startTime
    Log.d ("Measured", "$message $endTime ms")
    return result
}


