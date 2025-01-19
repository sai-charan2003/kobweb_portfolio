package org.example.kobweb_portfolio.components.sections.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.Styles.SectionTitleStyle
import org.jetbrains.compose.web.css.px

@Composable
fun SectionHeader(title : String) {
    SpanText(
        title,
        modifier = SectionTitleStyle.toModifier()
            .fontWeight(FontWeight.Bold)
            .fontSize(40.px)
            .fillMaxWidth()
            .textAlign(TextAlign.Center)
            .margin(topBottom = 10.px)
    )
}