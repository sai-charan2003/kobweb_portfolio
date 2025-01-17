package org.example.kobweb_portfolio.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.traceEventEnd
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.WhiteSpace
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaEnvelope
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaInstagram
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedinIn
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant

import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.example.kobweb_portfolio.components.widgets.IconButton
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.dom.Span
import org.example.kobweb_portfolio.toSitePalette
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.filter
import org.jetbrains.compose.web.dom.Button

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
            val colormode = ColorMode.current
            val sitePalette = ColorMode.current.toSitePalette()
            SpanText(text = "CONTACT ME")

            Row {
                Box() {
                    IconButton(
                        onClick = { ctx.router.navigateTo("mailto:saicharannallapaneni@gmail.com") },

                        ) {
                        FaEnvelope()
                    }
                }

                Box() {
                    IconButton(
                        onClick = { ctx.router.navigateTo("https://www.linkedin.com/in/sai-charan-n-ab250b22a/") },

                        ) {
                        FaLinkedinIn()
                    }
                }

                Box() {
                    IconButton(
                        onClick = { ctx.router.navigateTo("https://twitter.com/saicharan2003") },

                        ) {
                        Image(
                            "/x-twitter.svg",
                            modifier = Modifier.styleModifier { filter { if (colormode.isDark) invert(1) else invert(0) } })


                    }

                }


                Box() {
                    IconButton(
                        onClick = { ctx.router.navigateTo("https://www.instagram.com/sai__charan.n/") },

                        ) {
                        FaInstagram()
                    }
                }
                Box() {
                    IconButton(
                        onClick = { ctx.router.navigateTo("https://github.com/sai-charan2003") },

                        ) {
                        FaGithub()
                    }
                }
            }
        }
    }
}
