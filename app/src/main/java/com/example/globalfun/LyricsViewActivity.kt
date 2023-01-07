package com.example.globalfun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
    Text(
        text = "Global Fun"
    )
}
@Composable
fun searchLyrics(){
    Box() {
        Row() {

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