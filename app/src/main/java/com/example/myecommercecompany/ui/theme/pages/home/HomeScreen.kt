package com.example.myecommercecompany.ui.theme.pages.home


import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search

import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector

import androidx.compose.ui.res.painterResource


import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.myecommercecompany.R
import com.example.myecommercecompany.ui.theme.MyEcommerceCompanyTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Bumia Matamu ",
            color = Color.Red,
            fontSize = 40.sp,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(20.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(id = R.drawable.fruits_2198378_640),
            contentDescription = null,
            modifier = Modifier
                .border(2.dp, Color.Gray, shape = RectangleShape)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { "buy now" },
                modifier = Modifier
                    .height(120.dp)
                    .width(100.dp),
                shape = CutCornerShape(40)


            ) {
                Image(
                    painter = painterResource(id = R.drawable.mangoes),
                    contentDescription = null,
                    modifier = Modifier

                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.width(80.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(120.dp)
                    .width(100.dp),
                shape = CutCornerShape(40)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.strawberry),
                    contentDescription = null,
                    modifier = Modifier

                        .fillMaxSize()
                )
            }
        }
        Spacer(modifier = Modifier.width(80.dp))
        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(120.dp)
                    .width(100.dp),
                shape = CutCornerShape(40)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.lime),
                    contentDescription = null,
                    modifier = Modifier

                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.width(80.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(120.dp)
                    .width(100.dp),
                shape = CutCornerShape(40)



            ) {
                Image(
                    painter = painterResource(id = R.drawable.oranges),
                    contentDescription = null,
                    modifier = Modifier

                        .fillMaxSize()
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Spacer(modifier = Modifier.width(80.dp))
    }




}



@Preview
@Composable
fun HomeScreenPreview() {
    MyEcommerceCompanyTheme{
        HomeScreen()
    }
}























