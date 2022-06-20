package com.ktor

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.ktor.plugins.*

fun main() {
    embeddedServer(Netty, port = 8082, host = "0.0.0.0", watchPaths = listOf("classes", "resources")) {
        configureMonitoring()
        configureContentNegotiation()
        configureRouting()
    }.start(wait = true)
}
