package org.example.kobweb_portfolio.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import kotlinx.browser.document
import org.example.kobweb_portfolio.styles.PageContentStyle
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.percent
import org.example.kobweb_portfolio.components.sections.footer.Footer
import org.example.kobweb_portfolio.components.sections.header.NavHeader
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div


@Composable
fun PageLayout(title: String, content: @Composable ColumnScope.() -> Unit) {
    LaunchedEffect(title) {
        document.title = "Sai Charan"
    }

    Box(
        Modifier
            .fillMaxWidth()
            .minHeight(100.percent)
            .gridTemplateRows { size(1.fr); size(minContent) },
    ) {

        Column(
            Modifier.fillMaxSize().gridRow(1),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            NavHeader()

            Div(PageContentStyle.toAttrs()) {
                content()
            }
        }
        Footer(Modifier.fillMaxWidth().align(Alignment.BottomEnd).gridRow(2))



    }
}
