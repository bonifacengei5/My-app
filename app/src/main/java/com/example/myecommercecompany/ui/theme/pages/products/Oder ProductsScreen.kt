package com.example.myecommercecompany.ui.theme.pages.products

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun OrderProductsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(color = Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        val context= LocalContext.current
        Text(
            text = "Your Order",
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Total Price: $10.99", // Replace with your actual total price
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {

                val simToolKitLaunchIntent: Intent? = context.getApplicationContext().getPackageManager()
                    .getLaunchIntentForPackage("com.android.stk")
                if (simToolKitLaunchIntent != null) {
                  context.startActivity(simToolKitLaunchIntent)
                }}){
            Text(text = "M-pesa")
    }


    }
}

@Preview(showBackground = true)
@Composable
fun OrderProductsScreenPreview() {
    OrderProductsScreen(rememberNavController())
}