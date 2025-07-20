package org.example.kobweb_portfolio.components.sections.header

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext

import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.styles.NavHeaderStyle
import org.example.kobweb_portfolio.components.sections.header.components.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Text

@Composable
fun NavHeader() {
    val ctx= rememberPageContext()
    Row(NavHeaderStyle.toModifier()) {
        Text("Sai Charan")
        Spacer()
        Row(
            Modifier.gap(1.5.cssRem).displayIfAtLeast(Breakpoint.MD),
            verticalAlignment = Alignment.CenterVertically
        ) {
            menuItems()
            ResumeButton(ctx = ctx)
        }
        SideBar()
    }
}


