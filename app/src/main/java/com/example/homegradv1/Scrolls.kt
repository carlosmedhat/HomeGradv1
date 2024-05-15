package com.example.homegradv1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun scrolls() {
    Column(Modifier.padding( 16.dp)) {

        Divider(
            color = Color.LightGray,
            thickness = 3.dp,
            modifier = Modifier.padding(16.dp),
        )

        Text(text = "Discover ", style = MaterialTheme.typography.labelLarge , fontSize = 20.sp ,color = Color.Black , fontWeight = FontWeight.Bold)

        // Popular This week
        Text(text = "Popular This Week  ",style = MaterialTheme.typography.labelLarge , fontSize = 18.sp ,color = Color.Black, modifier = Modifier.padding(bottom= 14.dp))

        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
        }
        // Recommended for you
        Text(text = "Recommended for you  ",style = MaterialTheme.typography.labelLarge , fontSize = 18.sp ,color = Color.Black, modifier = Modifier.padding(bottom= 14.dp))

        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
        }

        // NearBy
        Text(text = "Near By  ",style = MaterialTheme.typography.labelLarge , fontSize = 18.sp ,color = Color.Black, modifier = Modifier.padding(bottom= 14.dp))

        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
            item {
                ItemInScroll(imagePainter = painterResource(id = R.drawable.pizza_king))
            }
        }
    }


}

@Composable
fun ItemInScroll(
    imagePainter: Painter
) {
    Card(
        Modifier
            .width(80.dp)
            .padding(bottom = 28.dp)) {
        Column() {
            Image(
                painter = imagePainter, contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f),
                contentScale = ContentScale.Fit
            )

        }
    }
}

@Preview
@Composable
fun previewScrolls() {
    scrolls()
}