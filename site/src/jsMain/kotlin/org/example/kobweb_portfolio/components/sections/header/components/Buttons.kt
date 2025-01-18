package org.example.kobweb_portfolio.components.sections.header.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.icons.CloseIcon
import com.varabyte.kobweb.silk.components.icons.HamburgerIcon
import com.varabyte.kobweb.silk.components.icons.MoonIcon
import com.varabyte.kobweb.silk.components.icons.SunIcon
import com.varabyte.kobweb.silk.components.icons.fa.FaIcon
import com.varabyte.kobweb.silk.components.icons.fa.IconCategory
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.example.kobweb_portfolio.CustomColorSchemes
import org.example.kobweb_portfolio.Styles.ElevationButtonStyle
import org.example.kobweb_portfolio.components.widgets.IconButton
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Composable
fun closeButton(onClick: () -> Unit) {
    IconButton(onClick) {
        CloseIcon()
    }
}
@Composable
fun ColorModeButton() {
    var colorMode by ColorMode.currentState
    IconButton(onClick = { colorMode = colorMode.opposite },) {
        if (colorMode.isLight) MoonIcon() else SunIcon()
    }
}

@Composable
fun ResumeButton(ctx : PageContext) {
    Button(
        onClick = {
            ctx.router.navigateTo("https://drive.google.com/file/d/1cevEfQg7ttt5hPyXAzQkxEolP9KJM5s0/view")

        },
        colorPalette = CustomColorSchemes.BlackAndWhite,

        size = ButtonSize.SM,
        modifier = ElevationButtonStyle.toModifier()
    ) {
        FaIcon("paperclip", modifier = Modifier.padding(right = 5.px), IconCategory.SOLID,)

        Text("Resume")
    }
}

@Composable
fun hamburgerButton(onClick: () -> Unit) {
    IconButton(onClick) {
        HamburgerIcon()
    }
}