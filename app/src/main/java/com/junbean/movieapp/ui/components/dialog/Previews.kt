package com.junbean.movieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.junbean.movieapp.R
import com.junbean.movieapp.ui.models.buttons.LeadingIconData
import com.junbean.movieapp.ui.models.dialog.DialogButton
import com.junbean.movieapp.ui.theme.MovieAppTheme

@Preview
@Composable
fun AlertPreview() {
    MovieAppTheme {
        DialogPopup.Alert(
            title = "TITLE",
            bodyText = "blah blah blah",
            buttons = listOf(
                DialogButton.UnderlinedText(
                    "Okay"
                )
            ),
        )
    }
}


@Preview
@Composable
fun DefaultPreview() {
    MovieAppTheme {
        DialogPopup.Default(
            title = "TITLE",
            bodyText = "blah blah blah",
            buttons = listOf(
                DialogButton.Primary(
                    "Open"
                ),
                DialogButton.SecondaryBorderless(
                    "Cancel"
                )
            ),
        )
    }
}


@Preview
@Composable
fun RatingPreview() {
    MovieAppTheme {
        DialogPopup.Rating(
            movieName = "the Lord of the Rings: The Two Towers",
            rating = 7.5f,
            buttons = listOf(
                DialogButton.Primary(
                    title = "Open",
                    leadingIconData = LeadingIconData(
                        iconDrawable = R.drawable.ic_send,
                        iconContentDescription = null
                    )
                ),
                DialogButton.SecondaryBorderless(
                    "Cancel"
                )
            ),
        )
    }
}