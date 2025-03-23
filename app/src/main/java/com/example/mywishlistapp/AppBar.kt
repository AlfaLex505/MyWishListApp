package com.example.mywishlistapp

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun AppBarView(
    title: String,
    onBackNavClicked: () -> Unit = {}
){

    val navigationIcon : (@Composable () -> Unit)? = {
        IconButton(onClick = { onBackNavClicked() } ) {
            Icon(
//                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                imageVector = Icons.Filled.ArrowBack,
                tint = Color.White,
                contentDescription = null)

        }
    }

    TopAppBar(
        title = {
            Text(text = title,
                color = colorResource(id = R.color.white),
                modifier = Modifier
                    .padding(start = 4.dp)
                    .heightIn(max = 24.dp))
                // modifier = Modifier.padding(start = 4.dp).heightIn(max = 24.dp))
        },
        elevation = 3.dp,
        backgroundColor = colorResource(id = R.color.app_bar_color),
        navigationIcon = navigationIcon
    )
}