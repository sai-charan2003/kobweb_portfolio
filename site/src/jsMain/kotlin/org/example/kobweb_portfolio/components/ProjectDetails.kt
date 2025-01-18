package org.example.kobweb_portfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
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
import org.example.kobweb_portfolio.Styles.ButtonStyle
import org.example.kobweb_portfolio.components.sections.project.components.Badge
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Composable
fun ProjectDetails(ctx : PageContext,title: String,imageURl:String,des:String,){
    Column {
        SpanText(title, modifier = Modifier.fillMaxWidth().textAlign(TextAlign.Center).fontWeight(
            FontWeight.Bold))
        Row(
            modifier = Modifier.fillMaxWidth().margin(top = 10.px, bottom = 10.px),
            horizontalArrangement = Arrangement.Center
        ) {
            Badge(
                text = "Kotlin",
                modifier = Modifier.margin(right = 1.cssRem),

                )
            Badge(
                text = "Compose",
                modifier = Modifier.margin(right = 1.cssRem),

                )
            Badge(
                text = "Gemini AI",
                modifier = Modifier.margin(right = 1.cssRem),

                )
            Badge(
                text = "Supabase",
                modifier = Modifier.margin(right = 1.cssRem),

                )

        }

        SimpleGrid(modifier= Modifier.fillMaxSize(), numColumns = numColumns(base = 1, sm = 1)) {






            Image("/feedhub.png", modifier = Modifier
                .fillMaxWidth()
                .padding(10.px)
                .fontWeight(FontWeight.Bold)
                .borderRadius(10.px))
            Column {
                SpanText(
                    "Feed Hub is an RSS reader application designed to fetch and display content from a wide " +
                            "range of RSS channels. It integrates Google Gemini AI to enhance the user experience by generating concise summaries " +
                            "of articles. Supabase powers the backend, handling user authentication, and securely storing RSS feeds and bookmarks. " +
                            "Additionally, users can explore and search for RSS channels directly fro" +
                            "m Google News, making content discovery easier and more personalized.",
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
                        modifier = ButtonStyle.toModifier()
                            .margin(20.px)
                    ) {

                        Text("Source Code")
                    }

                }
            }



        }

    }
}