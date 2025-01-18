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
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

@Composable
fun AboutMeSection() {
    Column(
        modifier = AboutMeColumnStyle.toModifier()
            .width(100.percent)
            .margin(leftRight = 10.px, topBottom = 10.px)



            .height(100.vh)
            .id("aboutme"),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {

        SectionHeader("About Me")

        SpanText(text = "I am an Android developer with over 2 years of experience. " +
                "My expertise lies in crafting dynamic and visually engaging applications " +
                "using Jetpack Compose and Flutter, both built with a foundation in the Material UI design language. " +
                "I am on a continuous learning journey, " +
                "always seeking opportunities to enhance my skills and tackle new challenges.", modifier = AboutMeStyle.toModifier().fontWeight(
            FontWeight.Thin))


    }
}