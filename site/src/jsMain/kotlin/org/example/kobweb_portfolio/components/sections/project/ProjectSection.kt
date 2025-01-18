package org.example.kobweb_portfolio.components.sections.project

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.example.kobweb_portfolio.components.sections.components.Divider
import org.example.kobweb_portfolio.components.sections.components.SectionHeader
import org.example.kobweb_portfolio.components.sections.project.components.ProjectCard
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
@Composable
fun ProjectsSection() {
    val colorMode = ColorMode.current
    val ctx = rememberPageContext()

    Column(
        modifier = Modifier
            .width(100.percent)

            .id("projects")
    ) {
        SectionHeader(title = "Projects")

        SimpleGrid(modifier = Modifier.margin(top = 2.cssRem), numColumns = numColumns(base = 1, sm = 2)) {
            ProjectItemsEnums.entries.forEach {
                ProjectCard(
                    it,
                    ctx
                )
//                if (it != ProjectItemsEnums.entries.last()){
//                    Divider(colorMode)
//                }

            }



        }
    }
}





