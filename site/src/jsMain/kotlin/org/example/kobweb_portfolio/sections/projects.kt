package org.example.kobweb_portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.color
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.HorizontalDivider
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.example.kobweb_portfolio.components.widgets.Badge
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun ProjectsSection() {
    val colorMode = ColorMode.current
    val ctx = rememberPageContext()

    Column(
        modifier = Modifier
            .width(100.percent)
            .minHeight(100.vh)
            .id("projects")
    ) {
        SectionHeader(title = "Projects")

        SimpleGrid(modifier = Modifier.margin(top = 2.cssRem), numColumns = numColumns(base = 1, sm = 1)) {
            ProjectCard(
                title = "FeedHub",
                description = "Feed Hub is an RSS reader application designed to fetch and display content from a wide " +
                "range of RSS channels. It integrates Google Gemini AI to enhance the user experience by generating concise summaries " +
                        "of articles. Supabase powers the backend, handling user authentication, and securely storing RSS feeds and bookmarks. " +
                        "Additionally, users can explore and search for RSS channels directly fro" +
                        "m Google News, making content discovery easier and more personalized.",
                imageUrl = "/feedhub.png",
                techStack = listOf("Kotlin", "Compose", "Gemini AI", "Supabase"),
                sourceCodeUrl = "https://github.com/sai-charan2003/FeedHub",
                ctx = ctx
            )

            Divider(colorMode)

            ProjectCard(
                title = "Battery Tracker",
                description = "The Battery Tracker application employs the Android built-in battery manager API to " +
                        "retrieve device battery metrics and displays them within the app. Additionally," +
                        "the app integrates the Jetpack Glance API to showcase battery information on a widget. Furthermore," +
                        "the MessageClient API is utilized to fetch battery details from Wear OS and seamlessly presents them on the widget.",
                imageUrl = "/battery.png",
                techStack = listOf("Kotlin", "Compose", "Wear OS", "Jetpack Glance"),
                sourceCodeUrl = "https://github.com/sai-charan2003/Battery-Tracker",
                ctx = ctx
            )

            Divider(colorMode)

            ProjectCard(
                title = "Syllabus Spot",
                description = "Syllabus Spot, a syllabus management app build using Flutter, " +
                        "enabling users to conveniently access their academic syllabus across multiple platforms." +
                        "Used Firebase to store syllabus data, enabling the app to fetch and display subject syllabi from Firebase when accessed by users.",
                imageUrl = "/syllabus.png",
                techStack = listOf("Dart", "Flutter", "Firebase"),
                sourceCodeUrl = "https://github.com/sai-charan2003/syllabus_spot",
                ctx = ctx
            )

            Divider(colorMode)

            ProjectCard(
                title = "Bookmarker",
                description = "Bookmarker is a mobile app that lets users save and manage website links with ease. It stores bookmarks locally and " +
                        "syncs them with Google Drive, allowing access from any device for seamless link management.",
                imageUrl = "/bookmarker.png",
                techStack = listOf("Flutter", "Google Drive", "Material 3"),
                sourceCodeUrl = "https://github.com/sai-charan2003/Bookmarker",
                ctx = ctx
            )

            Divider(colorMode)

            ProjectCard(
                title = "Version Tracker",
                description = "Version Tracker is an API designed for developers to manage app versions efficiently. It allows the app to compare the local version " +
                        "with the stored server version and seamlessly push updates to users." +
                        " The website is built with Flutter, featuring a backend powered by Ktor and a database hosted on Supabase.",
                imageUrl = "/appVersionTracker.png",
                techStack = listOf("Flutter", "Ktor", "Supabase"),
                sourceCodeUrl = "https://github.com/sai-charan2003/App-Version-Tracker-Frontend",
                ctx = ctx
            )
        }
    }
}

@Composable
fun SectionHeader(title: String) {
    SpanText(
        title,
        modifier = Modifier
            .fontWeight(FontWeight.Bold)
            .fontSize(40.px)
            .fillMaxWidth()
            .textAlign(TextAlign.Center)
            .margin(bottom = 10.px)
    )
}

@Composable
fun ProjectCard(
    title: String,
    description: String,
    imageUrl: String,
    techStack: List<String>,
    sourceCodeUrl: String,
    ctx: PageContext
) {
    Column {
        SpanText(
            title,
            modifier = Modifier
                .fillMaxWidth()
                .textAlign(TextAlign.Center)
                .fontWeight(FontWeight.Bold)
                .margin(topBottom = 20.px)
        )

        Row(
            modifier = Modifier.fillMaxWidth().margin(),
            horizontalArrangement = Arrangement.Center
        ) {
            techStack.forEach { tech ->
                Badge(text = tech, modifier = Modifier.margin(leftRight = 10.px))
            }
        }

        SimpleGrid(modifier = Modifier.fillMaxSize(), numColumns = numColumns(base = 1, sm = 1)) {
            Image(imageUrl, modifier = Modifier.fillMaxWidth().padding(10.px).borderRadius(20.px),)

            Column {

                    SpanText(
                        description,
                        modifier = Modifier
                            .fontWeight(FontWeight.Bold)
                            .fontSize(15.px)
                            .textAlign(TextAlign.Center)
                            .padding(10.px)
                    )



                Row(
                    modifier = Modifier.fillMaxSize().padding(all = 10.px),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = { ctx.router.navigateTo(sourceCodeUrl) },
                        colorScheme = CustomColorSchemes.BlackAndWhite,
                        size = ButtonSize.XS,
                        modifier = org.example.kobweb_portfolio.Styles.ButtonStyle.toModifier().margin(20.px)
                    ) {
                        Text("Source Code")
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun Divider(colorMode: ColorMode) {
    HorizontalDivider(
        Modifier.styleModifier {
            filter { if (colorMode.isDark) color(Color.white) else color(Color.white) }
        }
    )
}
