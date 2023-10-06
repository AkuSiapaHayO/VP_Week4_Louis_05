package com.example.week4_louis_05.model

import android.annotation.SuppressLint
import android.content.Context
import androidx.annotation.DrawableRes

data class Explore (
    val nameImage: String
) {
    @SuppressLint("DiscouragedApi")
    fun getImageIDbyString(context: Context): Int{
        return context.resources.getIdentifier(nameImage, "drawable", context.packageName)
    }
}