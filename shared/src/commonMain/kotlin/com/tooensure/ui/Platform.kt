package com.tooensure.ui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform