package org.example.kobweb_portfolio.components.sections.experience

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBuilding
import com.varabyte.kobweb.silk.components.icons.fa.FaCalendar
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.example.kobweb_portfolio.Styles.*
import org.example.kobweb_portfolio.components.sections.components.SectionHeader
import org.example.kobweb_portfolio.components.sections.project.components.Badge
import org.jetbrains.compose.web.css.*


@Composable
fun ExperienceSection() {
    val techStack = listOf("Kotlin", "XML", "Retrofit", "MVVM")
    Column(
        modifier = AboutMeColumnStyle.toModifier()
            .width(100.percent)
            .padding(leftRight = 5.px, topBottom = 5.px)
            .height(100.vh)
            .id("experience"),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SectionHeader("Experience")

        SimpleGrid(
            modifier = Modifier
                .fillMaxWidth()
                .margin(top = 10.px)
                .padding(10.px)
                .borderRadius(8.px)
                .backgroundColor(Color("#131315")),
            numColumns = numColumns(base = 1, sm = 1)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        "/commons_logo.png",
                        modifier = Modifier
                            .size(30.px)
                            .borderRadius(15.px)
                            .margin(right = 10.px)
                    )
                    Column {
                        SpanText(
                            text = "Associate Software Developer",
                            modifier = DesignationStyle.toModifier()
                                .fontWeight(FontWeight.Bold)
                                .fontSize(16.px)
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .color(Color.dimgray),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            FaBuilding(modifier = Modifier.margin(right = 5.px))
                            SpanText(
                                text = "Platform Commons",
                                modifier = CompanyStyle.toModifier()
                                    .fontWeight(FontWeight.Medium)
                                    .margin(right = 5.px)
                            )
                            FaCalendar(
                                modifier = Modifier.margin(right = 5.px)
                            )
                            SpanText(
                                text = "March 2024 - Present",
                                modifier = CompanyStyle.toModifier()
                                    .fontWeight(FontWeight.Normal)
                            )
                        }
                    }
                }
                SpanText(
                    "Contributed to various mobile application projects, focusing on different aspects of development. " +
                            "This included improving application stability by addressing crash-related issues, " +
                            "optimizing offline synchronization mechanisms, and developing new features such as geofencing.",
                    modifier = WorkStyle.toModifier()
                        .margin(top = 10.px) // Reduce margin for mobile
                        .fontWeight(FontWeight.Medium)
                        .color(Color.dimgray)
                        .fontSize(14.px) // Smaller font size for readability
                )
                SimpleGrid (
                    numColumns = numColumns(base =2,sm=2, lg = 4),
                    modifier = Modifier.margin(top = 10.px)
                ) {
                    techStack.forEach {
                        Badge(
                            text = it,
                            modifier = Modifier.margin(right = 5.px, bottom = 5.px, top = 5.px)
                        )
                    }
                }
            }
        }
    }
}
