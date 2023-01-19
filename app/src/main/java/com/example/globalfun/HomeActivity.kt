package com.example.globalfun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.globalfun.ui.theme.GlobalFunTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainHome {
                Column() {
                    top3()
                    searchHome()
                    history()
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
fun top3(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(24.dp).fillMaxWidth()
    ) {
        Text(
            text = "Global Fun",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
    }

}
@Composable
fun searchHome(){
    Box() {
        Row() {

        }
    }
}

@Composable
fun history(){
    Column() {
        Text(text = "History")
        Column() {
            Row() {
                Box() {
//                    contain info of searched tracks
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
                top3()
                searchHome()
                history()
            }
        }
    }
}