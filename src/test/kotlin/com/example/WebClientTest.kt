package com.example

import org.example.com.example.WebClient
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.AutoClose
import org.junit.jupiter.api.Test

class WebClientTest {
    @AutoClose
    val webClient = WebClient()

    @Test
    fun testGet() {
        val response = webClient.get("https://example.com")
        assertEquals("OK", response)
    }
}
