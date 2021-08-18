package com.example.trainingbegin

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", fontSize = 10.sp)
}

@Composable
fun BigText(name: String) {
    Text(
        name,
        modifier =
        Modifier
            //.height(300.dp)
            .padding(all = 20.dp)
            .clickable { println("succión!! $name") },
        style = TextStyle(
            color = Color.Magenta,
            fontSize = 50.sp,
            fontWeight = FontWeight.SemiBold
        )/*MaterialTheme.typography.button*/



    )
}

@Composable
fun BoldText(text: String) {
    Text(text, fontWeight = FontWeight.Bold)
}
