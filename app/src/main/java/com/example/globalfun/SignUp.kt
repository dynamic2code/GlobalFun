package com.example.globalfun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.globalfun.ui.theme.GlobalFunTheme

class SignUp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            main (){
                Column {
                    top()
                    signUp()
                    finishButton()
                }
            }
        }
    }
}
@Composable
fun main( content: @Composable () -> Unit){
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
fun top() {
    Text(
        text = "Global Fun"
    )
}

@Composable
fun signUp(){
    Box() {
        Column() {
//            the full box
            val name = remember {
                mutableSetOf(TextFieldValue)
            }
            val email = remember {
                mutableSetOf(TextFieldValue)
            }
            val Password = remember {
                mutableSetOf(TextFieldValue)
            }

            Text(
                text = "Sign up"
            )
            Column() {
//                the filling details part

                Text(
                    text = "Name"
                )
                TextField(
                    value = name.value , onValueChange = {name.value = it}
                )
                Text(
                    text = "Email"
                )
                TextField(
                    value = email.value , onValueChange = {email.value = it}
                )
                Text(
                    text = "Password"
                )
                TextField(
                    value = Password.value , onValueChange = {Password.value = it}
                )

            }
        }
    }
}
@Composable
fun finishButton(){
    Button(onClick = { /*TODO*/ })
    {
        Text(
            text = "Finish"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    GlobalFunTheme {
        main (){
            Column {
                top()
                signUp()
                finishButton()
            }
        }
    }
}