package com.rutkevich.droidcon.cleancode

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import rx.Observable


class RxActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intObservable = Observable.create<Int> { subscriber ->

            (-15..15).forEach {
                subscriber.onNext(it)
            }
            subscriber.onCompleted()

        }

        intObservable
                // non-capturing lambdas!
                .map { it * 3 }
                .filterPositive()
                .map { it * 4 }
                .subscribe {
                    println("Managed to get here: $it")
                }
    }

}


fun Observable<Int>.filterPositive() = filter { it > 0 }
