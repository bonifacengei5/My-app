package com.example.myecommercecompany.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


import com.example.myecommercecompany.ui.theme.pages.home.HomeScreen
import com.example.myecommercecompany.ui.theme.pages.products.ProductsScreen
import com.example.myecommercecompany.ui.theme.pages.products.MyFruitsScreen
import com.example.myecommercecompany.ui.theme.pages.products.OrderProductsScreen
import com.example.myecommercecompany.ui.theme.pages.products.UpdateProductScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route)
        {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Order.route)
        {
            OrderProductsScreen(navController)
        }
        composable(route = BottomBarScreen.MyFruits.route)
        {
            MyFruitsScreen(navController)
        }
        composable(route = BottomBarScreen.Products.route)
        {
            ProductsScreen(navController)
        }
        composable(route = ROUTE_UPDATE_PRODUCTS){
            UpdateProductScreen(navController)
        }
        composable(route = ROUTE_PRODUCTS){
            ProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCTS ){
            UpdateProductScreen(navController)
        }

    }
}