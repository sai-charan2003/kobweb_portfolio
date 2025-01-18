package org.example.kobweb_portfolio.components.sections.project.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.example.kobweb_portfolio.Styles.BadgeTextStyle
import org.example.kobweb_portfolio.Styles.DescriptionStyle
import org.example.kobweb_portfolio.Styles.SubheadlineTextStyle
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun Badge(modifier: Modifier, text: String) {
    val colormode = ColorMode.current
    Box(
        Modifier
            .margin(right = 15.px)
            .padding(topBottom = 5.px, leftRight = 10.px)
            .border { color(Colors.Transparent) }
            .borderRadius(20.px)

            .backgroundColor(if (colormode.isDark) Color("#27272A") else Color.black)
            .then(SubheadlineTextStyle.toModifier())
    ) {
        SpanText(
            text,
            BadgeTextStyle.toModifier().styleModifier {
                filter { if (colormode.isDark) Color.darkgray else color(Color.white) }
            }
        )
    }
}
