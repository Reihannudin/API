package com.ktor.routes

import com.ktor.repository.ProductRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.root(){

//    val productRepository by inject<ProductRepository>()
    get("/"){
        call.respond(message="Hello World from router", status= HttpStatusCode.OK)
    }
}