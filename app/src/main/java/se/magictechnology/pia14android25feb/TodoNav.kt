package se.magictechnology.pia14android25feb

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable


@Serializable
data class TodoItem(val title : String)

@Composable
fun TodoNav(navController : NavHostController) {

    NavHost(
        navController = navController,
        startDestination = "todolist",
        modifier = Modifier
    ) {

        composable(route = "todolist") {
            Todolist(
                godetail = { todo ->
                    navController.navigate(todo)
                },
                goabout = {
                    navController.navigate("about")
                }
            )
        }

        composable<TodoItem> { backStackEntry ->
            val todo : TodoItem = backStackEntry.toRoute()
            TodoDetail(todo)
        }

        composable(route = "about") {
            Aboutinfo()
        }


    }

}

@Preview(showBackground = true)
@Composable
fun TodoNavPreview() {
    TodoNav(rememberNavController())
}