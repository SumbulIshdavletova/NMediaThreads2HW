package ru.netology.nmedia.dto

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: String,
    val likedByMe: Boolean,
//    val deleteLikeByMe: Boolean,
    val likes: Int = 0,
)

