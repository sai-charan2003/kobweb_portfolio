package org.example.kobweb_portfolio.components.sections.home

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.components.sections.home.components.DeveloperPhoto
import org.example.kobweb_portfolio.components.sections.home.components.Introduction
import org.example.kobweb_portfolio.components.sections.home.components.ScrollDownArrow
import org.jetbrains.compose.web.css.*



@Composable
fun HomeSection() {
    SimpleGrid(
        modifier = Modifier
            .width(100.percent)
            .height(90.vh)
            .id("home")
            .margin(top = 10.px),
        numColumns = numColumns(base = 1, sm = 2)
    ) {

        Introduction()
        DeveloperPhoto()
    }
    ScrollDownArrow(ctx = rememberPageContext())


}


