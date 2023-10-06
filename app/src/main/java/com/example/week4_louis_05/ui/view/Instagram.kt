package com.example.week4_louis_05.ui.view

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.time.Year
import java.util.Calendar
import java.util.Date
import java.util.Locale

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InstagramPreview() {
    InstagramView(DataSource().loadFeed())
}

@Composable
fun InstagramView(listFeed: List<Feed>) {

    val context = LocalContext.current

    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        modifier = Modifier
            .height(700.dp)
            .background(Color(0xFF0E0E0E))
    ) {
        item {
            Header()
        }
        item {
            LazyRowStory(DataSource().loadStory())
        }
        var count = 1
        for (feed in listFeed) {
            if (count == 2 || count % 6 == 0) {
                item {
                    LazyRowSuggestion(DataSource().loadSuggestion())
                }
                item {
                    Feed(feed = feed)
                }
            } else {
                item {
                    Feed(feed = feed)
                }
            }
            count++
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
                contentDescription = "Home Icon",
                modifier = Modifier
                    .clickable {
                        Toast.makeText(context, "Home", Toast.LENGTH_SHORT).show()
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Explore Icon",
                modifier = Modifier
                    .clickable {
                        Toast.makeText(context, "Explore", Toast.LENGTH_SHORT).show()
                    }
            )
            Image(
                painter = painterResource(
                    id = R.drawable.post
                ),
                contentDescription = "Post Icon",
                modifier = Modifier
                    .clickable {
                        Toast.makeText(context, "Post", Toast.LENGTH_SHORT).show()
                    }
            )
            Image(
                painter = painterResource(
                    id = R.drawable.reels
                ),
                contentDescription = "Reels Icon",
                modifier = Modifier
                    .clickable {
                        Toast.makeText(context, "Reels", Toast.LENGTH_SHORT).show()
                    }
            )
            Image(
                painter = painterResource(
                    id = R.drawable.account
                ),
                contentDescription = "Account Icon",
                modifier = Modifier
                    .clickable {
                        Toast.makeText(context, "Account", Toast.LENGTH_SHORT).show()
                    }
            )
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
    LazyRow(
        modifier = Modifier
            .padding(start = 10.dp)
    ) {
        items(suggestionList) {
            Suggestion(it)
        }
    }
}

@Composable
fun Story(story: Story) {

    val context = LocalContext.current

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
                    .clip(CircleShape)
                    .clickable {
                        Toast
                            .makeText(context, "${story.name} story", Toast.LENGTH_SHORT)
                            .show()
                    },
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
    Card (
        colors = CardDefaults.cardColors(
            containerColor = Color.White.copy(alpha = 0f)
        ),
        border = BorderStroke(1.dp, Color(0xFF969696)),
        modifier = Modifier
            .padding(horizontal = 6.dp)
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box {
                Image(
                    painter = painterResource(id = suggestion.nameProfilePicture),
                    contentDescription = "Profile Picture",
                    Modifier
                        .padding(start = 24.dp, end = 24.dp, top = 24.dp, bottom = 12.dp)
                        .size(120.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Image(
                    painter = painterResource(id = R.drawable.baseline_close_24),
                    contentDescription = "Close Icon",
                    modifier = Modifier
                        .padding(8.dp)
                        .size(20.dp)
                        .align(Alignment.TopEnd)
                )
            }
            Text(
                text = suggestion.name,
                color = Color(0xFFEFEFEF),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Follow",
                color = Color(0xFFEFEFEF),
                modifier = Modifier
                    .background(Color(0xFF0B98EB), RoundedCornerShape(16.dp))
                    .padding(vertical = 10.dp, horizontal = 32.dp),
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun formatDate(dateString: String): String {
    val inputDate = SimpleDateFormat("yyyy-MM-dd", Locale.US)
    val sameYearDate = SimpleDateFormat("MMMM dd", Locale.US)
    val diffYearDate = SimpleDateFormat("MMMM dd, yyyy", Locale.US)
    val date = inputDate.parse(dateString)
    var dateFormatted by remember { mutableStateOf("") }

    if (date != null) {
        val calendar = Calendar.getInstance()
        calendar.time = date
        dateFormatted = if (Calendar.getInstance().get(Calendar.YEAR) == calendar.get(Calendar.YEAR)) {
            sameYearDate.format(date)
        } else {
            diffYearDate.format(date)
        }
    } else {
        dateFormatted = dateString
    }
    return dateFormatted
}

@Composable
fun Feed(feed: Feed) {
    var likeFormatted: String
    val likeFormat = NumberFormat.getNumberInstance(Locale.US)
    val context = LocalContext.current
    var expand by rememberSaveable { mutableStateOf(false) }
    val caption = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontWeight = FontWeight.Black
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
                .padding(start = 18.dp, end = 18.dp, bottom = 12.dp, top = 16.dp),
            Arrangement.SpaceBetween,
            Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.like),
                    contentDescription = "Like",
                    modifier = Modifier
                        .clickable {
                            Toast.makeText(context, "Liked", Toast.LENGTH_SHORT).show()
                        }
                )
                Spacer(modifier = Modifier.width(28.dp))
                Image(
                    painter = painterResource(id = R.drawable.comment),
                    contentDescription = "Comment",
                    modifier = Modifier
                        .clickable {
                            Toast.makeText(context, "Comment", Toast.LENGTH_SHORT).show()
                        }
                )
                Spacer(modifier = Modifier.width(28.dp))
                Image(
                    painter = painterResource(id = R.drawable.messanger),
                    contentDescription = "Messenger",
                    modifier = Modifier
                        .clickable {
                            Toast.makeText(context, "Messenger", Toast.LENGTH_SHORT).show()
                        }
                )
            }
            Image(
                painter = painterResource(id = R.drawable.save),
                contentDescription = "Save",
                modifier = Modifier
                    .clickable {
                        Toast.makeText(context, "Saved", Toast.LENGTH_SHORT).show()
                    }
            )
        }
        if (feed.likes == 1 || feed.likes == 0) {
            Text(
                text = "${feed.likes} like",
                color = Color(0xFFEFEFEF),
                fontSize = 13.sp,
                modifier = Modifier
                    .padding(horizontal = 12.dp)
            )
        } else {
            likeFormatted = likeFormat.format(feed.likes)
            Text(
                text = "$likeFormatted likes",
                color = Color(0xFFEFEFEF),
                fontSize = 13.sp,
                modifier = Modifier
                    .padding(horizontal = 12.dp)
            )
        }

        TextButton(
            onClick = { expand = !expand },
            shape = RoundedCornerShape(0.dp)
        ) {
            if (!expand) {
                Column {
                    Text(
                        text = caption,
                        color = Color(0xFFEFEFEF),
                        fontSize = 13.sp,
                        modifier = Modifier
                            .padding(vertical = 4.dp),
                        lineHeight = 18.sp,
                        maxLines = 2
                    )
                    Text(
                        text = "...",
                        color = Color(0xFFEFEFEF),
                        fontSize = 13.sp,
                    )
                }
            } else {
                Text(
                    text = caption,
                    color = Color(0xFFEFEFEF),
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(vertical = 4.dp),
                    lineHeight = 18.sp
                )
            }
        }

        Text(
            text = formatDate(feed.date),
            color = Color(0xFF626166),
            fontSize = 11.sp,
            modifier = Modifier
                .padding(start = 12.dp, end = 12.dp, bottom = 14.dp)
        )
    }
}

