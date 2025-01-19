package org.example.kobweb_portfolio.components.sections.aboutme

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.Styles.AboutMeColumnStyle
import org.example.kobweb_portfolio.Styles.AboutMeStyle
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

        SpanText(text = "Mobile developer focused on crafting impactful Android applications with a strong emphasis on " +
                "user experience and visual design. Proficient in creating intuitive interfaces using Jetpack Compose and Flutter, " +
                "adhering to Material Design principles. Currently expanding expertise in cross-platform " +
                "development with Swift and Kotlin Multiplatform. " +
                "Passionate about continuous learning and tackling challenging problems to deliver innovative solutions.",
            modifier = AboutMeStyle.toModifier()
                .margin(top = 2.cssRem)


        )


    }
}