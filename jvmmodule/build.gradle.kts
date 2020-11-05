import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm")
    kotlin("kapt")
}

application {
    mainClassName = "TestKt"
}

dependencies {
    implementation(project(":shared"))
//    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.10")
    /*implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.0-rc")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")*/
    implementation(kotlin("stdlib-jdk8"))
}
repositories {
    mavenCentral()
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
