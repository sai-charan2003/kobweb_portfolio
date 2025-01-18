package org.example.kobweb_portfolio.components.sections.header.components

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import org.example.kobweb_portfolio.components.sections.header.SideMenuEnums
import org.jetbrains.compose.web.css.cssRem

@Composable
fun SideBar() {
    Row(
        Modifier
            .fontSize(1.5.cssRem)
            .gap(1.cssRem)
            .displayUntil(Breakpoint.MD),
        verticalAlignment = Alignment.CenterVertically
    ) {
        var menuState by remember { mutableStateOf(SideMenuEnums.CLOSED) }


        hamburgerButton(onClick = { menuState = SideMenuEnums.OPEN })

        if (menuState != SideMenuEnums.CLOSED) {
            SideBarItems(
                menuState,
                close = { menuState = menuState.close() },
                onAnimationEnd = { if (menuState == SideMenuEnums.CLOSING) menuState = SideMenuEnums.CLOSED }
            )
        }
    }
}