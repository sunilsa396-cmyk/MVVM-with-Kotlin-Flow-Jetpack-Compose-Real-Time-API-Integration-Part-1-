package com.data.model

data class Product(
    val id: String,
    val product_title: String,
    val product_price: String,
    val product_image: String
)



//🔹 Summary
//Product is a data holder class
//Stores product details (id, title, price, image)
//Automatically gives useful methods (copy, equals, etc.)
//Used heavily in Android (API, UI, DB)