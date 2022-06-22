package com.ktor.routes

import com.ktor.models.ApiResponse
import com.ktor.repository.ProductRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.searchCategory(){

    val productRepository : ProductRepository by inject()

    get("/menu/category"){
        try {
            val categoryTitle = call.request.queryParameters["title"]

            val apiResponse = productRepository.getProductByCategory(category = categoryTitle)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        }
        catch (e : java.lang.IllegalArgumentException){
        call.respond(
            message = ApiResponse(success = false, message = "Category not found"),
            status = HttpStatusCode.NotFound
        )
    }
    }
}