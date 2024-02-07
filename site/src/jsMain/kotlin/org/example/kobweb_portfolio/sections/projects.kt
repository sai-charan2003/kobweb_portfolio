package org.example.kobweb_portfolio.sections

import androidx.compose.runtime.Composable
import com.stevdza.san.kotlinbs.components.BSBadge
import com.stevdza.san.kotlinbs.models.BackgroundStyle
import com.stevdza.san.kotlinbs.models.BadgeVariant
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.color
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaDownload
import com.varabyte.kobweb.silk.components.layout.HorizontalDivider
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.Shape
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.example.kobweb_portfolio.Styles.Skillsbox
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Text


@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun projects(){
    val colormode=ColorMode.current
    val ctx= rememberPageContext()
    Column(
        modifier = Modifier
            .width(100.percent)

            .minHeight(100.vh)
            .id("projects"),


        ){
        SpanText("Projects",modifier = Modifier.fontWeight(FontWeight.Bold).fontSize(40.px).fillMaxWidth().textAlign(
            TextAlign.Center).margin(bottom = 10.px))
        SimpleGrid(modifier = Modifier

            .margin(top = 2.cssRem)
            ,numColumns = numColumns(base = 1, sm = 1),) {

                Column {
                    SpanText("FeedHub", modifier = Modifier.fillMaxWidth().textAlign(TextAlign.Center).fontWeight(
                        FontWeight.Bold))
                    Row(
                        modifier = Modifier.fillMaxWidth().margin(top = 10.px, bottom = 10.px),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        BSBadge(
                            text = "Kotlin",
                            modifier = Modifier.margin(right = 1.cssRem),
                            variant = BadgeVariant.Rounded,
                            style = BackgroundStyle.Success
                        )
                        BSBadge(
                            text = "Compose",
                            modifier = Modifier.margin(right = 1.cssRem),
                            variant = BadgeVariant.Rounded,
                            style = BackgroundStyle.Success
                        )
                        BSBadge(
                            text = "Gemini AI",
                            modifier = Modifier.margin(right = 1.cssRem),
                            variant = BadgeVariant.Rounded,
                            style = BackgroundStyle.Success
                        )
                        BSBadge(
                            text = "Supabase",
                            variant = BadgeVariant.Rounded,
                            style = BackgroundStyle.Success
                        )

                    }

                    SimpleGrid(modifier=Modifier.fillMaxSize(), numColumns = numColumns(base = 1, sm = 1)) {






                        Image("/feedhub.png", modifier = Modifier.fillMaxWidth().padding(10.px).fontWeight(FontWeight.Bold))
                        Column {
                            SpanText(
                                "Feed Hub is an RSS reader application that efficiently fetches and displays data from various RSS channels." +
                                        "The integration of Google Gemini AI enhances the user experience by providing summaries of articles." +
                                        "For user authentication and the storage of RSS feeds and bookmarks," +
                                        "Supabase is utilized as the backend.",
                                modifier = Modifier.fontWeight(FontWeight.Thin)
                                    .fontSize(15.px)
                                    .textAlign(TextAlign.Center)


                            )




                            Row(
                                modifier = Modifier.fillMaxSize().padding(all = 10.px),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Button(
                                    onClick = {
                                              ctx.router.navigateTo("https://github.com/sai-charan2003/FeedHub")


                                    },
                                    colorScheme = CustomColorSchemes.BlackAndWhite,

                                    size = ButtonSize.XS,
                                    modifier = org.example.kobweb_portfolio.Styles.ButtonStyle.toModifier()
                                        .margin(20.px)
                                ) {

                                    Text("Source Code")
                                }
                                Button(
                                    onClick = {
                                        ctx.router.navigateTo("https://github.com/sai-charan2003/FeedHub/releases/download/FeedHub-v2.1/app-release.apk")

                                    },
                                    colorScheme = CustomColorSchemes.BlackAndWhite,

                                    size = ButtonSize.XS,
                                    modifier = org.example.kobweb_portfolio.Styles.ButtonStyle.toModifier()
                                        .margin(20.px)
                                ) {
                                    FaDownload()

                                    Text("Download APK")
                                }
                            }
                        }



                }

                }
            HorizontalDivider(Modifier.styleModifier { filter { if (colormode.isDark) invert(1) else invert(0) } })


            Column {
                SpanText("Battery Tracker", modifier = Modifier.fillMaxWidth().textAlign(TextAlign.Center).fontWeight(
                    FontWeight.Bold))
                Row(
                    modifier = Modifier.fillMaxWidth().margin(top = 10.px, bottom = 10.px),
                    horizontalArrangement = Arrangement.Center
                ) {
                    BSBadge(
                        text = "Kotlin",
                        modifier = Modifier.margin(right = 1.cssRem),
                        variant = BadgeVariant.Rounded,
                        style = BackgroundStyle.Success
                    )
                    BSBadge(
                        text = "Compose",
                        modifier = Modifier.margin(right = 1.cssRem),
                        variant = BadgeVariant.Rounded,
                        style = BackgroundStyle.Success
                    )
                    BSBadge(
                        text = "Wear os",
                        modifier = Modifier.margin(right = 1.cssRem),
                        variant = BadgeVariant.Rounded,
                        style = BackgroundStyle.Success
                    )
                    BSBadge(
                        text = "Jetpack Glance",
                        variant = BadgeVariant.Rounded,
                        style = BackgroundStyle.Success
                    )

                }

                SimpleGrid(modifier=Modifier.fillMaxSize(), numColumns = numColumns(base = 1, sm = 1)) {






                    Image("/battery.png", modifier = Modifier.fillMaxWidth().padding(10.px))
                    Column {
                        SpanText(
                            "The Battery Tracker application employs the Android built-in battery manager API to " +
                                    "retrieve device battery metrics and displays them within the app. Additionally, " +
                                    "the app integrates the Jetpack Glance API to showcase battery information on a widget. Furthermore, " +
                                    "the MessageClient API is utilized to fetch battery details from Wear OS and seamlessly presents them on the widget.",
                            modifier = Modifier.fontWeight(FontWeight.Thin)
                                .fontSize(15.px)
                                .textAlign(TextAlign.Center)
                        )




                        Row(
                            modifier = Modifier.fillMaxSize().padding(all = 10.px),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Button(
                                onClick = {
                                          ctx.router.navigateTo("https://github.com/sai-charan2003/Battery-Tracker")

                                },
                                colorScheme = CustomColorSchemes.BlackAndWhite,

                                size = ButtonSize.XS,
                                modifier = org.example.kobweb_portfolio.Styles.ButtonStyle.toModifier()
                                    .margin(20.px)
                            ) {

                                Text("Source Code")
                            }
                            Button(
                                onClick = {
                                    ctx.router.navigateTo("https://github.com/sai-charan2003/Battery-Tracker/releases/download/battery_tracker_4.1/app-release.apk")

                                },
                                colorScheme = CustomColorSchemes.BlackAndWhite,

                                size = ButtonSize.XS,
                                modifier = org.example.kobweb_portfolio.Styles.ButtonStyle.toModifier()
                                    .margin(20.px)
                            ) {
                                FaDownload()

                                Text("Download APK")
                            }
                        }
                    }



                }

            }
            HorizontalDivider(Modifier.styleModifier { filter { if (colormode.isDark) invert(1) else invert(0) } })
            Column {
                SpanText("Syllabus Spot", modifier = Modifier.fillMaxWidth().textAlign(TextAlign.Center).fontWeight(
                    FontWeight.Bold))
                Row(
                    modifier = Modifier.fillMaxWidth().margin(top = 10.px, bottom = 10.px),
                    horizontalArrangement = Arrangement.Center
                ) {
                    BSBadge(
                        text = "Dart",
                        modifier = Modifier.margin(right = 1.cssRem),
                        variant = BadgeVariant.Rounded,
                        style = BackgroundStyle.Success
                    )
                    BSBadge(
                        text = "Flutter",
                        modifier = Modifier.margin(right = 1.cssRem),
                        variant = BadgeVariant.Rounded,
                        style = BackgroundStyle.Success
                    )
                    BSBadge(
                        text = "Firebase",
                        modifier = Modifier.margin(right = 1.cssRem),
                        variant = BadgeVariant.Rounded,
                        style = BackgroundStyle.Success
                    )


                }

                SimpleGrid(modifier=Modifier.fillMaxSize(), numColumns = numColumns(base = 1, sm = 1)) {






                    Image("/syllabus.png", modifier = Modifier.fillMaxWidth().padding(10.px))
                    Column {
                        SpanText(
                            "Syllabus Spot, a syllabus management app build using Flutter, " +
                                    "enabling users to conveniently access their academic syllabus across multiple platforms." +
                                    "Used Firebase to store syllabus data, enabling the app to fetch and display subject syllabi from Firebase when accessed by users.",
                            modifier = Modifier.fontWeight(FontWeight.Thin)
                                .fontSize(15.px)
                                .textAlign(TextAlign.Center)


                        )




                        Row(
                            modifier = Modifier.fillMaxSize().padding(all = 10.px),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Button(
                                onClick = {
                                    ctx.router.navigateTo("https://github.com/sai-charan2003/syllabus_spot")

                                },
                                colorScheme = CustomColorSchemes.BlackAndWhite,

                                size = ButtonSize.XS,
                                modifier = org.example.kobweb_portfolio.Styles.ButtonStyle.toModifier()
                                    .margin(20.px)
                            ) {

                                Text("Source Code")
                            }

                        }
                    }



                }

            }
            HorizontalDivider(Modifier.styleModifier { filter { if (colormode.isDark) color(Color.white) else color(Color.white) } })
            Column {
                SpanText("Sky Scan", modifier = Modifier.fillMaxWidth().textAlign(TextAlign.Center).fontWeight(
                    FontWeight.Bold).fontSize(30.px))
                Row(
                    modifier = Modifier.fillMaxWidth().margin(top = 10.px, bottom = 10.px),
                    horizontalArrangement = Arrangement.Center
                ) {
                    BSBadge(
                        text = "Kotlin",
                        modifier = Modifier.margin(right = 1.cssRem),
                        variant = BadgeVariant.Rounded,
                        style = BackgroundStyle.Success
                    )
                    BSBadge(
                        text = "Compose",
                        modifier = Modifier.margin(right = 1.cssRem),
                        variant = BadgeVariant.Rounded,
                        style = BackgroundStyle.Success
                    )
                    BSBadge(
                        text = "Retrofit",
                        modifier = Modifier.margin(right = 1.cssRem),
                        variant = BadgeVariant.Rounded,
                        style = BackgroundStyle.Success
                    )


                }

                SimpleGrid(modifier=Modifier.fillMaxSize(), numColumns = numColumns(base = 1, sm = 1)) {






                    Image("/skyscan.png", modifier = Modifier.fillMaxWidth())
                    Column {
                        SpanText(
                            "Sky Scan, a weather application developed using the Jetpack Compose framework," +
                                    "leverages the weather.com Rest API to deliver comprehensive weather information to " +
                                    "users.",
                            modifier = Modifier.fontWeight(FontWeight.Thin)
                                .fontSize(15.px)
                                .textAlign(TextAlign.Center)


                        )




                        Row(
                            modifier = Modifier.fillMaxSize().padding(all = 10.px),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Button(
                                onClick = {
                                    ctx.router.navigateTo("https://github.com/sai-charan2003/SkyScan")

                                },
                                colorScheme = CustomColorSchemes.BlackAndWhite,

                                size = ButtonSize.XS,
                                modifier = org.example.kobweb_portfolio.Styles.ButtonStyle.toModifier()
                                    .margin(20.px)
                            ) {

                                Text("Source Code")
                            }

                        }
                    }



                }

            }

        }
    }

}