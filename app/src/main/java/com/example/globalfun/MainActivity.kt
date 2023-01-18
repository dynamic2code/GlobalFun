package com.example.globalfun

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.globalfun.ui.theme.GlobalFunTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainApp(){
                Column {
                    theLogo()
                    buttons()
                    objective()
                }
            }
        }
    }
}
@Composable
fun MainApp( content: @Composable () -> Unit){
    GlobalFunTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            content()
        }
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
@Composable
fun theLogo(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(24.dp).fillMaxWidth()
    ) {

        Text(
            text = "Global Fun",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
        Text(
            text = "Appreciate the Art",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
    }
}


@Composable

fun buttons(){
    val context = LocalContext.current
    Column() {
        Button(onClick = {
            context.startActivity(Intent(context, SignUp::class.java))

        }) {
//            for sign up
            Text(
                text = "sign up"
            )
        }
        Text(text = "Already have an account with us? click below to log in")
        Button(onClick = {
            context.startActivity(Intent(context, LogIn::class.java))
        }) {
//            for log in
            Text(
                text = "log in"
            )
        }
    }
}
@Composable
fun objective(){
    Text(
        text = "We help you enjoy all music in the language you know and love"
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainApp(){

        Column {
            theLogo()
            buttons()
            objective()
        }
    }
}