package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name="wish-desc")
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