package org.example.kobweb_portfolio.components.sections.footer

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaEnvelope
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaInstagram
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedinIn

import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.example.kobweb_portfolio.components.sections.footer.components.SocialButton
import org.example.kobweb_portfolio.components.widgets.IconButton
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.example.kobweb_portfolio.toSitePalette
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.filter
import org.jetbrains.compose.web.css.px

val FooterStyle = CssStyle.base {
    Modifier
        .backgroundColor(colorMode.toSitePalette().nearBackground)
        .padding(topBottom = 1.5.cssRem, leftRight = 10.percent)
}

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun Footer(modifier: Modifier = Modifier) {
    Box(FooterStyle.toModifier().then(modifier).id("contact"), contentAlignment = Alignment.Center) {
        Column (modifier=Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
            val ctx = rememberPageContext()

            SpanText(text = "CONTACT ME",modifier = Modifier.margin(bottom = 20.px))

            Row {
                SocialEnums.entries.forEach {
                    SocialButton(
                        logo = it.iconName, iconCategory = it.iconCategory,
                        onClick = {ctx.router.navigateTo(it.link)}
                    )
                }

            }
        }
    }
}
