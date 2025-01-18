package org.example.kobweb_portfolio.components.sections.footer

import com.varabyte.kobweb.silk.components.icons.fa.IconCategory

enum class SocialEnums(val iconName : String , val link  :String,val iconCategory: IconCategory = IconCategory.BRAND) {

    EMAIL("envelope","mailto:saicharannallapaneni@gmail.com",IconCategory.REGULAR),
    LINKEDIN("linkedin-in","https://www.linkedin.com/in/sai-charan-n-ab250b22a/"),
    TWITTER("x-twitter","https://twitter.com/saicharan2003"),
    INSTAGRAM("instagram","https://www.instagram.com/sai__charan.n/"),
    GITHUB("github","https://github.com/sai-charan2003")
}