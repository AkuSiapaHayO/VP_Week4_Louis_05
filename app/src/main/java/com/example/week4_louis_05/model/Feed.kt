package com.example.week4_louis_05.model

import androidx.annotation.DrawableRes

data class Feed (
    val name: String,
    @DrawableRes val nameProfilePicture: Int,
    @DrawableRes val namaImage: Int,
    val isLiked: Boolean,
    val isSaved: Boolean,
    val likes: Int,
    val caption: String,
    val date: String
) {

}