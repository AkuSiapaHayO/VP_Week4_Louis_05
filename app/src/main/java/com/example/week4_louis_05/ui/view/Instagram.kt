package com.example.week4_louis_05.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week4_louis_05.R
import com.example.week4_louis_05.data.DataSource
import com.example.week4_louis_05.model.Story

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InstagramPreview() {
    InstagramView()
}

@Composable
fun InstagramView() {
    LazyColumn(
        modifier = Modifier
            .background(Color(0xFF0E0E0E))
    ) {
        item {
            Header()
        }
        item {
            LazyRowStory(DataSource().loadStory())
        }
    }
}

@Composable
fun Header() {
    Row(
        Modifier
            .padding(horizontal = 18.dp, vertical = 12.dp)
            .fillMaxWidth(),
        Arrangement.SpaceBetween,
        Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_dropdown),
            contentDescription = "Logo Instagram Text"
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.like),
                contentDescription = "Logo Like"
            )
            Spacer(modifier = Modifier.width(24.dp))
            Image(
                painter = painterResource(id = R.drawable.dm),
                contentDescription = "Logo DM"
            )
        }
    }
}

@Composable
fun LazyRowStory(storyList: List<Story>) {
    LazyRow(
        modifier = Modifier
            .padding(start = 6.dp, top = 6.dp)
    ) {
        items(storyList) {
            Story(it)
        }
    }
}

@Composable
fun Story(story: Story) {
    Box {
        Image(
            painter = painterResource(id = story.nameProfilePicture),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 7.dp)
                .size(68.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(id = R.drawable.story),
            contentDescription = "Border Story",
            modifier = Modifier
                .padding(horizontal = 9.dp)
                .size(82.dp)
        )
    }
}

