package com.example.week4_louis_05.model

import android.annotation.SuppressLint
import android.content.Context
import androidx.annotation.DrawableRes

data class Feed (
    val name: String,
    val nameProfilePicture: String,
    val namaImage: String,
    var isLiked: Boolean,
    val isSaved: Boolean,
    val likes: Int,
    val caption: String,
    val date: String
) {
    @SuppressLint("DiscouragedApi")
    fun getImageIDbyString(context: Context): Int{
        return context.resources.getIdentifier(namaImage, "drawable", context.packageName)
    }
}