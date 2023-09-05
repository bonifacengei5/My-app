package com.example.myecommercecompany.navigations

import com.example.myecommercecompany.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {

    // for home
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.baseline_home_24,
        icon_focused = R.drawable.outline_add_home_24
    )

    // for report
    object MyFruits: BottomBarScreen(
        route = "myfruits",
        title = "Myfruits",
        icon = R.drawable.baseline_emoji_food_beverage_24,
        icon_focused = R.drawable.outline_emoji_food_beverage_24
    )

    // for report
    object Order: BottomBarScreen(
        route = "order",
        title = "Order",
        icon = R.drawable.baseline_attach_money_24,
        icon_focused = R.drawable.outline_attach_money_24
    )
    object Products: BottomBarScreen(
        route = "products",
        title = "products",
        icon = R.drawable.baseline_attach_money_24,
        icon_focused = R.drawable.outline_attach_money_24
    )


}
