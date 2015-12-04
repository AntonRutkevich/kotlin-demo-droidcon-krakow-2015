package com.rutkevich.droidcon.cleancode

import rx.Observable


fun main(vararg args: String) {

    val intObservable = Observable.create<Int> { subscriber ->

        (1..15).forEach {
            subscriber.onNext(it)
        }
        subscriber.onCompleted()

    }

    intObservable
            .map { it * 3 }
            .filter { it % 4 == 0 }
            .map { it * 3 }
            .subscribe {
                println("Managed to get here: $it")
            }
}
