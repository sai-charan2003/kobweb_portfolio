package org.example.kobweb_portfolio.components.sections.home.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column

import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun DeveloperPhoto() {
    val breakpoint = rememberBreakpoint()

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(2.cssRem),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <=    Breakpoint.SM) Alignment.CenterHorizontally else Alignment.End
    ) {
        Image(
            "/developer.png",
            modifier = Modifier
                .clip(Circle())
                .objectFit(ObjectFit.Cover)
                .width(250.px)
                .height(250.px)
        )
    }
}
