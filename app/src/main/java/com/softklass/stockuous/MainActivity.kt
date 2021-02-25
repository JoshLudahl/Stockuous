package com.softklass.stockuous

import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.softklass.stockuous.ui.theme.StockuousTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StockuousTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color(blackish.value)) {
                    Box(Modifier.fillMaxSize()) {
                        Lists()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", color = Color(tealish.value))
}

@Preview
@Composable
fun Lists() {
    Row {
        Column(modifier = Modifier.padding(16.dp)) {
            Greeting(name = "Android - C")
            Greeting(name = "World")
            Greeting(name = "Oregon")
        }

        Column(modifier = Modifier.padding(16.dp)) {
            Greeting(name = "Android - C")
            Greeting(name = "World")
            Greeting(name = "Oregon")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StockuousTheme {
        Greeting("Android")
    }
}

// Colors
val black = Color(parseColor("#000000"))
val blackish = Color(parseColor("#222831"))
val grayish = Color(parseColor("#393e46"))
val tealish = Color(parseColor("#00adb5"))
val light_gray = Color(parseColor("#eeeeee"))
