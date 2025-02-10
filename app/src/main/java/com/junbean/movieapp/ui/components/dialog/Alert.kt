package com.junbean.movieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.junbean.movieapp.R
import com.junbean.movieapp.ui.models.dialog.DialogButton
import com.junbean.movieapp.ui.models.dialog.DialogContent
import com.junbean.movieapp.ui.models.dialog.DialogText
import com.junbean.movieapp.ui.models.dialog.DialogTitle

@Composable
fun DialogPopup.Alert(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Header(
            title
        ),
        dialogContent = DialogContent.Large(
            DialogText.Default(bodyText)
        ),
        buttons = buttons
    )
}