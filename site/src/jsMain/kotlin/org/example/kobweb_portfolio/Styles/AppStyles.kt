package org.example.kobweb_portfolio.Styles

import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.functions.blur
import com.varabyte.kobweb.compose.css.functions.saturate
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.scale
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import com.varabyte.kobweb.silk.components.layout.HorizontalDividerStyle
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.init.registerStyleBase
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.addVariantBase
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.border
import com.varabyte.kobweb.silk.theme.colors.palette.color
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import com.varabyte.kobweb.silk.theme.modifyStyleBase
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.AlignItems

@InitSilk
fun initSiteStyles(ctx: InitSilkContext) {
    ctx.stylesheet.registerStyle("html") {
        cssRule(CSSMediaQuery.MediaFeature("prefers-reduced-motion", StylePropertyValue("no-preference"))) {
            Modifier.scrollBehavior(ScrollBehavior.Smooth)
        }
    }

    ctx.stylesheet.registerStyleBase("body") {
        Modifier
            .fontFamily(
                "-apple-system", "BlinkMacSystemFont", "Segoe UI", "Roboto", "Oxygen", "Ubuntu",
                "Cantarell", "Fira Sans", "Droid Sans", "Helvetica Neue", "sans-serif"
            )
            .fontSize(18.px)
            .lineHeight(1.5)
    }

    // Silk dividers only extend 90% by default; we want full width dividers in our site
    ctx.theme.modifyStyleBase(HorizontalDividerStyle) {
        Modifier.fillMaxWidth()
    }
}

val HeadlineTextStyle = CssStyle.base {
    Modifier
        .fontSize(3.cssRem)
        .textAlign(TextAlign.Start)
        .lineHeight(1.2) //1.5x doesn't look as good on very large text
}

val SubheadlineTextStyle = CssStyle.base {
    Modifier
        .fontSize(1.05.cssRem)
        .textAlign(TextAlign.Start)
        .color(colorMode.toPalette().color.toRgb().copyf(alpha = 0.8f))
}

val CircleButtonVariant = ButtonStyle.addVariantBase {
    Modifier.padding(0.px).borderRadius(50.percent)
}

val UncoloredButtonVariant = ButtonStyle.addVariantBase {
    Modifier.setVariable(ButtonVars.BackgroundDefaultColor, Colors.Transparent)
}
val BounceKeyframes = Keyframes {
    0.percent { Modifier.translateY(0.px) }
    50.percent { Modifier.translateY((-15).px) }  // Move up
    100.percent { Modifier.translateY(0.px) }
}
val NavHeaderStyle = CssStyle.base( extraModifier = { SmoothColorStyle.toModifier() }) {
    Modifier
        .fillMaxWidth()
        .padding(left = 1.cssRem, right = 1.cssRem, top = 1.cssRem, bottom = 1.cssRem)
        .fontSize(1.25.cssRem)
        .position(Position.Fixed)
        .top(0.percent)
        .backgroundColor(colorMode.toPalette().background.toRgb().copyf(alpha = 0.65f))
        .backdropFilter(saturate(180.percent), blur(5.px))
        .borderBottom(width = 1.px, style = LineStyle.Solid, color = colorMode.toPalette().border)
}

val SideMenuSlideInAnim = Keyframes {
    from {
        Modifier.translateX(100.percent)
    }

    to {
        Modifier
    }
}
@OptIn(ExperimentalComposeWebApi::class)
val GitHubButtonStyle = CssStyle.base {
    Modifier
        .color(Colors.White)
        .padding(12.px, 16.px)
        .borderRadius(6.px)
        .display(DisplayStyle.Flex)
        .alignItems(AlignItems.Center)
        .gap(8.px)
        .cursor(Cursor.Pointer)


}
val HoverButtonStyle = CssStyle {
    base {

        Modifier
            .border(1.px, LineStyle.Solid, Color.white)

            .background(Color.transparent)
            .color(Color.white)


            .cursor(Cursor.Pointer)

            .transition(Transition.Companion.group(properties = listOf(TransitionProperty.All), duration = 300.ms))
    }

    hover {
        Modifier
            .backgroundColor(Color.white)
            .color(Color.black)
    }
}
val ElevationButtonStyle = CssStyle {
    base {
        Modifier
            .transition(
                Transition.group(
                    properties = listOf(TransitionProperty.All),
                    duration = 300.ms,
                    timingFunction = TransitionTimingFunction.EaseInOut
                )
            )
    }
    hover {
        Modifier
            .cursor(Cursor.Pointer)
            .scale(1.15)
    }
}

var SectionTitleStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.XLarge)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.XLarge)
    }
}

var DescriptionStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.XSmall)

    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Small)

    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Medium)

    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.Large)

    }
}

var BadgeTextStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.XSmall)

    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Small)

    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Medium)

    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.Large)

    }

}

var ProjectCardStyle = CssStyle {
    base {
        Modifier.margin(1.px)

    }
    Breakpoint.SM {
        Modifier.margin(3.px)

    }
    Breakpoint.MD {
        Modifier.margin(5.px)

    }
    Breakpoint.LG {
        Modifier.margin(10.px)

    }

}

val PageContentStyle = CssStyle {
    base {
       Modifier.maxWidth(90.cssRem)
    }
    Breakpoint.MD {
        Modifier.maxWidth(80.cssRem)
    }
}

var ProfileNameStyle = CssStyle {
    base {
        Modifier.fontSize(1.5.cssRem)

    }
    Breakpoint.SM {
        Modifier.fontSize(2.cssRem)

    }
    Breakpoint.MD {
        Modifier.fontSize(3.cssRem)

    }
    Breakpoint.LG {
        Modifier.fontSize(3.cssRem)

    }

}

var SalutationStyle = CssStyle {
    base {
        Modifier.fontSize(1.cssRem)

    }
    Breakpoint.SM {
        Modifier.fontSize(1.cssRem)

    }
    Breakpoint.MD {
        Modifier.fontSize(1.1.cssRem)

    }
    Breakpoint.LG {
        Modifier.fontSize(1.2.cssRem)

    }

}

var AboutMeStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.Small)

    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Medium)

    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Medium)

    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.Large)

    }

}

var AboutMeColumnStyle = CssStyle {
    base {
        Modifier

    }
    Breakpoint.SM {
        Modifier.margin(leftRight = 2.px)

    }



}

