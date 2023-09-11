package com.example.myecommercecompany.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myecommercecompany.ui.theme.pages.SignUpScreen


import com.example.myecommercecompany.ui.theme.pages.home.HomeScreen
import com.example.myecommercecompany.ui.theme.pages.login.LoginScreen
import com.example.myecommercecompany.ui.theme.pages.products.ProductsScreen
import com.example.myecommercecompany.ui.theme.pages.products.MyFruitsScreen
import com.example.myecommercecompany.ui.theme.pages.products.OrderProductsScreen
import com.example.myecommercecompany.ui.theme.pages.products.UpdateProductScreen
import com.example.myecommercecompany.ui.theme.pages.products.ViewProductsScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = ROUTE_HOME
    ) {
        composable(route = BottomBarScreen.Home.route)
        {
            HomeScreen(navController)
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
        composable(ROUTE_SIGNUP) {
            SignUpScreen(navController)
        }
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_ODER_PRODUCTS) {
            OrderProductsScreen(navController)
        }
        composable(route = ROUTE_PRODUCTS){
            ProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCTS + "/id"){passedData->
            UpdateProductScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_PRODUCTS ){
            ViewProductsScreen(navController )
        }


    }
}