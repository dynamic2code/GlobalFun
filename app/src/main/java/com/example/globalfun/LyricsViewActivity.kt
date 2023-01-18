package com.example.globalfun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.globalfun.ui.theme.GlobalFunTheme

class LyricsViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainLyrics() {
                Column {
                    top4()
                    searchLyrics()
                    lyricsSpace()
                }
            }
        }
    }
}

@Composable
fun MainLyrics( content: @Composable () -> Unit){
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
fun top4(){
    Column(Modifier.padding(24.dp).fillMaxWidth()
    ) {
        Text(
            text = "Global Fun"

        )
    }

}
@Composable
fun searchLyrics(){
    val searchTerm = remember {
        mutableStateOf(value = "")
    }
    Box() {
        Row() {
            TextField(value = searchTerm.value ,
                onValueChange = {
                    searchTerm.value = it
                })
        }

    }
}
@Composable
fun lyricsSpace(){
    Column() {
//        for every verse
        Text(text = "lyrics")
        Text(text = "translation")
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    GlobalFunTheme {
        MainLyrics() {
            Column {
                top4()
                searchLyrics()
                lyricsSpace()
            }
        }
    }
}