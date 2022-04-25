import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20"
}

group = "fr.uiytt"
version = "0.2"

repositories {
    mavenCentral()
    maven(url = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
    maven(url = "https://jitpack.io")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.18.2-R0.1-SNAPSHOT")
    implementation(kotlin("stdlib-jdk17"))
    implementation("com.github.simplix-softworks:simplixstorage:3.2.4")
    implementation("fr.minuskube.inv:smart-invs:1.2.7")
}