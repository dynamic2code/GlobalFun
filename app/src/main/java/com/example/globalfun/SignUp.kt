package com.example.globalfun

import android.os.Bundle
import android.widget.NumberPicker.OnValueChangeListener
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.globalfun.ui.theme.GlobalFunTheme

class SignUp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            main (){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                        ){
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
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(150.dp))
    }

}

@Composable
fun signUp(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .width(308.dp)
                .height(319.dp)
//                .background(Color.LightGray).clip(RoundedCornerShape())
//                .padding(30.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,

                modifier = Modifier.fillMaxWidth().padding(24.dp)
            ) {

                Text(
                    text = "Sign up",
                    fontSize = 24.sp,
//                modifier = Modifier.align()
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                ) {
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
                        },
                        placeholder = {
                            Text("Name",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.LightGray)

                    )
                    TextField(
                        value = _email.value,
                        onValueChange ={
                            _email.value = it
                        },
                        placeholder = {
                            Text("Email",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.LightGray)

                    )
                    TextField(
                        value = _password.value ,
                        onValueChange ={
                            _password.value = it
                        },
                        placeholder = {
                            Text("Password",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.LightGray)

                    )

            }
            }

    }
        Spacer(modifier = Modifier.height(40.dp))
    }
}
@Composable
fun finishButton(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
    ) {
        Button(onClick = { /*TODO*/ },
            colors= ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
            modifier = Modifier
                .height(44.dp)
                .width(161.dp)
        )
        {
            Text(
                text = "Finish",
                fontSize = 24.sp
            )
        }
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