package ng.com.ajsprojects.cvapp

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditCvScreen(navController: NavController, viewModel: CVViewModel) {
    var cvData by remember { mutableStateOf(viewModel.editedCvData.copy()) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Edit Cv") },
                actions = {
                    IconButton(
                        onClick = {
                            viewModel.editedCvData = cvData
                            // Navigate back to the ViewCV screen
                            navController.popBackStack()
                        }
                    ) {
                        Icon(imageVector = Icons.Default.Done, contentDescription = null)
                    }
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(top = 20.dp)
                .verticalScroll(rememberScrollState())
        ) {

            TextField(
                value = cvData.name,
                onValueChange = {newValue ->
                    cvData = cvData.copy(name = newValue)
                },
                textStyle = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                label = { Text(text = "Full Name") }
            )
            TextField(
                value = cvData.email,
                onValueChange = {newValue ->
                    cvData = cvData.copy(email = newValue)
                },
                textStyle = TextStyle(fontSize = 18.sp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 4.dp),
                label = { Text(text = "Email Address") }
            )
            TextField(
                value = cvData.github,
                onValueChange = {newValue ->
                    cvData = cvData.copy(github = newValue)
                },
                textStyle = TextStyle(fontSize = 18.sp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 4.dp),
                label = { Text(text = "Github") }
            )
            TextField(
                value = cvData.phone,
                onValueChange = {newValue ->
                    cvData = cvData.copy(phone = newValue)
                },
                textStyle = TextStyle(fontSize = 18.sp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                label = { Text(text = "Phone Number") }
            )
            TextField(
                value = cvData.summary,
                onValueChange = {newValue ->
                    cvData =cvData.copy(summary = newValue)
                },
                textStyle = TextStyle(fontSize = 18.sp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                label = { Text(text = "Give a summary of yourself") }
            )
            TextField(
                value = cvData.experience,
                onValueChange = {newValue ->
                    cvData = cvData.copy(experience = newValue)
                },
                textStyle = TextStyle(fontSize = 18.sp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                label = { Text(text = "List your work experience") }
            )

            TextField(
                value = cvData.education,
                onValueChange = {newValue ->
                    cvData = cvData.copy(education = newValue)
                },
                textStyle = TextStyle(fontSize = 18.sp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(
                    onNext = {
                        // Focus on the next field
                    }
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                label = { Text(text = "List your educational qualifications") }
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {
                    // Save the edited CV data
                    viewModel.editedCvData = cvData

                    // Navigate back to the ViewCV screen
                    navController.popBackStack()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(text = "Save CV")
            }
        }
    }
}
