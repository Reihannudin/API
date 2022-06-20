package com.ktor.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import kotlinx.html.*
import kotlinx.serialization.Serializable

fun Application.configureRouting() {
    install(Routing) {
        static(remotePath = "assets") {
            resources(resourcePackage = "assets")
        }
        get("/") {
            call.respondText("Hello this is embedded server!")
        }
        route(path = "/product", method = HttpMethod.Get){
            handle {
                call.respondText("This is product page")
            }
        }
        get("/users/{userName}"){
            val userName = call.parameters["userName"]
            if(userName == "admin" || userName == "Admin" || userName == "ADMIN"){
                call.respond(message = "Hello Admin!", status = HttpStatusCode.OK)
            } else {
                call.respondText("Hello $userName")
            }
        }
        get ("/biodata"){
            val name = call.request.queryParameters["name"]
            val age = call.request.queryParameters["age"]
            val city = call.request.queryParameters["city"]
            call.respondText("Helo my name is ${name} , I'm ${age} years old, and I'm from ${city}")
        }
        get ("/person"){
            try {
                val person = Person("Andrian Raihannudin", 16, "Tangerang")
                call.respond(message = person, status = HttpStatusCode.OK)
            } catch (e: Exception){
                call.respond(message = "${e.message}", status = HttpStatusCode.BadRequest)
            }
        }
        get ("/redirect"){
            call.respondRedirect(url = "/endpoint", permanent = false)
        }
        get("/endpoint"){
            call.respondText("This is endpoint")
        }

        get("/welcome"){
            val name = call.request.queryParameters["name"]
            call.respondHtml {
                head {
                    title { "Welcome" }
                }
                body {
                    if (name.isNullOrEmpty()){
                        h2 { +"Welcome" }
                    }
                    else {
                        h2 { +"Welcome, ${name}" }
                    }
                    p { +"This is a paragraph" }
                    img { src ="assets/meta_logo.jpg" }
                }
            }
        }
    }
}

fun Application.configureRouting2(){
    routing {
        get("/route2") {
            call.respondText("Hello you in route 2")
        }
    }
}

@Serializable
data class Person(
    val name : String,
    val age : Int,
    val city : String
)

