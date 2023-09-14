package ng.com.ajsprojects.cvapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ng.com.ajsprojects.cvapp.ui.theme.CvAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CvAppTheme {
                // A surface container using the 'background' color from the theme
                    Navigation()
            }
        }
    }
}

@Composable
fun Navigation(){
    val navController = rememberNavController()
    val viewModel: CVViewModel = viewModel()
    NavHost(navController = navController, startDestination = ViewCvScreen.route){
        composable(ViewCvScreen.route){
            ViewCvScreen(navController, viewModel)
        }
        composable(EditCvScreen.route){
            EditCvScreen(navController, viewModel)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun AppPreview(){
    CvAppTheme {
        Navigation()
    }
}