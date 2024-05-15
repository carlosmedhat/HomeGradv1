package com.example.homegradv1

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
 fun ImageAndIcons() {

    Box {
        Image(
            painter = painterResource(id = R.drawable.home_img),
            contentScale = ContentScale.Crop,
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .statusBarsPadding()
                .padding(horizontal = 16.dp, vertical = 16.dp)
        )
        {
            CircularButton(R.drawable.ic_arrow_back)
            CircularButton(R.drawable.ic_search)
        }
    }
}
@Composable
fun CircularButton(
    @DrawableRes iconResource: Int,
    color: Color = Color.LightGray,
    elevation: ButtonElevation? = ButtonDefaults.buttonElevation(),
) {
    Button(
        onClick = { },
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(contentColor = color, containerColor = Color.White),
        elevation = elevation,
    ) {
        Icon(painter = painterResource(id = iconResource), contentDescription = null)
    }
}