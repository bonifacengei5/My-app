package com.example.myecommercecompany.ui.theme.pages.products

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myecommercecompany.navigations.ROUTE_MyFruits_Screen
import com.example.myecommercecompany.navigations.ROUTE_ODER_PRODUCTS

@Composable
fun OrderProductsScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
    horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { navController.navigate(ROUTE_MyFruits_Screen)}) {
            Text(text = "Buy now",
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun OrderProductsScreenPreview() {
    OrderProductsScreen(rememberNavController())

}