rootProject.name = "killrvideo-kotlin"
include("killrvideo-commons")


pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}
include("killrvideo-service-comments")
include("killrvideo-service-ratings")
include("killrvideo-service-search")
include("killrvideo-service-statistics")
include("killrvideo-service-sugestedvideo")
include("killrvideo-service-users")
include("killrvideo-service-videocatalog")
include("killrvideo-services")
