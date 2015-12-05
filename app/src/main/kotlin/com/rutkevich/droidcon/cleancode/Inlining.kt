package com.rutkevich.droidcon.cleancode

import android.util.Log
import com.rutkevich.droidcon.BuildConfig


fun main(vararg args: String) {

    logD {
        val exception = RuntimeException()
        "Current stacktrace is ${Log.getStackTraceString(exception)}"
    }

//    is translated to

    if (BuildConfig.DEBUG) {
        val exception = RuntimeException()
        Log.d("TAG", "Current stacktrace is ${Log.getStackTraceString(exception)}")
    }
}

inline fun logD (message: () -> String) {
    if (BuildConfig.DEBUG) {
        Log.d("TAG", message())
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
