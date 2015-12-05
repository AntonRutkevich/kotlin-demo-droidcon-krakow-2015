package com.rutkevich.droidcon.cleancode

import android.content.Context
import android.location.LocationManager
import android.support.annotation.IdRes
import android.view.View
import android.widget.Toast

fun main(vararg args: String) {

     "Hello World".capitalize()

    val list = listOf("Google", "Samsung", "Apple", "Audi")

    list.filter {
        it.endsWith("e")
    }
    .map {
        it.decapitalize()
    }
    .forEach {
        println(it)
    }
}

fun View.show() {
    if (visibility != View.VISIBLE) {
        visibility = View.VISIBLE
    }
}

@Suppress("UNCHECKED_CAST")
fun <T : View> View.find(@IdRes id: Int): T
        = findViewById(id) as T

fun Context.shortToast(message: String)
        = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

fun Context.getLocationManager(): LocationManager {
    return getSystemService(Context.LOCATION_SERVICE) as LocationManager
}
