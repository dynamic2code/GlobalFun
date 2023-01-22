package com.example.globalfun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.globalfun.ui.theme.GlobalFunTheme

class LogIn : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mainLogin (){
                Column {
                    top2()
                    login()
                    finishButton2()
                }
            }
        }
    }
}

@Composable
fun mainLogin( content: @Composable () -> Unit){
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
fun top2() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Global Fun",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
    }

}

@Composable
fun login(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(400.dp)
                .background(Color.LightGray).padding(30.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth()
            ) {
//            the full box
                Text(
                    text = "Sign up"
                )

                Column() {
//                the filling details part
                    val _name = remember {
                        mutableStateOf(value = "")
                    }
                    val _email = remember {
                        mutableStateOf(value = "")
                    }
                    val _password = remember {
                        mutableStateOf(value = "")
                    }


                    TextField(

                        value = _name.value,
                        onValueChange = {
                            _name.value = it
                        }
                    )
                    TextField(
                        value = _email.value,
                        onValueChange ={
                            _email.value = it
                        }
                    )
                    TextField(
                        value = _password.value ,
                        onValueChange ={
                            _password.value = it
                        }
                    )

                }
            }
        }
    }

}

@Composable
fun finishButton2(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
    ) {
        Button(onClick = { /*TODO*/ })
        {
            Text(
                text = "Finish"
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    GlobalFunTheme {
        mainLogin (){
            Column {
                top2()
                login()
                finishButton2()
            }
        }
    }
}