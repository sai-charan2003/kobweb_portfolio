package org.example.kobweb_portfolio.components.sections.home.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.components.sections.header.components.ResumeButton
import org.example.kobweb_portfolio.styles.HeadlineTextStyle
import org.example.kobweb_portfolio.styles.ProfileNameStyle
import org.example.kobweb_portfolio.styles.SalutationStyle
import org.example.kobweb_portfolio.styles.SubheadlineTextStyle
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun Introduction(){
    Column(
        modifier = Modifier.fillMaxWidth().padding(2.cssRem),
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
            modifier = SalutationStyle.toModifier()
                .fillMaxWidth()
                .textAlign(TextAlign.Start)
        )
    }
}