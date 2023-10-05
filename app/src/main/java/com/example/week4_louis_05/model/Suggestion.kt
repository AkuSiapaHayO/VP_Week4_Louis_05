package com.example.week4_louis_05.model

import androidx.annotation.DrawableRes

class Suggestion(
    val name: String,
    @DrawableRes val nameProfilePicture: Int,
    val isFollowing: Boolean,
    val isFollowers: Boolean
) {

}