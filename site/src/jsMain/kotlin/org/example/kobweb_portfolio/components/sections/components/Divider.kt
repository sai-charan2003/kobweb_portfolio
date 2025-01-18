package org.example.kobweb_portfolio.components.sections.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.layout.HorizontalDivider
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.filter

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun Divider(colorMode: ColorMode) {
    HorizontalDivider(
        Modifier.styleModifier {
            filter { if (colorMode.isDark) color(Color.white) else color(Color.white) }
        }
    )
}