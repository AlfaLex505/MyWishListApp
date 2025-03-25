package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Steam Deck OLED",
            description = "A video-games console with the Steam Library.") ,
        Wish(title = "A trip to Italy",
        description = "A trip to the city with the most expensive cars in the world."),
        Wish(title = "100k Job",
            description = "A job that pays me 100k a month.")
    )
}