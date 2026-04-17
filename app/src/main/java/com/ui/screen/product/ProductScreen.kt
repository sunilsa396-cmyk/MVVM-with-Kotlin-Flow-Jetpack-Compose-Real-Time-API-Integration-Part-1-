package com.ui.screen.product

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import com.ui.components.ProductItem
import com.ui.viewmodel.ProductViewModel

@Composable
fun ProductScreen(viewModel: ProductViewModel = ProductViewModel()) {

    val products by viewModel.products.collectAsState()

    LazyColumn {
        items(products) { product ->
            ProductItem(product)
        }
    }
}