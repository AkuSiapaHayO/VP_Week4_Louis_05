package com.example.week4_louis_05.ui.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.week4_louis_05.R
import com.example.week4_louis_05.data.DataSource
import com.example.week4_louis_05.model.Explore

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ExplorePreview() {
    ExploreView(DataSource().loadExplore())
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ExploreView(imageList: List<Explore>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .padding(bottom = 0.dp)
            .background(Color.Black)
                    .height(700.dp)
    ) {
        item(
            span = { GridItemSpan(3) }
        ) {
            SearchBar()
        }

        items(imageList) {
            ExploreImage(it)
        }
    }
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(horizontal = 16.dp, vertical = 18.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "Home Icon"
            )
            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Search Icon"
            )
            Image(
                painter = painterResource(
                    id = R.drawable.post
                ),
                contentDescription = "Post Icon"
            )
            Image(
                painter = painterResource(
                    id = R.drawable.reels
                ),
                contentDescription = "Reels Icon"
            )
            Image(
                painter = painterResource(
                    id = R.drawable.account
                ),
                contentDescription = "Account Icon"
            )
        }
    }
}

@Composable
fun SearchBar() {
    Row(
        modifier = Modifier
            .padding(12.dp)
            .border(2.dp, Color.White, RoundedCornerShape(20.dp))
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.baseline_search_24),
            contentDescription = "Search",
            modifier = Modifier
                .padding(vertical = 8.dp, horizontal = 12.dp)
        )
        Text(
            text = "Search",
            color = Color.White,
            modifier = Modifier
                .padding(vertical = 8.dp)
        )
    }
}

@Composable
fun ExploreImage(image: Explore) {
    Image(
        painter = painterResource(id = image.nameImage),
        contentDescription = "Explore Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .aspectRatio(1f)
    )
}