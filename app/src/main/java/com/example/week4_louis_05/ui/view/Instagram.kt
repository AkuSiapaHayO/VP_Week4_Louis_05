package com.example.week4_louis_05.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week4_louis_05.R
import com.example.week4_louis_05.data.DataSource
import com.example.week4_louis_05.model.Feed
import com.example.week4_louis_05.model.Story
import com.example.week4_louis_05.model.Suggestion

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InstagramPreview() {
    InstagramView(DataSource().loadFeed())
}

@Composable
fun InstagramView(listFeed: List<Feed>) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0E0E0E))
    ) {
        item {
            Header()
        }
        item {
            LazyRowStory(DataSource().loadStory())
        }
        items(listFeed) {
            Feed(it)
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
            .padding(start = 6.dp)
    ) {
        items(storyList) {
            Story(it)
        }
    }
}

@Composable
fun LazyRowSuggestion(suggestionList: List<Suggestion>) {
    LazyRow() {
        items(suggestionList) {
            Suggestion(it)
        }
    }
}

@Composable
fun Story(story: Story) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
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
        Text(
            text = story.name,
            color = Color(0xFFEFEFEF),
            modifier = Modifier
                .padding(top = 4.dp, bottom = 8.dp),
            fontSize = 12.sp
        )
    }
}

@Composable
fun Suggestion(suggestion: Suggestion) {
    Card {
        Column {
            Box {
                Image(
                    painter = painterResource(id = suggestion.nameProfilePicture),
                    contentDescription = "Profile Picture"
                )
            }
        }
    }
}

@Composable
fun Feed(feed: Feed) {

    val caption = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontWeight = FontWeight.Bold
            )
        ) {
            append(feed.name)
        }
        append(" ")
        append(feed.caption)
    }

    Column {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(
                        id = feed.nameProfilePicture
                    ),
                    contentDescription = "Profile Picture",
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = feed.name,
                    color = Color(0xFFEFEFEF),
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(start = 16.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.baseline_more_vert_24),
                contentDescription = "More Vertical",
                modifier = Modifier
                    .size(20.dp)
            )
        }
        Image(
            painter = painterResource(id = feed.namaImage),
            contentDescription = "Content",
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp, horizontal = 18.dp),
            Arrangement.SpaceBetween,
            Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.like),
                    contentDescription = "Like"
                )
                Spacer(modifier = Modifier.width(28.dp))
                Image(
                    painter = painterResource(id = R.drawable.comment),
                    contentDescription = "Comment"
                )
                Spacer(modifier = Modifier.width(28.dp))
                Image(
                    painter = painterResource(id = R.drawable.messanger),
                    contentDescription = "Messenger"
                )
            }
            Image(
                painter = painterResource(id = R.drawable.save),
                contentDescription = "Messenger"
            )
        }
        Text(
            text = "${feed.likes} likes",
            color = Color(0xFFEFEFEF),
            fontSize = 13.sp,
            modifier = Modifier
                .padding(horizontal = 12.dp)
        )
        Text(
            text = caption,
            color = Color(0xFFEFEFEF),
            fontSize = 13.sp,
            modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 4.dp),
            lineHeight = 18.sp
        )
        Text(
            text = feed.date,
            color = Color(0xFF626166),
            fontSize = 11.sp,
            modifier = Modifier
                .padding(horizontal = 12.dp)
        )

    }
}

