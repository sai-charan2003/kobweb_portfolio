package org.example.kobweb_portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.Text

@Composable
fun Badge(modifier: Modifier,text: String){
    val colormode= ColorMode.current
    Box(
        Modifier
            .margin(topBottom = 5.px, leftRight = 30.px)
            .padding(topBottom = 5.px, leftRight = 5.px)
            .border { color(Colors.Transparent) }
            .borderRadius(8.px)
            .backgroundColor(Colors.Green)
            .fontSize(15.px)
            .then(modifier)
    ) {
        SpanText(text)
    }


}