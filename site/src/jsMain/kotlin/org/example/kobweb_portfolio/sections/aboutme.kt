package org.example.kobweb_portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.kobweb_portfolio.Styles.AboutStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

@Composable
fun About() {
    Column(
        modifier = Modifier
            .width(100.percent)


            .height(100.vh)
            .id("aboutme"),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {

        SpanText(text = "About me", modifier = Modifier.fontWeight(FontWeight.Bold).fontSize(40.px).margin(bottom = 30.px))

        SpanText(text = "I am an Android developer with over 2 years of experience. " +
                "My expertise lies in crafting dynamic and visually engaging applications " +
                "using Jetpack Compose and Flutter, both built with a foundation in the Material UI design language. " +
                "I am on a continuous learning journey, " +
                "always seeking opportunities to enhance my skills and tackle new challenges.", modifier = Modifier.fontWeight(
            FontWeight.Thin))


    }
}