package com.example.globalfun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.globalfun.ui.theme.GlobalFunTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainHome {
                Column() {
                    Top3()
                    SearchHome()
                    History()
                }

            }
        }
    }
}

@Composable
fun MainHome( content: @Composable () -> Unit){
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
fun Top3(){
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
fun SearchHome(){
    val searchTerm = remember {
        mutableStateOf(value = "")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(
            shape = RoundedCornerShape(30.dp),
            elevation = 10.dp,
            modifier = Modifier.padding(10.dp)
        ) {
            Row() {
                TextField(value = searchTerm.value ,
                    onValueChange = {
                        searchTerm.value = it
                    },
                    leadingIcon = {
                        Icon(Icons.Filled.Search,
                            "contentDescription",
                            modifier = Modifier.clickable { /* .. */})},

                    placeholder = {
                        Text("search",
                            fontSize = 17.sp,
                            fontWeight = FontWeight.SemiBold,
                        )
                    },
                    modifier = Modifier
                )
            }

        }
    }
}

@Composable
fun History(){
    Column() {
        Text(text = "History",
            modifier = Modifier.padding(24.dp),
            fontWeight = FontWeight.Bold,
        )
    }
    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column() {
            Row(
                modifier = Modifier.padding(24.dp)
            ) {
                Box(
                    modifier = Modifier
                        .width((LocalConfiguration.current.screenHeightDp * 0.2f).dp)
                        .height((LocalConfiguration.current.screenHeightDp * 0.2f).dp)
                        .background(Color.LightGray)

                ){
                    
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    GlobalFunTheme {
        MainHome {
            Column() {
                Top3()
                SearchHome()
                History()
            }
        }
    }
}