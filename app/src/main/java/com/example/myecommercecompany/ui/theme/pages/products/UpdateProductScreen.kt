package com.example.myecommercecompany.ui.theme.pages.products

import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myecommercecompany.data.ProductRepository

import com.example.myecommercecompany.models.Product
import com.example.myecommercecompany.navigations.ROUTE_UPDATE_PRODUCTS
import com.example.myecommercecompany.navigations.ROUTE_VIEW_PRODUCTS
import com.example.myecommercecompany.ui.theme.MyEcommerceCompanyTheme
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun UpdateProductScreen(navController: NavHostController, id:String) {


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    )

    {
        Button(onClick = {
            navController.navigate(ROUTE_VIEW_PRODUCTS)

        }) {
            Text(text = "Welcome to view products")

        }
        var context = LocalContext.current
        Text(
            text = "Update product",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Red,
            modifier = Modifier.padding(20.dp),
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )
        var productname by remember { mutableStateOf(TextFieldValue("")) }
        var productquantity by remember { mutableStateOf(TextFieldValue("")) }
        var productprice by remember { mutableStateOf(TextFieldValue("")) }




        OutlinedTextField(
            value = productname,
            onValueChange = { productname = it },
            label = { Text(text = "Product name *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        OutlinedTextField(
            value = productquantity,
            onValueChange = { productquantity = it },
            label = { Text(text = "Product size*") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = productprice,
            onValueChange = { productprice = it },
            label = { Text(text = "Product price *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            //-------WRITE THE SAVE LOGIC HERE---//
            var productRepository = ProductRepository(navController, context)
            productRepository.updateProduct(productname.text.trim(), productquantity.text.trim(), productprice.text.trim(),id)
        }) {
            Text(text = "Update")
        }


    }

}








@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun UpdateProductScreenPreview() {
    MyEcommerceCompanyTheme() {
        UpdateProductScreen(rememberNavController(),id = "")
    }

}