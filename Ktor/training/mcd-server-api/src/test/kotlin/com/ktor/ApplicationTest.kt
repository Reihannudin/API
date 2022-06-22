package com.ktor

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.features.*
import io.ktor.serialization.*
import org.slf4j.event.*
import io.ktor.request.*
import io.ktor.application.*
import io.ktor.response.*
import kotlin.test.*
import io.ktor.server.testing.*
import com.ktor.plugins.*

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ configureRouting() }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("Hello World!", response.content)
            }
        }
    }
}