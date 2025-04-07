package com.example.mywishlistapp

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mywishlistapp.data.WishDataBase
import com.example.mywishlistapp.data.Wishrepository

object Graph {
    lateinit var database: WishDataBase

    val wishrepository by lazy{
        Wishrepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context, WishDataBase::class.java, "wishlist.db").build()
    }

}