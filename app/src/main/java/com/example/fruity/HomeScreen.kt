package com.example.fruity

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow.Companion.Clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fruity.ui.theme.AppLightGrey
import com.example.fruity.ui.theme.AppOrange
import com.example.fruity.ui.theme.AppStrongGrey
import com.example.fruity.ui.theme.FruityTheme

@Composable
fun TopBar(
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp, vertical = 15.dp)
    ) {
        Column(modifier = modifier.weight(1f)) {
            Text(
                stringResource(id = R.string.good_for_you),
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                stringResource(id = R.string.great_for_life),
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        IconButton(
            modifier = modifier
                .clip(shape = RoundedCornerShape(20.dp))
                .background(AppStrongGrey)
                .padding(2.dp),
            onClick = { /*TODO*/ }
        ) {
            Image(
                modifier = modifier.size(30.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.notification_bell),
                contentDescription = null
            )
        }
    }
}

@Preview (showBackground = true)
@Composable
fun TopBarPreview(){
    FruityTheme {
        TopBar()
    }
}

@Composable
fun SearchBar(modifier: Modifier = Modifier){
    TextField(
        value = "",
        onValueChange = {},
        maxLines = 1,
        placeholder = {
            Text(stringResource(id = R.string.search_text))
        },
        leadingIcon = {
            Icon(
                modifier = modifier
                    .padding(horizontal = 10.dp)
                    .width(25.dp),
                painter = painterResource(id = R.drawable.search),
                contentDescription = null
            )
        },
        trailingIcon = {
            Icon(
                modifier = modifier
                    .padding(horizontal = 10.dp)
                    .width(25.dp),
                painter = painterResource(id = R.drawable.filter),
                contentDescription = null
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
        ,
        modifier = modifier
            .fillMaxWidth()
            .heightIn(70.dp)
            .padding(15.dp)
            .clip(shape = RoundedCornerShape(23.dp))
            .background(AppLightGrey)
    )
}

@Preview (showBackground = true)
@Composable
fun SearchBarPreview(){
    FruityTheme {
        SearchBar()
    }
}

@Composable
fun CategoryItem(modifier: Modifier = Modifier){

}

@Preview (showBackground = true)
@Composable
fun CategoryItemPreview(){
    FruityTheme {
        CategoryItem()
    }
}

@Composable
fun CategoryLazyItems(modifier: Modifier = Modifier){

}

@Preview (showBackground = true)
@Composable
fun CategoryLazyItemsPreview(){
    FruityTheme {
        CategoryLazyItems()
    }
}

@Composable
fun FruitItem(modifier: Modifier = Modifier){

}

@Preview (showBackground = true)
@Composable
fun FruitItemLazyGrid(){
    FruityTheme {
        FruitItem()
    }
}