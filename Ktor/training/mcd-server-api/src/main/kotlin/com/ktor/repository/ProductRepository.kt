package com.ktor.repository

import com.ktor.models.ApiResponse
import com.ktor.models.Product

interface ProductRepository {

    val product : Map<Int,List<Product>>

    val page1 : List<Product>
    val page2 : List<Product>
    val page3 : List<Product>
    val page4 : List<Product>
    val page5 : List<Product>
    val page6 : List<Product>

    suspend fun getAllProducts(page : Int = 1) : ApiResponse
    suspend fun getProductByCategory(category: String?) : ApiResponse
    suspend fun searchProduct(query: String?) : ApiResponse


}