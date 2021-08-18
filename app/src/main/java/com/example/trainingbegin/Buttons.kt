package com.example.trainingbegin

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun ButtonCualquiera(){
    Button(
        onClick = {  println("click button") }) {
        Text("Click Me", color= Color.White)
    }
}