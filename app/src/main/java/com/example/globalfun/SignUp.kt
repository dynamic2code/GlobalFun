package com.example.globalfun

import android.os.Bundle
import android.widget.NumberPicker.OnValueChangeListener
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
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

    val textin = remember {
        mutableStateOf(value = "")
    }

    TextField(
        value = textin.value,
        onValueChange = {
            textin.value = it
    }
    )
//    Box() {
//        Column() {
////            the full box
//            Text(
//                text = "Sign up"
//            )
//            Column() {
////                the filling details part
//
//            }
//        }
//    }
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