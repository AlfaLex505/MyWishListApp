package com.example.mywishlistapp

// Create a sealed so no other class can inherit from this one
sealed class Screen (val route: String){
    object HomeScreen: Screen("home_screen")
    object AddScreen: Screen("add_screen")
}