package com.murerwa.composetutorial

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.murerwa.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainBody()
        }
    }

    @Composable
    fun MainBody(){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Green)
                .padding(10.dp)
        ) {
            Text(text = "Hello")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "World")
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        MainBody()
    }
}