package com.lightningkite.kommon.collection


inline fun <T> Iterable<T>.forEachBetween(
        forItem: (T) -> Unit,
        between: () -> Unit
) {
    var hasDoneFirst = false
    forEach {
        if (hasDoneFirst) {
            between()
        } else {
            hasDoneFirst = true
        }
        forItem(it)
    }
}