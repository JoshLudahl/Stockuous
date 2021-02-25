package com.softklass.stockuous

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.softklass.stockuous.ui.theme.StockuousTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StockuousTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color.Magenta) {
                    Lists()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun Lists() {
    Column () {
        Greeting(name = "Android")
        Greeting(name = "World")
        Greeting(name = "Oregon")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StockuousTheme {
        Greeting("Android")
    }
}