package org.example.kobweb_portfolio.components.sections.project

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowUpRightFromSquare
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.Styles.ElevationButtonStyle
import org.example.kobweb_portfolio.Styles.HoverButtonStyle
import org.example.kobweb_portfolio.Styles.ProjectCardStyle
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px

@Composable
fun MoreInGithubCard() {
    val ctx = rememberPageContext()

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .margin(10.px)
            .borderRadius(8.px)

            .backgroundColor(Color("#131315"))
            .onClick {
                ctx.router.navigateTo("https://github.com/sai-charan2003")

            }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .margin(10.px)

                ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            FaGithub(modifier = Modifier.margin(right = 10.px), size = IconSize.LG)
            SpanText("More on Github")


        }
    }
}