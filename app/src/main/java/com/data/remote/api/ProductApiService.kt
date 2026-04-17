package com.data.remote.api


import com.data.model.ProductResponse
import retrofit2.http.GET

interface ProductApiService {

    @GET("app/products.php")
    suspend fun getProducts(): ProductResponse
}


//👉 It converts:
//
//API endpoint → function
//JSON response → Kotlin object

//🔹 How it works step-by-step
//1. You define API like this
//@GET("app/products.php")
//suspend fun getProducts(): ProductResponse
//
//👉 Meaning:
//
//Call GET request
//URL → baseUrl + "app/products.php"
//Response → mapped to ProductResponse


//2. Retrofit generates implementation
//
//You only write interface — Retrofit internally creates the actual code.
//
//👉 You don’t write:
//
//HttpURLConnection ❌
//OkHttp manually ❌


//🔹 What is @GET?
//@GET("app/products.php")
//
//👉 This is an annotation telling Retrofit:
//
//Use HTTP GET method
//Hit this endpoint

//🔹 What is ProductResponse?
//
//This is your data model that matches API JSON.
//
//Example:
//
//{
//    "products": [
//    {
//        "id": "1",
//        "product_title": "Phone"
//    }
//    ]
//}
//
//👉 Converted into:
//
//data class ProductResponse(
//    val products: List<Product>
//)

//✅ Summary
//Interface defines API endpoints
//@GET → HTTP method
//suspend → async call
//Retrofit auto-generates implementation
//Converts JSON → Kotlin objects


//🔹 What is suspend?
//suspend fun getProducts()
//
//👉 This is for Kotlin Coroutines
//
//Why?
//Network calls take time ⏳
//You should NOT block main thread (UI freeze ❌)
//
//👉 suspend allows:
//
//Run in background thread
//Smooth UI