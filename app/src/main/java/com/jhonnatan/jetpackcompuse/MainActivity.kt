package com.jhonnatan.jetpackcompuse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jhonnatan.jetpackcompuse.ui.theme.JetPackCompuseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackCompuseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Calculator()
                }
            }
        }
    }
}


@Composable
fun Calculator(){
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .background(Color.White)
                .border(
                    width = 2.dp,
                    color = Color.Green,
                ).padding(10.dp)
                , Alignment.Center){
                Text(text = "Calculator Layout",fontSize = 40.sp)
        }
        Column(
            Modifier
                .fillMaxWidth()
                .border(2.dp, Color.Green)) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp), Alignment.CenterEnd){
                Text(text = "Resultado anterior 3", fontSize = 20.sp)

            }
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp), Alignment.CenterEnd){
                Text(text = "Resultado anterior 2", fontSize = 20.sp)

            }
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp), Alignment.CenterEnd){
                Text(text = "Resultado anterior 1", fontSize = 20.sp)

            }
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp), Alignment.CenterEnd){
                Text(text = "Texto Resultado", fontSize = 30.sp)

            }
        }
        Box(
            Modifier
                .fillMaxWidth()
                .height(100.dp)
                .border(2.dp, Color.Green)
                .background(Color.hsl(30f, 0.2f, 0.8f))
        ){}
        Row(modifier = Modifier
            .weight(1f)
            .fillMaxHeight()) {
            Box(
                Modifier
                    .weight(1f)

                    .fillMaxHeight()){
                Column(Modifier.fillMaxWidth()) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "+", fontSize = 50.sp)
                    }
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "7",fontSize = 50.sp)
                    }
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "4",fontSize = 50.sp)
                    }

                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "1",fontSize = 50.sp)
                    }

                }


            }
            Box(
                Modifier
                    .weight(1f)

                    .fillMaxHeight()){
                Column(Modifier.fillMaxWidth()) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "-", fontSize = 50.sp)
                    }
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "8",fontSize = 50.sp)
                    }
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "5",fontSize = 50.sp)
                    }

                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "2",fontSize = 50.sp)
                    }

                }


            }
            Box(
                Modifier
                    .weight(1f)

                    .fillMaxHeight()){
                Column(Modifier.fillMaxWidth()) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "*", fontSize = 50.sp)
                    }
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "9",fontSize = 50.sp)
                    }
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "6",fontSize = 50.sp)
                    }

                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "3",fontSize = 50.sp)
                    }

                }


            }
            Box(
                Modifier
                    .weight(1f)

                    .fillMaxHeight()){
                Column(Modifier.fillMaxWidth()) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "/", fontSize = 50.sp)
                    }
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "AC",fontSize = 50.sp)
                    }
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .weight(2f).border(1.dp, Color.Green), Alignment.Center){
                        Text(text = "=",fontSize = 50.sp)
                    }


                }


            }

        }
        Box(
            Modifier
                .fillMaxWidth()
                .border(3.dp, Color.Black)
                .padding(top = 30.dp), Alignment.BottomCenter
            ){
            Text(text = "Ads", fontSize = 35.sp)

        }
    }

        }


@Composable
fun Exercise(){
    Column(Modifier.fillMaxSize()){
        Box(
            Modifier

                .weight(1f)
                .fillMaxWidth()
                .border(4.dp, Color.Green, shape = RoundedCornerShape(20.dp))
                .background(Color.Cyan), contentAlignment = Alignment.Center) {
            Text(text = "Ejemplo 1")
        }
        Row(
            Modifier
                .fillMaxSize()
                .weight(1f)){
            Box(
                Modifier
                    .weight(1f)
                    .background(Color.Red)
                    .fillMaxHeight(),Alignment.Center){
                Text(text = "Ejemplo 2")
            }
            Box(
                Modifier
                    .weight(1f)
                    .background(Color.Green)
                    .fillMaxHeight(),contentAlignment = Alignment.Center){
                Text(text = "Ejemplo 3")
            }
        }
        Column(
            Modifier
                .fillMaxSize()
                .weight(1f)){
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .weight(1f) ){

            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .weight(1f) ){

            }

        }
    }
}






@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackCompuseTheme {
        Calculator()
    }
}