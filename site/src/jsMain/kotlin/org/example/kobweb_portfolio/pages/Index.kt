package org.example.kobweb_portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page

import org.example.kobweb_portfolio.components.layouts.PageLayout
import org.example.kobweb_portfolio.components.sections.home.HomeSection
import org.example.kobweb_portfolio.components.sections.aboutme.AboutMeSection
import org.example.kobweb_portfolio.components.sections.project.ProjectsSection
import org.example.kobweb_portfolio.components.sections.skills.Skills


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

                   HomeSection()
                    AboutMeSection()
                    Skills()
                    ProjectsSection()
                }
            }
        }
    }

}
