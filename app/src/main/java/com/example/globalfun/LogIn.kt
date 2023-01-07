package com.example.globalfun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
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
    Text(
        text = "Global Fun"
    )
}

@Composable
fun login(){

//    Box() {
//        Column() {
////            the full box
//            Text(
//                text = "log in"
//            )
//            Column() {
////                the filling details part
//
//                Text(
//                    text = "Name"
//                )
//
//            }
//        }
//    }
}

@Composable
fun finishButton2(){
    Button(onClick = { /*TODO*/ })
    {
        Text(
            text = "Finish"
        )
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