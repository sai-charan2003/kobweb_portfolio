package org.example.kobweb_portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorScheme

import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.clip

import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.CheckboxKind
import com.varabyte.kobweb.silk.components.icons.fa.FaAngleDown
import com.varabyte.kobweb.silk.components.icons.fa.FaIcon
import com.varabyte.kobweb.silk.components.icons.fa.IconCategory
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.BounceKeyframes
import org.example.kobweb_portfolio.HeadlineTextStyle
import org.example.kobweb_portfolio.SubheadlineTextStyle
import org.jetbrains.compose.web.css.*

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
fun homePage() {
    val ctx = rememberPageContext()

    SimpleGrid(
        modifier = Modifier
            .width(100.percent)
            .height(80.vh)
            .id("home"),
        numColumns = numColumns(base = 1, sm = 2)
    ) {
        // Left Section: Text Content
        Column(
            modifier = Modifier.fillMaxHeight().padding(2.cssRem),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            SpanText(
                "Hi there!",
                modifier = SubheadlineTextStyle.toModifier()
            )

            SpanText(
                "I'm Sai Charan",
                modifier = HeadlineTextStyle.toModifier()
            )
            SpanText(
                "Android & Swift Developer | Tech Enthusiast",
                modifier = Modifier.margin(top = 1.cssRem).fontSize(1.2.cssRem).color(Color.rgb(120, 120, 120))
            )
        }

        // Right Section: Profile Image
        Column(
            modifier = Modifier.fillMaxHeight().padding(2.cssRem),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.End
        ) {
            Image(
                "/developer.png",
                modifier = Modifier
                    .clip(Circle())
                    .objectFit(ObjectFit.Cover)
                    .width(250.px)
                    .height(250.px)
            )
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 1.cssRem)
            ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FaAngleDown(
            modifier = Modifier

                .animation(BounceKeyframes.toAnimation(
                    duration = 1.s,
                    iterationCount = AnimationIterationCount.Infinite
                ))
                .cursor(Cursor.Pointer)
                .onClick {
                    ctx.router.navigateTo("#aboutme")  // Scroll to the next section with id="about"
                }
        )

    }
}


