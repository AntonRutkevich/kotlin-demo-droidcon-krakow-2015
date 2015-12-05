package com.rutkevich.droidcon.cleancode

import rx.Observable

interface Token {
    data class Valid(val value: String): Token
    object Invalid: Token
}

fun main(vararg args: String) {

    val tokens: List<Token> = listOf(
            Token.Invalid,
            Token.Valid("123"),
            Token.Invalid,
            Token.Valid("456")
    )

    Observable.from(tokens)
            .filter { it is Token.Valid }
            .map { it as Token.Valid }
            .map { it.value }
            .subscribe {
                println("Token value: $it")
            }
}




//inline fun <T, reified S> Observable<T>.filterType(): Observable<S> {
//    return filter { it is S }.map { it as S }
//}
