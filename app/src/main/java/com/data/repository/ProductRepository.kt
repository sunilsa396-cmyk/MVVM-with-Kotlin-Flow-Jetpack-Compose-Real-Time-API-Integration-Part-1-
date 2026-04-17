package com.data.repository

import com.data.model.Product
import com.data.remote.retrofit.RetrofitInstance
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ProductRepository {
    fun getProducts(): Flow<List<Product>> = flow {
        val response = RetrofitInstance.api.getProducts()
        emit(response.products)
    }
}