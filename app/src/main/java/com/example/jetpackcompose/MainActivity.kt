package com.example.jetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .border(
                            border = BorderStroke(
                                width = 1.dp,
                                color = Color.Black
                            )
                        ),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Item 1"
                    )
                    Text(
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Item 1"
                    )
                }

                Spacer(modifier = Modifier.padding(26.dp))

                Row(
                    modifier = Modifier
                        .height(200.dp)
                        .width(200.dp)
                        .border(
                            border = BorderStroke(
                                width = 1.dp,
                                color = Color.Black
                            )
                        )
                ) {
                    Text(
                        modifier = Modifier.align(Alignment.CenterVertically),
                        text = "Item 1"
                    )
                }
            }
        }

//        setContent {
//            ScrollableColumn(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(
//                        color = Color(0xFFF2F2F2)
//                    )
//            ) {
//                Image(
//                    bitmap = imageFromResource(
//                        res = resources,
//                        resId = R.drawable.happy_meal_small
//                    ),
//                    modifier = Modifier.height(300.dp),
//                    contentScale = ContentScale.Crop
//                )
//
//                Column(
//                    modifier = Modifier.padding(16.dp)
//                ) {
//                    Text(
//                        text = "Happy Meal",
//                        style = TextStyle(
//                            fontSize = TextUnit.Companion.Sp(26)
//                        )
//                    )
//
//                    Spacer(modifier = Modifier.padding(top = 10.dp))
//
//                    Text(
//                        text = "800 calories",
//                        style = TextStyle(
//                            fontSize = TextUnit.Companion.Sp(17)
//                        )
//                    )
//
//                    Spacer(modifier = Modifier.padding(top = 10.dp))
//
//                    Text(
//                        text = "$5.99",
//                        style = TextStyle(
//                            color = Color(0xFF85BB65),
//                            fontSize = TextUnit.Companion.Sp(17)
//                        )
//                    )
//                }
//            }
//        }
    }
}