package se.magictechnology.pia14android25feb

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Aboutinfo() {
    Column(modifier = Modifier.fillMaxSize().padding(40.dp)) {
        Text("ABOUT INFO READ")
    }
}


@Preview(showBackground = true)
@Composable
fun AboutinfoPreview() {
    Aboutinfo()
}