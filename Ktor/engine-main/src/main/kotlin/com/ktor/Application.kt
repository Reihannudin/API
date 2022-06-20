package com.ktor

import io.ktor.server.application.*
import com.ktor.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureMonitoring()
    configureContentNegotiation()
    configureRouting()
}

//another module
//@Suppress("unused")
//fun Application.module2(){
//    configureRoutting2()
//}
