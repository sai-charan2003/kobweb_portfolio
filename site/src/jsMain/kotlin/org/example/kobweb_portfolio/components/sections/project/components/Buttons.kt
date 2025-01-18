package org.example.kobweb_portfolio.components.sections.project.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowUpRightFromSquare
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.Styles.ElevationButtonStyle
import org.jetbrains.compose.web.css.px

@Composable
fun GitHubButton(
    onClick : () -> Unit
) {
    FaGithub(
        modifier = ElevationButtonStyle.toModifier()
            .margin(left = 20.px)
            .onClick {
                onClick()
            }
        ,
        size = IconSize.LG
    )
}
@Composable
fun liveDemoButton(
    onClick: () -> Unit,
    modifier: Modifier
) {
    FaArrowUpRightFromSquare(
        modifier = ElevationButtonStyle.toModifier()
            .margin(left = 20.px)
            .onClick {
                onClick()
            }
        ,
        size = IconSize.LG

    )
}