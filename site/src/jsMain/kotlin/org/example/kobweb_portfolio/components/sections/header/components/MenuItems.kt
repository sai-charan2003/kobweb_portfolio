package org.example.kobweb_portfolio.components.sections.header.components

import androidx.compose.runtime.Composable
import org.example.kobweb_portfolio.components.sections.header.MenuItemsEnums

@Composable
fun menuItems() {
    MenuItemsEnums.entries.forEach {
        navLink(path = it.link, text = it.title)
    }

}