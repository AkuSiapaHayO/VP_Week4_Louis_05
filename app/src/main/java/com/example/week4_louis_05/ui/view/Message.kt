package com.example.week4_louis_05.ui.view

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week4_louis_05.R
import com.example.week4_louis_05.data.dummy_data
import com.example.week4_louis_05.model.line_chat

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MessagePreview() {
    MessageView(dummy_data().get_data_line())
}

@Composable
fun MessageView(messageList: List<line_chat>) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0E0E0E))
    ){
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0E0E0E))
                .padding(horizontal = 20.dp, vertical = 14.dp)
        ){
            Text(
                text = "Chats",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Image(
                painter = painterResource(id = R.drawable.baseline_more_vert_24),
                contentDescription = "More Vertical",
                modifier = Modifier
                    .size(20.dp)
            )
        }

        LazyColumn() {
            items(messageList) {
                MessageCard(
                    it,
                    Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Composable
fun MessageCard(messageList: line_chat, modifier: Modifier = Modifier) {

    val context = LocalContext.current

    Column {
        Row(
            modifier = Modifier
                .background(Color(0xFF0E0E0E))
                .padding(vertical = 12.dp, horizontal = 12.dp)
                .clickable {
                           Toast.makeText(context, "${messageList.name} Clicked", Toast.LENGTH_SHORT).show()
                },
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.baseline_account_circle_24),
                contentDescription = "Account Profile",
                modifier = Modifier
                    .size(55.dp)
            )

            Column(
                modifier = Modifier
                    .padding(horizontal = 8.dp),
            ) {
                Text(
                    text = messageList.name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.White
                )
                Text(
                    text = messageList.chatView,
                    modifier = Modifier
                        .width(200.dp),
                    maxLines = 2,
                    color = Color.White
                )
            }

            Text(
                text = messageList.date,
                textAlign = TextAlign.Right,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .weight(1f),
                color = Color.White
            )
        }
    }

}