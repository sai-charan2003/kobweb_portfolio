package org.example.kobweb_portfolio.components.sections.aboutme

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.styles.AboutMeColumnStyle
import org.example.kobweb_portfolio.styles.AboutMeStyle
import org.example.kobweb_portfolio.components.sections.components.SectionHeader
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

@Composable
fun AboutMeSection() {
    Column(
        modifier = AboutMeColumnStyle.toModifier()
            .width(100.percent)
            .padding(leftRight = 10.px, topBottom = 10.px)
            .height(100.vh)
            .id("aboutme"),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {

        SectionHeader("About Me")

        SpanText(text = "I'm a skilled software developer specializing in cross-platform mobile application development," +
                " I possess expertise in Android development using Kotlin and Jetpack Compose, as well as cross-platform development with Flutter. " +
                "My proficiency extends to the Apple ecosystem, encompassing iOS and macOS development using Swift. Passionate about technology and dedicated to continuous learning, " +
                "I constantly explore emerging technologies and design trends.",
            modifier = AboutMeStyle.toModifier()
                .margin(top = 2.cssRem)


        )


    }
}