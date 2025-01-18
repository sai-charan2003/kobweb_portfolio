package org.example.kobweb_portfolio.components.sections.skills

import androidx.compose.runtime.Composable

import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column

import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import org.example.kobweb_portfolio.components.sections.skills.components.SkillsBox
import org.example.kobweb_portfolio.components.sections.components.SectionHeader
import org.example.kobweb_portfolio.components.sections.skills.components.SkillLogo
import org.jetbrains.compose.web.css.*

@Composable
fun Skills() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.vh)
            .id("skills"),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionHeader("Skills")
            SimpleGrid(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        1.px, LineStyle.Solid
                    )
                    .borderRadius(r = 10.px)
                    .margin(top = 20.px),
                numColumns = numColumns(base = 2, sm = 2, md = 2, lg = 6)
            ) {
                SkillsEnums.entries.forEach {
                    SkillLogo(imageSrc = it.imageSRC, title = it.title)
                }
            }

    }
}







