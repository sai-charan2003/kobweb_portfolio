package org.example.kobweb_portfolio.components.sections.home.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.AnimationIterationCount
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.icons.fa.FaAngleDown
import com.varabyte.kobweb.silk.style.animation.toAnimation
import org.example.kobweb_portfolio.Styles.BounceKeyframes
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.s

@Composable
fun ScrollDownArrow(ctx : PageContext){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 1.cssRem)
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FaAngleDown(
            modifier = Modifier

                .animation(
                    BounceKeyframes.toAnimation(
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