package org.example.kobweb_portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page

import org.example.kobweb_portfolio.components.layouts.PageLayout
import org.example.kobweb_portfolio.sections.About
import org.example.kobweb_portfolio.sections.ProjectsSection
import org.example.kobweb_portfolio.sections.Skills


@Page
@Composable
fun homePage() {
    PageLayout("Home") {
        Row(
            Modifier.
            fillMaxWidth()
                .id("home")
        ) {
            Box {

                Column {

                   org.example.kobweb_portfolio.sections.homePage()
                    About()
                    Skills()
                    ProjectsSection()
                }
            }
        }
    }

}
