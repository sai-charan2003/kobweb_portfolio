package org.example.kobweb_portfolio.components.sections.project.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.CustomColorSchemes
import org.example.kobweb_portfolio.Styles.DescriptionStyle
import org.example.kobweb_portfolio.Styles.ProjectImageStyle
import org.example.kobweb_portfolio.components.sections.project.ProjectItemsEnums
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Composable
fun ProjectCard(
    projectDetails: ProjectItemsEnums,
    ctx: PageContext
) {
    Box(
        modifier = Modifier
            .margin(10.px)
            .borderRadius(8.px)
            .backgroundColor(Color("#131315"))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(18.px),
        ) {
            Image(
                projectDetails.imageUrl,
                modifier = ProjectImageStyle.toModifier()
                    .fillMaxWidth()

                    .objectFit(ObjectFit.Cover)
                    .borderRadius(topLeft = 10.px, topRight = 10.px)
            )


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(left = 10.px, bottom = 20.px, top = 10.px, right = 10.px),
                verticalArrangement = Arrangement.spacedBy(18.px)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        projectDetails.logoUrl,
                        modifier = Modifier
                            .size(40.px)
                            .borderRadius(20.px)
                            .margin(right = 15.px)
                    )
                    SpanText(
                        projectDetails.title,
                        modifier = Modifier
                            .fontWeight(FontWeight.Bold)
                            .fontSize(24.px)
                    )
                    GitHubButton(
                        onClick = {
                            ctx.router.navigateTo(projectDetails.sourceCodeUrl)
                        }
                    )
                    if (projectDetails.liveLink != null) {
                        liveDemoButton(
                            modifier = Modifier.margin(left = 20.px),
                            onClick = {
                                ctx.router.navigateTo(projectDetails.liveLink!!)
                            }
                        )
                    }
                }


                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    projectDetails.techStack.forEach { tech ->
                        Badge(
                            text = tech,
                            modifier = Modifier.margin(right = 8.px)
                        )
                    }
                }


                SpanText(
                    projectDetails.shortDescription,
                    modifier = DescriptionStyle.toModifier()
                        .textAlign(TextAlign.Justify)

                )

            }
        }
    }
}