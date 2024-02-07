package org.example.kobweb_portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.icons.fa.FaPaperclip
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorScheme
import com.varabyte.kobweb.silk.theme.colors.SilkPalette
import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.example.kobweb_portfolio.Styles.AboutStyle
import org.example.kobweb_portfolio.components.layouts.PageLayout
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.core.rememberPageContext

object CustomColorSchemes {

    val BlackAndWhite = object : ColorScheme {
        override val _50 = Color.rgb(0XFFFFFF)
        override val _100 = Color.rgb(0XFFFFFF)
        override val _200 = Color.rgb(0XFFFFFF)
        override val _300 = Color.rgb(0XFFFFFF)
        override val _400 = Color.rgb(0XFFFFFF)
        override val _500 = Color.rgb(0X000000)
        override val _600 = Color.rgb(0X000000)
        override val _700 = Color.rgb(0X000000)
        override val _800 = Color.rgb(0X000000)
        override val _900 = Color.rgb(0X000000)
    }
}

@Composable

fun HomePage() {
    val ctx= rememberPageContext()

        Column (modifier= Modifier
            .width(100.percent)

            .height(100.vh)
            .id("home"),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(
                "/developer.png", modifier = Modifier.clip(Circle()).objectFit(ObjectFit.Fill), width = 200,
                height = 200,
            )

            SpanText(
                "Hi there, Welcome to my Portfolio",
                modifier = Modifier.fontSize(30.px).fontWeight(FontWeight.Normal).padding(bottom = 2.cssRem)
            )

            SpanText(
                "I'm Sai Charan",
                modifier = Modifier.fillMaxWidth().textAlign(TextAlign.Center).fontWeight(FontWeight.Bolder)
                    .fontSize(40.px),
            )
            Button(
                onClick = {
                          ctx.router.navigateTo("https://drive.google.com/file/d/1ewpI1d3f8qO3SNNB6DN9-Jk-IQrMdYK2/view")

                },
                colorScheme = CustomColorSchemes.BlackAndWhite,

                size = ButtonSize.LG,
                modifier = org.example.kobweb_portfolio.Styles.ButtonStyle.toModifier().margin(top = 70.px)
            ) {
                FaPaperclip()
                Text("Resume")
            }



        }


}