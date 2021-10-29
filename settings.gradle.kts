pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if(requested.id.id == "com.android.library"){
                useModule("com.android.tools.build:gradle:${requested.version}")
            }
            if (requested.id.id == "com.android.application"){
                useModule("com.andorid.tools.build:gradle:${requested.version}")
            }
        }
    }

    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

}

rootProject.name = "Modular"
include (":app")
