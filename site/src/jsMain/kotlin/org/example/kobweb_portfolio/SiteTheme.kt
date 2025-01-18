package org.example.kobweb_portfolio

import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.ColorScheme
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.color

/**
 * @property nearBackground A useful color to apply to a container that should differentiate itself from the background
 *   but just a little.
 */
class SitePalette(
    val nearBackground: Color,
    val cobweb: Color,
    val brand: Brand,
) {
    class Brand(
        val primary: Color = Color.rgb(0x3C83EF),
        val accent: Color = Color.rgb(0xF3DB5B),
    )
}

object SitePalettes {
    val light = SitePalette(
        nearBackground = Color.rgb(0xF4F6FA),
        cobweb = Colors.LightGray,
        brand = SitePalette.Brand(
            primary = Color.rgb(0x3C83EF),
            accent = Color.rgb(0xFCBA03),
        )
    )
    val dark = SitePalette(
        nearBackground = Color.rgb(0x13171F),
        cobweb = Colors.LightGray.inverted(),
        brand = SitePalette.Brand(
            primary = Color.rgb(0x3C83EF),
            accent = Color.rgb(0xF3DB5B),
        )
    )
}

fun ColorMode.toSitePalette(): SitePalette {
    return when (this) {
        ColorMode.LIGHT -> SitePalettes.light
        ColorMode.DARK -> SitePalettes.dark
    }
}

@InitSilk
fun initTheme(ctx: InitSilkContext) {
    ctx.theme.palettes.light.background = Color.rgb(0xFAFAFA)
    ctx.theme.palettes.light.color = Colors.Black
    ctx.theme.palettes.dark.background = Color.rgb(0x06080B)
    ctx.theme.palettes.dark.color = Colors.White
}

object CustomColorSchemes {

    val BlackAndWhite = object : ColorScheme {
        override val _50 = Color.rgb(0XFFFFFF)
        override val _100 = Color.rgb(0XFFFFFF)
        override val _200 = Color.rgb(0XFFFFFF)
        override val _300 = Color.rgb(0XFFFFFF)
        override val _400 = Color.rgb(0XFFFFFF)
        override val _500 = Color.rgb(0X000000)
        override val _600 = Color.rgb(0X000000)
        override val _700 = Color.rgb(0X000000)
        override val _800 = Color.rgb(0X000000)
        override val _900 = Color.rgb(0X000000)
    }
    val GitHubColors = object : ColorScheme {
        // Light blue shades
        override val _50 = Color.rgb(0xf8fafc)    // Lightest
        override val _100 = Color.rgb(0xf1f5f9)   // Lighter
        override val _200 = Color.rgb(0xdbe7fb)   // Default button state
        override val _300 = Color.rgb(0xccdcf7)   // Hover state
        override val _400 = Color.rgb(0xbdd1f3)   // Active/Click state
        override val _500 = Color.rgb(0x24292e)   // Text color
        override val _600 = Color.rgb(0x1f2428)   // Darker text
        override val _700 = Color.rgb(0x1b1f23)   // Dark mode elements
        override val _800 = Color.rgb(0x13161a)   // Dark mode background
        override val _900 = Color.rgb(0x0d1117)   // Darkest background
    }







}
