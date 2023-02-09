package com.example.globalfun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.globalfun.ui.theme.GlobalFunTheme
import java.io.File

class LyricsViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainLyrics() {
                Column {
                    Top4()
                    SearchLyrics()
                    LyricsSpace()
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
fun Top4(){
    val configuration = LocalConfiguration.current

    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Global Fun",
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 24.sp

//            fontFamily = fontName
        )
    }

}
@Composable
fun SearchLyrics(){
    val configuration = LocalConfiguration.current

    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp
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
                            modifier = Modifier.clickable { /* .. */})
                    },

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
fun LyricsSpace(){
    val configuration = LocalConfiguration.current

    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(50.dp)
            .fillMaxWidth()
    ) {
//        for every verse
        Text(text = "Spanish",
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
        )
        Text(text = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.")
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "English",
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
        )
        Text(text = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.")
    }
}
@Composable
fun ChooseLanguage(){
    val userLang = remember {
        mutableStateOf(value = "")
    }
    Column() {
        Row() {
            Card() {
                Button(onClick = { /*TODO*/ }) {
//                    choose language
                }
            }
            Card() {
                TextField(value = userLang.value, onValueChange = {userLang.value = it} )
            }
        }
        
    }

}
@Composable
fun MusicCover(){
    val image = File("")
    Column() {
//        Image(painter = image,
//            contentDescription = "Album pic",
//            modifier = Modifier
//                // Set image size to 40 dp
//                .size(40.dp)
//                // Clip image to be shaped as a circle
//                .clip(CircleShape))
    }
}
@Composable
fun Navigation(){
Column() {
    Row(
        modifier = Modifier.padding(25.dp)
    ) {
        Card() {
            Button(onClick = { /*TODO*/ }) {
//                pause
            }
        }
        Card() {
            Button(onClick = { /*TODO*/ }) {
//                home
            }
        }
        Card() {
            Button(onClick = { /*TODO*/ }) {
//                play
            }
        }
    }
}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    GlobalFunTheme {
        MainLyrics() {
            Column {
                Top4()
                SearchLyrics()
                LyricsSpace()
            }
        }
    }
}