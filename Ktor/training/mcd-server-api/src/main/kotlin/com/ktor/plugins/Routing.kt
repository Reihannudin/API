package com.ktor.plugins

import com.ktor.routes.getAllProduct
import com.ktor.routes.root
import com.ktor.routes.searchCategory
import com.ktor.routes.searchProduct
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.features.*
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.response.*

fun Application.configureRouting() {

    routing {
        root()
        getAllProduct()
        searchProduct()
        searchCategory()

        static("/product/images") {
            resources("images")
        }

        install(StatusPages) {
            exception<AuthenticationException> { cause ->
                call.respond(HttpStatusCode.Unauthorized)
            }
            exception<AuthorizationException> { cause ->
                call.respond(HttpStatusCode.Forbidden)
            }
        
        }
    }
}
class AuthenticationException : RuntimeException()
class AuthorizationException : RuntimeException()
