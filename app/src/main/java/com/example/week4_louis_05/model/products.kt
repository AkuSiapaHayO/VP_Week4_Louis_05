package com.example.week4_louis_05.model

import androidx.annotation.DrawableRes

class products(
    @DrawableRes val image_path: Int,
    val product_name: String,
    val price: Int,
    val location: String,
    val sold: Int
) {

}