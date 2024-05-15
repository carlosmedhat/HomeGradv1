package com.example.homegradv1


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun QuickPicks() {
    Column(Modifier.padding(horizontal = 16.dp)) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Quick Picks", style = MaterialTheme.typography.labelLarge , fontSize = 20.sp)
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "More ..", color = Color(0xFF00E676))
            }
        }

        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            QuickButton(
                text = "Resturants",
                icon = painterResource(id = R.drawable.restaurant),
                backgroundColor = Color(0xFFB9F6CA),
                //iconSize = 100.dp
            )
            QuickButton(
                text = "Cafes",
                icon = painterResource(id = R.drawable.cup),
                backgroundColor = Color(0xFFB9F6CA),
                //iconSize = 100.dp
            )
            QuickButton(
                text = "Sandwiches",
                icon = painterResource(id = R.drawable.sandwich),
                backgroundColor = Color(0xFFB9F6CA),
                //iconSize = 100.dp
            )
            QuickButton(
                text = "Fast Food",
                icon = painterResource(id = R.drawable.fast_food),
                backgroundColor = Color(0xFFB9F6CA),
                //iconSize = 100.dp
            )

        }
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            QuickButton(
                text = "Grill",
                icon = painterResource(id = R.drawable.barbecue_grill),
                backgroundColor = Color(0xFFB9F6CA),
                //iconSize = 100.dp
            )
            QuickButton(
                text = "Pizza",
                icon = painterResource(id = R.drawable.pizza_slice),
                backgroundColor = Color(0xFFB9F6CA),
                //iconSize = 100.dp
            )
            QuickButton(
                text = "Sea Food",
                icon = painterResource(id = R.drawable.fish),
                backgroundColor = Color(0xFFB9F6CA),
                //iconSize = 100.dp
            )
            QuickButton(
                text = "Desserts",
                icon = painterResource(id = R.drawable.ice_cream),
                backgroundColor = Color(0xFFB9F6CA),
                //iconSize = 100.dp
            )

        }
    }
}

@Composable
fun QuickButton(
    text: String = "",
    icon: Painter,
    backgroundColor: Color,
    // iconSize: Dp = 50.dp
) {
    Column(
        Modifier
            .width(64.dp)
            .clickable { }) {
        Box(
            Modifier
                .padding(top = 10.dp)
                .align(Alignment.CenterHorizontally)
                .size(50.dp)
                .background(
                    color = backgroundColor,
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(12.dp)
        ) {
            Image(painter = icon, contentDescription = "")
        }
        Text(
            text = text, modifier = Modifier.fillMaxWidth().padding(3.dp)
            , textAlign = TextAlign.Center, fontSize = 10.sp
        )
    }
}
@Preview
@Composable
fun PreviewQuickPicks() {
    QuickPicks()
}

