package se.magictechnology.pia14android25feb

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun TodoNav() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "todolist",
        modifier = Modifier
    ) {

        composable(route = "todolist") {
            Todolist(godetail = {
                navController.navigate("tododetail")
            })
        }

        composable(route = "tododetail") {
            TodoDetail()
        }

    }

}

@Preview(showBackground = true)
@Composable
fun TodoNavPreview() {
    TodoNav()
}