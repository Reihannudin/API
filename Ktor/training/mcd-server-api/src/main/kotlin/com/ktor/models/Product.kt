package com.ktor.models

import kotlinx.serialization.Serializable

@Serializable
data class Product (
    val id : Int,
    val name : String,
    val price : Double,
    val image : String,
    val description : String,
    val category : String,
    val favorite : Boolean,
    val calories : String,
    val protein : String,
    val carbs : String,
    val fat : String,
    val ingredients : List<String>
    )