package org.example.kobweb_portfolio.components.sections.project

enum class ProjectItemsEnums(
    val title: String,
    val shortDescription: String,
    val imageUrl: String,
    val logoUrl: String,
    val techStack: List<String>,
    val sourceCodeUrl: String,
    var liveLink : String? = null
) {
    FEED_HUB(
        title = "FeedHub",
        shortDescription = "FeedHub is an RSS reader built with Kotlin and Jetpack Compose, featuring a widget built with Jetpack Glance and AI-generated article summaries powered by Google Gemini.",
        imageUrl = "/feedhub.png",
        logoUrl = "/feedhublogo.png",
        techStack = listOf("Kotlin", "Compose", "Gemini AI", "Supabase"),
        sourceCodeUrl = "https://github.com/sai-charan2003/FeedHub"
    ),

    BATTERY_TRACKER(
        title = "Battery Tracker",
        shortDescription = "Battery Tracker is an Android application that has a widget to display battery information of the phone and connected devices such as Wear OS and headphones.",
        imageUrl = "/battery.png",
        logoUrl = "/batterytrackerlogo.png",
        techStack = listOf("Kotlin", "Compose", "Wear OS", "Jetpack Glance"),
        sourceCodeUrl = "https://github.com/sai-charan2003/Battery-Tracker"
    ),

    SYLLABUS_SPOT(
        title = "Syllabus Spot",
        shortDescription = "Syllabus Spot is a syllabus management app build using Flutter, enabling users to conveniently access their academic syllabus across multiple platforms.",
        imageUrl = "/syllabus.png",
        logoUrl = "/syllabusspotlogo.png",
        techStack = listOf("Dart", "Flutter", "Firebase"),
        sourceCodeUrl = "https://github.com/sai-charan2003/syllabus_spot"
    ),

    BOOKMARKER(
        title = "Bookmarker",
        shortDescription = "Bookmarker is a mobile app that allows users to save, manage, and sync website links with Google Drive for seamless access across devices.",
        imageUrl = "/bookmarker.png",
        logoUrl = "/bookmarkerlogo.png",
        techStack = listOf("Flutter", "Google Drive", "Material 3"),
        sourceCodeUrl = "https://github.com/sai-charan2003/Bookmarker"
    ),

    VERSION_TRACKER(
        title = "Version Tracker",
        shortDescription = "Version Tracker is an API designed for developers to manage app versions efficiently. It allows the app to compare the local version with the stored server version and seamlessly push updates to users.",
        imageUrl = "/appVersionTracker.png",
        logoUrl = "/versiontrackerlogo.png",
        techStack = listOf("Flutter", "Ktor", "Supabase"),
        sourceCodeUrl = "https://github.com/sai-charan2003/App-Version-Tracker-Frontend",
        liveLink = "https://version-tracker.vercel.app/"
    ),

    SETUP_BOX(
        title = "Setup Box",
        shortDescription = "SetupBox is a TV application built with Jetpack Compose, featuring a companion mobile app that lets users add TV channels with links and app package names to open specific apps.",
        imageUrl = "/setupboxscreenshots.png",
        logoUrl = "/setupboxLogo.png",
        techStack = listOf("Kotlin", "Compose", "Supabase"),
        sourceCodeUrl = "https://github.com/sai-charan2003/Setup-Box"
    ),

    QUICKMARK(
        title = "Quickmark",
        shortDescription = "QuickMark is a simple macOS bookmark manager built with SwiftUI, utilizing Core Data for local storage of bookmark data. It also features a menu bar icon for quickly adding bookmarks.",
        imageUrl ="/quickmark.png",
        logoUrl = "/quickmark_logo.png",
        techStack = listOf("Swift","Core Data"),
        sourceCodeUrl = "https://github.com/sai-charan2003/Quickmark"
    ),


}
