package com.example.edusungshinourmoving.chatdetail

data class ChatItem(
    val senderId: String,
    val message: String,
) {
    constructor(): this("", "")
}
