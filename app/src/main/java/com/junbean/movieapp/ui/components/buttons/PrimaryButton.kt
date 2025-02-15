package com.junbean.movieapp.ui.components.buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImagePainter.State.Empty.painter
import com.junbean.movieapp.ui.models.buttons.LeadingIconData
import com.junbean.movieapp.ui.theme.MovieAppTheme
import com.junbean.movieapp.ui.theme.Paddings
import com.junbean.movieapp.ui.theme.dialogButton
import com.junbean.movieapp.ui.theme.myColors

val LEADING_ICON_SIZE = 24.dp

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    @StringRes id: Int? = null,
    text: String = "",
    leadingIconData: LeadingIconData? = null,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            contentColor = MaterialTheme.myColors.onPrimary,
            containerColor = MaterialTheme.myColors.primary,
            disabledContentColor = MaterialTheme.myColors.background,
            disabledContainerColor = MaterialTheme.myColors.disabledSecondary
        )
    ) {
        leadingIconData?.let {
            Icon(
                modifier = Modifier.size(LEADING_ICON_SIZE),
                painter = painterResource(id = leadingIconData.iconDrawable),
                contentDescription = leadingIconData.iconContentDescription?.let { desc -> stringResource(id = desc) }
            )
            Spacer(modifier = Modifier.width(Paddings.small))
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = id?.let { stringResource(id = id) } ?: text,
                style = MaterialTheme.typography.dialogButton,
                modifier = Modifier.padding(Paddings.small)
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    MovieAppTheme {
        PrimaryButton(
            text = "SUBMIT"
        ) { }
    }
}