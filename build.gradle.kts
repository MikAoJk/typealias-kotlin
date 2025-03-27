group = "io.github.mikaojk"
version = "1.0.0"

plugins {
    kotlin("jvm") version "2.1.20"
    id("application")
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
    }
}

kotlin {
    jvmToolchain(21)
}