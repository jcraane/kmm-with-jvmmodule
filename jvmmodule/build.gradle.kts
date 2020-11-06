import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
//    application
    kotlin("multiplatform")
}

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}


/*
application {
    mainClassName = "TestKt"
}
*/

kotlin {
    jvm()

    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":shared"))
            }
        }
    }
}
