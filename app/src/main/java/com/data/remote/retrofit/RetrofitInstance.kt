package com.data.remote.retrofit

import com.data.remote.api.ProductApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api: ProductApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://www.looqua.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ProductApiService::class.java)
    }
}