package org.example.kobweb_portfolio.components.sections.skills.components

import androidx.compose.runtime.Composable

import com.varabyte.kobweb.compose.css.CSSLengthNumericValue
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.MixBlendMode
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.mixBlendMode
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.BoxScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.*

@Composable
fun SkillsBox(
    modifier: Modifier = Modifier,
    roundedCorners: CSSLengthOrPercentageNumericValue = 10.px,
    borderWidth: CSSLengthNumericValue = 1.px,
    borderStyle: LineStyle = LineStyle.Solid,
    gradientDirection: LinearGradient.Direction = LinearGradient.Direction.ToBottomRight,
    startColor: CSSColorValue = rgba(r = 255, g = 255, b = 255, a = 0),
    endColor: CSSColorValue = rgba(r = 255, g = 255, b = 255, a = 0.06),
    blendMode: MixBlendMode = MixBlendMode.Normal,
    content: @Composable BoxScope.() -> Unit
) {

    Box(
        modifier = Modifier.fillMaxSize().then(modifier),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .margin(leftRight = 1.cssRem)
                .borderRadius(roundedCorners)
                .border(width = borderWidth, style = borderStyle, )
                .styleModifier {
                    mixBlendMode(blendMode)
                }
                .backgroundImage(
                    linearGradient(
                        gradientDirection,
                        startColor,
                        endColor
                    )
                )
        )
        content()
    }
}