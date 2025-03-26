package org.example.kobweb_portfolio.components.sections.footer.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.Styles.ElevationButtonStyle
import org.example.kobweb_portfolio.components.widgets.IconButton
import org.jetbrains.compose.web.css.px

@Composable
fun SocialButton(logo: String,onClick: () -> Unit,iconCategory: IconCategory) {
    FaIcon(
        logo,
        ElevationButtonStyle.toModifier().margin(10.px).onClick {
            onClick()
        },
        iconCategory, size = IconSize.LG,
    )


}