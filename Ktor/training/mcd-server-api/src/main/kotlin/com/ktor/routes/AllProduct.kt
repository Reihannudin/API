package com.ktor.routes

import com.ktor.models.ApiResponse
import com.ktor.repository.ProductRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllProduct(){

    val productRepository by inject<ProductRepository>()

    get("/menu"){
        try{
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..6)

            val apiResponse = productRepository.getAllProducts(page = page)
            call.respond(message = apiResponse,status = HttpStatusCode.OK)

            call.respond(message = page)
        } catch (e : java.lang.NumberFormatException){
            call.run {
                respond(
                        message = ApiResponse(success = false, message = "Only numbers allows"),
                        status = HttpStatusCode.BadRequest
                )
            }
        }
        catch (e : java.lang.IllegalArgumentException){
            call.respond(
                message = ApiResponse(success = false, message = "Product not found"),
                status = HttpStatusCode.NotFound
            )
        }
    }
}