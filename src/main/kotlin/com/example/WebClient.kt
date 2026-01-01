package org.example.com.example

import java.lang.AutoCloseable

class WebClient : AutoCloseable {
    fun get(url: String): String {
        return "OK"
    }

    override fun close() {
        println("WebClient has been closed.")
    }
}
