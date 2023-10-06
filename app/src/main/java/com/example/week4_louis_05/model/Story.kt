package com.example.week4_louis_05.model

import android.annotation.SuppressLint
import android.content.Context
import androidx.annotation.DrawableRes

class Story (
    val name: String,
    val nameProfilePicture: String,
    val isFollowing: Boolean,
    val isFollowers: Boolean
){
    @SuppressLint("DiscouragedApi")
    fun getImageIDbyString(context: Context): Int{
        return context.resources.getIdentifier(nameProfilePicture, "drawable", context.packageName)
    }
}