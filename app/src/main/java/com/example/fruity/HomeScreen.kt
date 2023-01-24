package com.example.fruity

import android.graphics.Paint.Align
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
fun CategoryItem(
    @DrawableRes image: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = modifier
                .clip(shape = RoundedCornerShape(35.dp))
                .background(AppStrongGrey)
                .size(100.dp)
                .padding(15.dp),
            painter = painterResource(id = image),
            contentDescription = null
        )
        Text(
            stringResource(id = text),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = modifier
                .padding(top = 15.dp)
        )
    }
}

@Preview (showBackground = true)
@Composable
fun CategoryItemPreview(){
    FruityTheme {
        CategoryItem(
            R.drawable.nut,
            R.string.cat_nuts
        )
    }
}

@Composable
fun CategoryLazyItems(modifier: Modifier = Modifier){
    LazyRow() {
        items(CategoryItems) { item ->
            CategoryItem(image = item.drawable, text = item.string)
        }
    }
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



//my data

private val CategoryItems = listOf(
    R.drawable.nut to R.string.cat_nuts,
    R.drawable.apples to R.string.cat_fruits,
    R.drawable.wheat to R.string.cat_vegetable,
    R.drawable.chilli to R.string.cat_chilli,
    R.drawable.wheat to R.string.cat_gluten
).map {LazyCategory(it.first, it.second)}

private data class LazyCategory(
    @DrawableRes val drawable: Int,
    @StringRes val string: Int
)