package com.ktor.di

import com.ktor.repository.ProductRepository
import com.ktor.repository.ProductRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<ProductRepository> {
        ProductRepositoryImpl()
    }
}