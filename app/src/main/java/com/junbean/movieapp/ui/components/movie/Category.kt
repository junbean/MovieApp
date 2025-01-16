package com.junbean.movieapp.ui.components.movie

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CategoryRow() {
    Column() {
        CategoryTitle("Action")
        LazyRow(
            contentPadding = PaddingValues(
                horizontal = 10.dp
            )
        ) {
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
        }
    }
}

@Composable
fun CategoryTitle(s: String) {
    Text(
        text = s,
        modifier = Modifier.padding(10.dp)
    )
}


@Preview(showBackground = true)
@Composable
fun PreviewCategoryRow() {
    CategoryRow()
}