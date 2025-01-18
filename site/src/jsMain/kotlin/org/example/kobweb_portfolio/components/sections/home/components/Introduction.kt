package org.example.kobweb_portfolio.components.sections.home.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.Styles.HeadlineTextStyle
import org.example.kobweb_portfolio.Styles.ProfileNameStyle
import org.example.kobweb_portfolio.Styles.SalutationStyle
import org.example.kobweb_portfolio.Styles.SubheadlineTextStyle
import org.jetbrains.compose.web.css.cssRem

@Composable
fun Introduction(){
    Column(
        modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(2.cssRem),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpanText(
            "Hi there!",
            modifier = SubheadlineTextStyle.toModifier()
                .fillMaxWidth()
                .textAlign(TextAlign.Start)
        )

        SpanText(
            "I'm Sai Charan",
            modifier = ProfileNameStyle.toModifier()
                .fillMaxWidth()
                .textAlign(TextAlign.Start)
        )
        SpanText(
            "Android & Swift Developer | Tech Enthusiast",
            modifier = SalutationStyle.toModifier().color(Color.rgb(120, 120, 120))
                .fillMaxWidth()
                .textAlign(TextAlign.Start)
        )
    }
}