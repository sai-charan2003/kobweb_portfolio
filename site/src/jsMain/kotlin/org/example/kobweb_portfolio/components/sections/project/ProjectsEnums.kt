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
        shortDescription = "An RSS reader with AI summaries and Supabase backend.",
        imageUrl = "/feedhub.png",
        logoUrl = "/feedhublogo.png",
        techStack = listOf("Kotlin", "Compose", "Gemini AI", "Supabase"),
        sourceCodeUrl = "https://github.com/sai-charan2003/FeedHub"
    ),

    BATTERY_TRACKER(
        title = "Battery Tracker",
        shortDescription = "Monitors battery health and displays data via widgets.",
        imageUrl = "/battery.png",
        logoUrl = "/batterytrackerlogo.png",
        techStack = listOf("Kotlin", "Compose", "Wear OS", "Jetpack Glance"),
        sourceCodeUrl = "https://github.com/sai-charan2003/Battery-Tracker"
    ),

    SYLLABUS_SPOT(
        title = "Syllabus Spot",
        shortDescription = "A syllabus management app built with Flutter, enabling cross-platform access to academic syllabi.",
        imageUrl = "/syllabus.png",
        logoUrl = "/syllabusspotlogo.png",
        techStack = listOf("Dart", "Flutter", "Firebase"),
        sourceCodeUrl = "https://github.com/sai-charan2003/syllabus_spot"
    ),

    BOOKMARKER(
        title = "Bookmarker",
        shortDescription = "A mobile app to save and manage website links, with Google Drive sync.",
        imageUrl = "/bookmarker.png",
        logoUrl = "/bookmarkerlogo.png",
        techStack = listOf("Flutter", "Google Drive", "Material 3"),
        sourceCodeUrl = "https://github.com/sai-charan2003/Bookmarker"
    ),

    VERSION_TRACKER(
        title = "Version Tracker",
        shortDescription = "An API to manage app versions, compare local and server versions, and push updates.",
        imageUrl = "/appVersionTracker.png",
        logoUrl = "/versiontrackerlogo.png",
        techStack = listOf("Flutter", "Ktor", "Supabase"),
        sourceCodeUrl = "https://github.com/sai-charan2003/App-Version-Tracker-Frontend",
        liveLink = "https://version-tracker.vercel.app/"
    ),

    SETUP_BOX(
        title = "Setup Box",
        shortDescription = "A TV app with real-time channel sync via Supabase, with a companion mobile app.",
        imageUrl = "/setupboxscreenshots.png",
        logoUrl = "/setupboxLogo.png",
        techStack = listOf("Kotlin", "Compose", "Supabase"),
        sourceCodeUrl = "https://github.com/sai-charan2003/Setup-Box"
    ),

    QUICKMARK(
        title = "Quickmark",
        shortDescription = "QuickMark is a simple macOS bookmark manager built with SwiftUI",
        imageUrl ="/quickmark.png",
        logoUrl = "/quickmark_logo.png",
        techStack = listOf("Swift","Core Data"),
        sourceCodeUrl = "https://github.com/sai-charan2003/Quickmark"
    ),


}
