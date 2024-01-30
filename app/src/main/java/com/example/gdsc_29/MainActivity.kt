package com.example.gdsc_29

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdsc_29.ui.theme.GDSC_29Theme
import com.example.gdsc_29.ui.theme.Yellow1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GDSC_29Theme {
                MyScreen()
            }
        }
    }
}
@Composable
fun MyScreen(){

    Column(
        verticalArrangement = Arrangement.Center,
    horizontalAlignment= Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize())
    {
        Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(27.dp)
            .height(250.dp),
            backgroundColor = Yellow1,
            elevation = 10.dp,
            shape = RoundedCornerShape(30.dp)
    ){
Column {
    MyStuffR()
    MyStuffR2()
}
    }

    }
}
@Composable
fun MyStuffR(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)){
Text(text = "Sakshi & Maithili",
    fontSize = 22.sp,
    color = Color.Black,
    fontWeight = FontWeight.Bold
    )
        Spacer(modifier = Modifier.padding(16.dp))
        Image(painter = painterResource(id = R.drawable.gdsc_logo),
            contentDescription ="GDSC logo" )
    }
}

@Composable
fun MyStuffR2(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp))
    {
        Spacer(modifier = Modifier.padding(2.dp))
        Image(painter = painterResource(id = R.drawable.android_logo),
            contentDescription ="Android Logo" )
        Text(text = "Attempting Android   Dev",
            fontSize = 20.sp,
            color= Color.Black,
            fontWeight=FontWeight.Bold)
    }
}

@Preview(showBackground = true)
@Composable

fun GreetingPreview() {
    GDSC_29Theme {
MyScreen()
    }
}