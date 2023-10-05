package com.example.week4_louis_05.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week4_louis_05.R
import com.example.week4_louis_05.data.dummy_data
import com.example.week4_louis_05.model.categories
import com.example.week4_louis_05.model.products

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TokopediaPreview() {
    TokopediaView(dummy_data().get_data_tokopedia_category(), dummy_data().get_data_tokopedia_product())
}

@Composable
fun TokopediaView(categoryList: List<categories>, productList: List<products>) {
    Column(
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Tokopedia",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 24.sp
            )

            Image(
                painter = painterResource(id = R.drawable.baseline_more_vert_24_black),
                contentDescription = "More Vertical",
                modifier = Modifier
                    .size(30.dp)
            )
        }

        Image(
            painter = painterResource(id = R.drawable.banner_tokopedia),
            contentDescription = "Banner Tokopedia",
            modifier = Modifier
                .padding(vertical = 12.dp)
        )

        Text(
            text = "Categories",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        )

        LazyRow(
            modifier = Modifier
                .padding(vertical = 16.dp)
        ) {
            items(categoryList) {
                CategoriesCard(it)
            }
        }

        Text(
            text = "Products",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .padding(vertical = 16.dp)
        ) {
            items(productList) {
                ProductsCard(it)
            }
        }
    }
}

@Composable
fun ProductsCard(productList: products) {
    Card (
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF8F8F8)
        ),
        modifier = Modifier
            .padding(8.dp)
        ,
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ){
            Image(
                painter = painterResource(id = productList.image_path),
                contentDescription = "Product Image",
                modifier = Modifier
                    .size(100.dp)
                    .padding(12.dp)
                    .align(CenterHorizontally)
            )

            Text(
                text = productList.product_name,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = "Rp.${productList.price}"
            )
            Text(
                text = "Kota ${productList.location}"
            )
            Text(
                text = "${productList.sold} Sold"
            )

        }
    }
}

@Composable
fun CategoriesCard(categoryList: categories) {
    Card (
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF9F9F9)
        ),
        modifier = Modifier
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = categoryList.image_path),
                contentDescription = "Category Image",
                modifier = Modifier
                    .size(90.dp)
                    .padding(12.dp)
            )

            Text(
                text = categoryList.category_name,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
            )

            Text(
                text = "${categoryList.number_of_items} Products",
                modifier = Modifier
                    .padding(start = 8.dp, end = 8.dp, bottom = 12.dp)
            )
        }
    }
}

