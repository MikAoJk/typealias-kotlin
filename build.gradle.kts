group = "io.github.mikaojk"
version = "1.0.0"

val jdkVersion = 21

plugins {
    kotlin("jvm") version "2.1.20"
    id("application")
}

kotlin {
    jvmToolchain(jdkVersion)
}

application {
    mainClass.set("io.github.mikaojk.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks {
    withType<Test> {
        useJUnitPlatform {}
        testLogging {
            events("passed", "skipped", "failed")
            showStandardStreams = true
            showStackTraces = true
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        }
    }
}