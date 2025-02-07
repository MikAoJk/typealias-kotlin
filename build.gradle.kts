group = "io.github.mikaojk"
version = "1.0.0"

plugins {
    kotlin("jvm") version "2.1.0"
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
    withType<Wrapper> {
        gradleVersion = "8.12"
    }
}

kotlin {
    jvmToolchain(21)
}