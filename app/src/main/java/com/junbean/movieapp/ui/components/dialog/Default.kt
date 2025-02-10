package com.junbean.movieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import com.junbean.movieapp.ui.models.dialog.DialogButton
import com.junbean.movieapp.ui.models.dialog.DialogContent
import com.junbean.movieapp.ui.models.dialog.DialogText
import com.junbean.movieapp.ui.models.dialog.DialogTitle

object DialogPopup

@Composable
fun DialogPopup.Default(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Default(title),
        dialogContent = DialogContent.Large(
            DialogText.Default(bodyText)
        ),
        buttons = buttons
    )
}