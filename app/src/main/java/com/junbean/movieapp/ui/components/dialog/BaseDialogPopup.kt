package com.junbean.movieapp.ui.components.dialog

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.junbean.movieapp.ui.models.dialog.DialogButton
import com.junbean.movieapp.ui.components.dialog.components.button.DialogButtonsColumn
import com.junbean.movieapp.ui.models.dialog.DialogContent
import com.junbean.movieapp.ui.components.dialog.components.content.DialogContentWrapper
import com.junbean.movieapp.ui.models.dialog.DialogTitle
import com.junbean.movieapp.ui.components.dialog.components.title.DialogTitleWrapper
import com.junbean.movieapp.ui.theme.Paddings

@Composable
fun BaseDialogPopup(
    dialogTitle: DialogTitle? = null,
    dialogContent: DialogContent? = null,
    buttons: List<DialogButton>? = null
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(Paddings.none),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background
        ),
        shape = MaterialTheme.shapes.large
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            dialogTitle?.let {
                DialogTitleWrapper(it)
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = Paddings.xlarge,
                        end = Paddings.xlarge,
                        bottom = Paddings.xlarge
                    )
            ) {
                dialogContent?.let { DialogContentWrapper(it) }
                buttons?.let { DialogButtonsColumn(it) }
            }
        }
    }
}

/*
Card(
    modifier = Modifier.fillMaxWidth(),
    elevation = CardDefaults.cardElevation(Paddings.none),
    backgroundColor = CardDefaults.cardColors(
        contentColor = ,
        containerColor = MaterialTheme.colorScheme.background,
    ) ,
    shape = MaterialTheme.shapes.large
) {

}
*/