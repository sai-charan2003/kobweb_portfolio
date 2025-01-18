package org.example.kobweb_portfolio.components.sections.skills.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.MixBlendMode
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.mixBlendMode
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.px

@Composable
fun SkillLogo(imageSrc : String, title : String){
    Column {
        Image(
            src = imageSrc,
            modifier = Modifier.size(42.px)
                .styleModifier {
                    mixBlendMode(MixBlendMode.Normal)
                }
                .margin(10.px)
                .align(Alignment.CenterHorizontally)
        )
        SpanText(title,modifier= Modifier.fillMaxWidth().textAlign(TextAlign.Center))
    }
}