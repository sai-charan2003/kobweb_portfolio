package org.example.kobweb_portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight

import com.varabyte.kobweb.compose.css.MixBlendMode
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.mixBlendMode
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column

import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.kobweb_portfolio.Styles.ExperienceStyle
import org.example.kobweb_portfolio.Styles.Skillsbox

import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Text

@Composable
fun Skills() {
    Column(
        modifier = Modifier.width(100.percent)


            .height(100.vh).id("skills").fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpanText(text = "Skills", modifier = Modifier.fontWeight(FontWeight.Bold).fontSize(40.px).margin(bottom = 30.px))



        SimpleGrid(
            modifier = Modifier.margin(top = 2.cssRem),
            numColumns = numColumns(base = 1,)
        ) {
            Skillsbox (
                modifier = Modifier.fillMaxWidth()
            ) {
                Column() {

                SimpleGrid(
                    modifier = Modifier,
                    numColumns = numColumns(base = 2, sm = 2, md = 2, lg = 8)
                ) {
                    Column {
                        Image(
                            src = "/c.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .margin(10.px)
                                .align(Alignment.CenterHorizontally)

                        )
                        SpanText("C++",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }








                    Column {
                        Image(
                            src = "/java.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .align(Alignment.CenterHorizontally)
                                .margin(10.px)
                        )
                        SpanText("Java",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }


                    Column {
                        Image(
                            src = "/kotlin.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .margin(10.px)
                                .align(Alignment.CenterHorizontally)
                        )
                        SpanText("Kotlin",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }

                    Column {
                        Image(
                            src = "/dart.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .margin(10.px)
                                .align(Alignment.CenterHorizontally)
                        )
                        SpanText("Dart",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }
                    Column {
                        Image(
                            src = "/compose.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .margin(10.px)
                                .align(Alignment.CenterHorizontally)
                        )
                        SpanText("Compose",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }








                    Column {
                        Image(
                            src = "/flutter.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .margin(10.px)
                                .align(Alignment.CenterHorizontally)
                        )
                        SpanText("Flutter",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }
                    Column {
                        Image(
                            src = "/Swift.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .margin(10.px)
                                .align(Alignment.CenterHorizontally)
                        )
                        SpanText("Swift",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }


                    Column {

                        Image(
                            src = "/kobweb.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .margin(10.px)
                                .align(Alignment.CenterHorizontally)
                        )
                        SpanText("Kobweb",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }









                    Column {
                        Image(
                            src = "/firebase.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .margin(10.px)
                                .align(Alignment.CenterHorizontally)
                        )
                        SpanText("Firebase",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }


                    Column {
                        Image(
                            src = "/postman.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .margin(10.px)
                                .align(Alignment.CenterHorizontally)
                        )
                        SpanText("Postman",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }
                    Column {
                        Image(
                            src = "/git.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .margin(10.px)
                                .align(Alignment.CenterHorizontally)
                        )
                        SpanText("Git",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }
                    Column {
                        Image(
                            src = "/ktor.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .margin(10.px)
                                .align(Alignment.CenterHorizontally)
                        )
                        SpanText("Ktor",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }
                    Column {
                        Image(
                            src = "/supabase.svg",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                                .margin(10.px)
                                .align(Alignment.CenterHorizontally)
                        )
                        SpanText("Supabase",modifier=Modifier.fillMaxWidth().textAlign(TextAlign.Center))
                    }


                    }
                }
                }


            }




            }


                }






