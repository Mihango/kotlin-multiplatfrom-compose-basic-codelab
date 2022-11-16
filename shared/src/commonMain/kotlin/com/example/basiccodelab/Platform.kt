package com.example.basiccodelab

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform