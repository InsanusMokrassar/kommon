package com.lightningkite.kommon.native

expect fun <T: Any> T.freeze(): T
expect fun Any.ensureNeverFrozen()
expect val Any.isFrozen: Boolean