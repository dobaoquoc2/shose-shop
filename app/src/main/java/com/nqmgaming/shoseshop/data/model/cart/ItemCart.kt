package com.nqmgaming.shoseshop.data.model.cart

import com.nqmgaming.shoseshop.data.model.product.Product

data class ItemCart(
    val product: String,
    var quantity: Int,
    val size: String,
    val price: Double,
)
