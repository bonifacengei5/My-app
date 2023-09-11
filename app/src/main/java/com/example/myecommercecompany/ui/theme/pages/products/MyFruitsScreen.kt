package com.example.myecommercecompany.ui.theme.pages.products

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myecommercecompany.R
import com.example.myecommercecompany.navigations.BottomBarScreen
import com.example.myecommercecompany.navigations.ROUTE_HOME
import com.example.myecommercecompany.navigations.ROUTE_ODER_PRODUCTS
import com.example.myecommercecompany.ui.theme.MyEcommerceCompanyTheme


@Composable
fun MyFruitsScreen(navController: NavHostController) {
    data class FruitModel(val name: String, val image: Int)

    @Composable
    fun ListRow(model: FruitModel) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = model.image),
                contentDescription = model.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = model.name,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = {
                        navController.navigate(ROUTE_ODER_PRODUCTS)
                    },
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text(text = "Oder")
                }
            }
        }
    }

    val fruitsList = mutableListOf<FruitModel>()
    fruitsList.add(FruitModel("Orange", R.drawable.orange))
    fruitsList.add(FruitModel("Banana", R.drawable.bananas640))
    fruitsList.add(FruitModel("Strawberry", R.drawable.strawberry))
    fruitsList.add(FruitModel("Mango", R.drawable.mangoes))

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(fruitsList) { model ->
            ListRow(model = model)
        }
    }
}








@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun MyFruitsScreenPreview() {
    MyEcommerceCompanyTheme(){
        MyFruitsScreen(rememberNavController())
    }

}