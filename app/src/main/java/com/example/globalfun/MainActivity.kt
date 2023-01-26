package com.example.globalfun

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.globalfun.ui.theme.GlobalFunTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainApp(){
                Column {
                    TheLogo()
                    Buttons()
                    Objective()
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

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
@Composable
fun TheLogo(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.height(150.dp))
        Text(
            text = "Global Fun",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 50.sp
        )
        Text(
            text = "Appreciate the Art",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 24.sp
        )
    }
}


@Composable

fun Buttons(){
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
    ) {
        Button(onClick = {
            context.startActivity(Intent(context, SignUp::class.java))

        },
            colors= ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
            modifier = Modifier
                .height(44.dp)
                .width(161.dp)
        ) {
//            for sign up
            Text(
                text = "sign up",
                fontSize = 24.sp,
            )
        }
        Spacer(modifier = Modifier.height(150.dp))
        Text(text = "Already have an account with us? click below to log in")
        Button(onClick = {
            context.startActivity(Intent(context, LogIn::class.java))
        },
            colors= ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
            modifier = Modifier
                .height(44.dp)
                .width(161.dp)
        ) {
//            for log in
            Text(
                text = "log in",
                fontSize = 24.sp,
            )
        }
    }
}
@Composable
fun Objective(){
    Column(
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(
            text = "We help you enjoy all music in the language you know and love",

        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainApp(){

        Column {
            TheLogo()
            Buttons()
            Objective()
        }
    }
}