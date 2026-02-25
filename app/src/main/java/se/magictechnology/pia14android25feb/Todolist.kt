package se.magictechnology.pia14android25feb

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Todolist(godetail: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize().padding(40.dp)) {
        Text("TODOLIST")

        Button(onClick = {
            godetail()
        }) {
            Text("Go to detail")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TodolistPreview() {
    Todolist(godetail = {})
}