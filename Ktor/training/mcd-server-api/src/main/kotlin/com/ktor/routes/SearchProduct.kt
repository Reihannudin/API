package com.ktor.routes

import com.ktor.models.ApiResponse
import com.ktor.repository.ProductRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.searchProduct(){

    val productRepository : ProductRepository by inject()

    get("/menu/search"){
        try {
            val name = call.request.queryParameters["name"]

            val apiResponse = productRepository.searchProduct(query = name)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )

        }
        catch (e : java.lang.IllegalArgumentException) {
            call.respond(
                message = ApiResponse(success = false, message = "Heroes not found"),
                status = HttpStatusCode.NotFound
            )
        }
    }
}