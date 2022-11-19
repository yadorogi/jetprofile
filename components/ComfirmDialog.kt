package com.tetsuokawakami.jetprofile.components

import androidx.compose.foundation.layout.* // ktlint-disable no-wildcard-imports
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
// import androidx.hilt.navigation.compose.hiltViewModel
// import com.example.jettodoapp.MainViewModel

@Composable
fun ComfirmDialog() {
    DisposableEffect(Unit) {
        onDispose {
            // viewModel.resetProperties()
        }
    }

    AlertDialog(
        onDismissRequest = { false },
        title = { Text(text = "タイトル2") },
        text = {
            Column {
                Text(text = "タイトル")
                TextField(
                    value = "タイトル",
//                  value = viewModel.title,
                    onValueChange = { /* viewModel.title = it */ }
                )
                Text(text = "詳細")
                TextField(
                    value = "詳細",
//                  value = viewModel.description,
                    onValueChange = { /* viewModel.description = it */ }
                )
            }
        },
        buttons = {
            Row(modifier = Modifier.padding(8.dp)) {
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    modifier = Modifier.width(120.dp),
                    onClick = { /* viewModel.isShowDialog = false */ }
                ) {
                    Text(text = "キャンセル")
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(
                    modifier = Modifier.width(120.dp),
                    onClick = {
                        // viewModel.isShowDialog = false
//                        if (viewModel.isEditing) {
//                            viewModel.updateTask()
//                        } else {
//                            viewModel.createTask()
//                        }
                    }
                ) {
                    Text(text = "OK")
                }
            }
        }
    )
}
